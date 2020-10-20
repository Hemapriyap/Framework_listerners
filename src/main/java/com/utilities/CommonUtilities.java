package com.utilities;

import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class CommonUtilities {
	public Object[][] readExcelAndReturnObject(String sFile) throws Exception{
		
		HSSFWorkbook myExcelBook = new HSSFWorkbook(new FileInputStream(sFile));
		//td_userpass
		HSSFSheet myExcleSheet = myExcelBook.getSheet("userdata");
		HSSFRow row1 = myExcleSheet.getRow(0);
		System.out.println(myExcleSheet.getPhysicalNumberOfRows());//To take total number of Rows
		//System.out.println(row1.getLastCellNum());
		int iCountCol =row1.getLastCellNum();
		int iCountRow = myExcleSheet.getPhysicalNumberOfRows();
		Object[][] excelData= new Object[iCountRow][iCountCol]; //Creating multi dimensional array
		for(int countRow=0;countRow<iCountRow;countRow++) {
			for(int countCol = 0; countCol<iCountCol;countCol++) {
			
				HSSFRow tempRow=myExcleSheet.getRow(countRow);
				String sTemp;
				try {
				sTemp=tempRow.getCell(countCol).getStringCellValue();
				}catch(Exception a) {
					sTemp=Double.toString(tempRow.getCell(countCol).getNumericCellValue());
				}
				excelData[countRow][countCol] = sTemp;
			}
	}
	return excelData;
	}

}
