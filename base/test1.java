package com.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class test1 {

	@SuppressWarnings("incomplete-switch")
	public static void main(String[] args) throws IOException {

		File file =new File("C:\\Users\\venky\\OneDrive\\Desktop\\selenium\\demoframe\\excelsheet\\adactin hotel.xlsx");
		FileInputStream fileinputstream =new FileInputStream(file);
		@SuppressWarnings("resource")
		Workbook workbook=new XSSFWorkbook(fileinputstream);
		org.apache.poi.ss.usermodel.Sheet sheet = workbook.getSheet("sheet1");
		Row row = sheet.getRow(2); 
		for(int i=0;i<row.getPhysicalNumberOfCells();i++) {
			Cell cells = row.getCell(i);
			CellType cellType = cells.getCellType();
			switch (cellType) {
			case STRING:
				String stringCellValue = cells.getStringCellValue();
				System.out.println(stringCellValue);
				break;
			case NUMERIC: 
				if(DateUtil.isCellDateFormatted(cells)) {
					Date dateCellValue = cells.getDateCellValue();
					SimpleDateFormat datetemp = new SimpleDateFormat("dd/MM/yyyy");
					String formattedCell = datetemp.format(dateCellValue);
					System.out.println(formattedCell);
				}else { 
					double numericCellValue = cells.getNumericCellValue();
					BigDecimal valueof=BigDecimal.valueOf(numericCellValue);
					long longValue = valueof.longValue();
					String valueOf2 = String.valueOf(longValue);
					System.out.println(valueOf2);

				}
                 Sheet createSheet = workbook.createSheet("newone");
                 Row createRow = createSheet.createRow(0);
                 Cell createCell = createRow.createCell(0);
                 createCell.setCellValue("fre");
                 FileOutputStream out=new FileOutputStream(file);
                 workbook.write(out);
			}}}
            
	
	
	           


}


