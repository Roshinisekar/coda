package assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.hssf.record.BlankRecord;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;


import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;


public class Excel2Pdf {
	
	public static void main(String[] args) throws Exception{

		//read the excel file in binary format to fileinput stream
		FileInputStream input_document=new FileInputStream(new File("D:\\inv.xls"));

		//read workbook into hssfworkbook
		HSSFWorkbook my_xls_workbook=new HSSFWorkbook(input_document);

		//read worksheet into HSSFsheet
		HSSFSheet my_worksheet=my_xls_workbook.getSheetAt(0);

		//iterate over the rows
		Iterator<Row> rowIterator=my_worksheet.iterator();

		//create output pdf document objects
		Document iText_xls_2_pdf=new Document();
		PdfWriter.getInstance(iText_xls_2_pdf, new FileOutputStream("D:\\excelToPdf.pdf"));
		iText_xls_2_pdf.open();

		String p="Invoice";
		Paragraph in=new Paragraph(p);
		iText_xls_2_pdf.add(in);


		//create rows and column
		PdfPTable my_table=new PdfPTable(6);

		//add objects
		PdfPCell table_cell;

		while(rowIterator.hasNext()) {
		Row row=rowIterator.next();
		Iterator<Cell> cellIterator=row.cellIterator();
		while(cellIterator.hasNext()) {
		Cell cell=cellIterator.next();
		switch(cell.getCellType()) {
		case Cell.CELL_TYPE_STRING:
		table_cell=new PdfPCell(new Phrase(cell.getStringCellValue()));
		my_table.addCell(table_cell);
		break;

		case Cell.CELL_TYPE_NUMERIC:
		if(cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
		   String str = NumberToTextConverter.toText(cell.getNumericCellValue());
		   my_table.addCell(str);
		}
		break;

		// case Cell.CELL_TYPE_BLANK:
		// if (cell.getCellType()== Cell.CELL_TYPE_BLANK ){
		// String str = cell.toString();
//		    my_table.addCell(str);
		// }
		// break;

		}
		}
		}  

		String p1="total=760";
		Paragraph in1=new Paragraph(p1);
		iText_xls_2_pdf.add(in1);

		iText_xls_2_pdf.add(my_table);
		iText_xls_2_pdf.close();
		input_document.close();

		}


}
