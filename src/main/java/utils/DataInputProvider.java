package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataInputProvider {
	@DataProvider(name="fetchData")
	public static String[][] getData(String SheetName) 
	{
		String testData[][]=null;
		try {
			FileInputStream fis=new FileInputStream("./testData/TestInputSheet.xlsx");
			XSSFWorkbook wb=new XSSFWorkbook(fis);
			XSSFSheet sheet=wb.getSheet(SheetName);
			int rowCount=sheet.getLastRowNum();
			int cellCount=sheet.getRow(0).getLastCellNum();
			
			System.out.println("Row count is:" +rowCount);
			System.out.println("Column count is: "+cellCount);
			testData=new String[rowCount][cellCount];
			for (int i=1;i<=rowCount;i++)
			{
				XSSFRow row=sheet.getRow(i);
				for(int j=0;j<cellCount;j++)
				{
					String cellData=row.getCell(j).getStringCellValue();
				
				System.out.println("The value of row " +i+ "and column value of " +j+ "is " +cellData);
				testData[i-1][j]=cellData
						   ;
			}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return testData;
		
	}

}
