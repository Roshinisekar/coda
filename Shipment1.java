package assignment;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Shipment1 {
	public static void main(String[] args) {
		LocalDate today=LocalDate.of(2020,1,5);
		LocalTime time=LocalTime.of(19,30);
		
		List<LocalDate> holidays=new ArrayList<>();
		holidays.add(LocalDate.of(2020,5,1));
		holidays.add(LocalDate.of(2020,1,26));
		holidays.add(LocalDate.of(2020,8,15));
		holidays.add(LocalDate.of(2020,1,1));
		
		System.out.println("Date of shipment:"+today.getDayOfMonth()+":"+today.getMonthValue()+":"+today.getYear()+":"+today.getDayOfWeek());
		System.out.println("Time of Shipment:"+time.getHour()+":"+time.getMinute());
		
		System.out.println("Deliverd day:"+countDays(today,today.plusDays(20),Optional.of(holidays))+" days");
		System.out.println("Delivery time:"+time.getHour()+":"+time.getMinute());
		
	}
	
	private static long countDays(LocalDate startDate,LocalDate endDate,Optional<List<LocalDate>>holidays) {
		
		if (startDate == null || endDate == null || holidays == null) {
            throw new IllegalArgumentException("Invalid method argument(s) to countBusinessDaysBetween(" + startDate
                    + "," + endDate + "," + holidays + ")");
        }
		 Predicate<LocalDate> isHoliday = date -> holidays.isPresent() ? holidays.get().contains(date) : false;
		 
	        Predicate<LocalDate> isWeekend = date -> date.getDayOfWeek() == DayOfWeek.SUNDAY;
	        
	        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
	        
	        long businessDays = Stream.iterate(startDate, date -> date.plusDays(1)).limit(daysBetween)
	                .filter(isHoliday.or(isWeekend).negate()).count();
	        return businessDays;
	        
		
	}

}
