package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;

import constant.Constant;

public class Excelutility {
		
		static FileInputStream f; 
	 	static XSSFWorkbook w; 
	 	static XSSFSheet s;  
	 	 
	 	public static String getStringData(int a,int b,String sheet) throws IOException 
	 	{ 
	 		f=new FileInputStream(Constant.TESTDATA); 
	 		w=new XSSFWorkbook(f); 
	 		s=w.getSheet(sheet); 
	 		XSSFRow r=s.getRow(a); 
	 		XSSFCell c=r.getCell(b); 
	 		 DataFormatter formatter = new DataFormatter();

	         return formatter.formatCellValue(c);
	 	} 
	 	public static int getIntegerData(int a,int b,String sheet) throws IOException  
	 	{ 
	 		f=new FileInputStream(Constant.TESTDATA); 
	 		w=new XSSFWorkbook(f); 
	 		s=w.getSheet(sheet); 
	 		XSSFRow r=s.getRow(a); 
	 		XSSFCell c=r.getCell(b); 
	 		int y=(int) c.getNumericCellValue();//type casting 
	 		return y;
	 	
	 		
	 		//return String.valueOf(y); 
	 	}

	}



