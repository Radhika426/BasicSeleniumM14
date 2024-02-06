package testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EvenOrOddUsingDataProvider {
	
	@DataProvider(name="data")
	public Object[][] sender() throws EncryptedDocumentException, IOException {
		File file = new File("C:\\Users\\DELL\\Documents\\Data.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wbf = WorkbookFactory.create(fis);
		Sheet sheet = wbf.getSheet("Sheet1");
		int row = sheet.getPhysicalNumberOfRows();
		int column = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(row);
		System.out.println(column);
		Object[][] obj = new Object[row][column];
		for(int i=0; i<row;i++) {
			for(int j=0;j<column;j++) {
				obj[i][j]=sheet.getRow(i).getCell(j).toString();
			}
		}
		return obj;
	}
	
	@Test(dataProvider = "data")
	public void receiver(String d1,String d2) {
		int v1 = Integer.valueOf(d1);
		int v2 = Integer.valueOf(d2);
		System.out.println(v1);
		System.out.println(v2);
		
	}

}
