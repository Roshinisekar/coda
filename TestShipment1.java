package assignment;

import static org.junit.Assert.*;

import org.junit.Test;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class TestShipment1 {

	
	@Test
	public void test1() {
		LocalDate today=LocalDate.of(2020,1,5);
		
		List<LocalDate> holidays=new ArrayList<>();
		holidays.add(LocalDate.of(2020,5,1));
		holidays.add(LocalDate.of(2020,1,26));
		holidays.add(LocalDate.of(2020,8,15));
		holidays.add(LocalDate.of(2020,1,1));
		
		long result=TestShipment1.countDays(today,today.plusDays(20),Optional.of(holidays));
		long excepted=17;
		long outcome=result;
		assertEquals(excepted,outcome);
		
		LocalTime time=LocalTime.of(19,30);
		assertEquals("19:30",time.getHour()+":"+time.getMinute());
		
	}
	
	@Test
	public void test2() {
		LocalDate today=LocalDate.of(2020,4,30);
		
		List<LocalDate> holidays=new ArrayList<>();
		holidays.add(LocalDate.of(2020,5,1));
		holidays.add(LocalDate.of(2020,1,26));
		holidays.add(LocalDate.of(2020,8,15));
		holidays.add(LocalDate.of(2020,1,1));
		
		long result=TestShipment1.countDays(today,today.plusDays(20),Optional.of(holidays));
		long excepted=16;
		long outcome=result;
		assertEquals(excepted,outcome);
		
		LocalTime time=LocalTime.of(11,50);
		assertEquals("11:50",time.getHour()+":"+time.getMinute());
		
	}
	
	@Test
	public void test3() {
		LocalDate today=LocalDate.of(2020,11,16);
		
		List<LocalDate> holidays=new ArrayList<>();
		holidays.add(LocalDate.of(2020,5,1));
		holidays.add(LocalDate.of(2020,1,26));
		holidays.add(LocalDate.of(2020,8,15));
		holidays.add(LocalDate.of(2020,1,1));
		
		long result=TestShipment1.countDays(today,today.plusDays(20),Optional.of(holidays));
		long excepted=18;
		long outcome=result;
		assertEquals(excepted,outcome);
		
		LocalTime time=LocalTime.of(5,35);
		assertEquals("5:35",time.getHour()+":"+time.getMinute());
		
	}
	
	@Test
	public void test4() {
		LocalDate today=LocalDate.of(2020,8,14);
		
		List<LocalDate> holidays=new ArrayList<>();
		holidays.add(LocalDate.of(2020,5,1));
		holidays.add(LocalDate.of(2020,1,26));
		holidays.add(LocalDate.of(2020,8,15));
		holidays.add(LocalDate.of(2020,1,1));
		
		long result=TestShipment1.countDays(today,today.plusDays(20),Optional.of(holidays));
		long excepted=16;
		long outcome=result;
		assertEquals(excepted,outcome);
		
		LocalTime time=LocalTime.of(22,45);
		assertEquals("22:45",time.getHour()+":"+time.getMinute());
		
	}
	
	@Test
	public void test5() {
		LocalDate today=LocalDate.of(2020,12,20);
		
		List<LocalDate> holidays=new ArrayList<>();
		holidays.add(LocalDate.of(2020,5,1));
		holidays.add(LocalDate.of(2020,1,26));
		holidays.add(LocalDate.of(2020,8,15));
		holidays.add(LocalDate.of(2020,1,1));
		holidays.add(LocalDate.of(2021,1,1));
		
		long result=TestShipment1.countDays(today,today.plusDays(20),Optional.of(holidays));
		long excepted=16;
		long outcome=result;
		assertEquals(excepted,outcome);
		
		LocalTime time=LocalTime.of(15,10);
		assertEquals("15:10",time.getHour()+":"+time.getMinute());
		
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
