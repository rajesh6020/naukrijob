package Util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class TestDataScript {

	
	public static String[][] getTestData(String filePath, String sheetName) throws BiffException, IOException{
		
		FileInputStream fis = null;
		Workbook wb = null;
		Sheet sh = null;
		String[][] strData = null;
		
		
		fis = new FileInputStream(filePath);
		wb = Workbook.getWorkbook(fis);
		sh = wb.getSheet(sheetName);
		
		int rowCount = sh.getRows();
		int colCount = sh.getColumns();
		
		strData = new String[rowCount-1][colCount];
		
		System.out.println(rowCount);
		System.out.println(colCount);
		
		for(int i=1; i<=rowCount-1; i++){
			for(int j=0; j<colCount; j++){
				strData[i-1][j]= sh.getCell(j, i).getContents();
			}
		}
		
		return strData;
	}
	
	
	
	
	
	public static void main(String[] args) throws Exception, IOException {
		
		
		/*String[] str = new String[]{"a", "b", "c"};
		
		String[][] str1 = new String[][]{{"a", "b", "c"}, {"d", "e", "f"}
				};
		
		System.out.println(str1[0][0]);
		System.out.println(str1[0][1]);
		System.out.println(str1[0][2]);
		
		System.out.println(str1[1][0]);
		System.out.println(str1[1][1]);
		System.out.println(str1[1][2]);*/
		
		
		String[][] storeData= getTestData("D:\\Automation\\TestData.xls", "Sheet1" );
		
		for(int i=0; i<storeData.length; i++){
			for(int j=0; j<storeData[i].length; j++){
				System.out.println(storeData[i][j]);
			}
		}
		
		

	}

}
