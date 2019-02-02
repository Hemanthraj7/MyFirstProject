package com.Accenture.Actitime.BasePack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class XlData {
	public String  Data(String sheet,int row,int cell){
		try {
			FileInputStream fis=new FileInputStream("E:\\MavenProject\\XLData\\Excel.xlsx");
			Workbook wbk=WorkbookFactory.create(fis);
			Sheet st=wbk.getSheet(sheet);
			Row r=st.getRow(row);
			Cell c=r.getCell(cell);
			String d1=c.getStringCellValue();
			return d1;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {		
			e.printStackTrace();
		} catch (IOException e) {			
			e.printStackTrace();
		}
		return sheet;
	}
	public int LastRow(String sheet) throws EncryptedDocumentException, IOException{
		FileInputStream fis=new FileInputStream("E:\\MavenProject\\XLData\\Excel.xlsx");
		Workbook wbk=WorkbookFactory.create(fis);
		Sheet st=wbk.getSheet(sheet);
		int i=st.getLastRowNum();
		return i;
		
	}
}
	