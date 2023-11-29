package AdvSelinium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazonlinks {

	public static void main(String[] args) throws Throwable {
		//ChromeOptions opt = new ChromeOptions();
		//opt.addArguments("--remote-allow-origins=*");
		//ChromeDriver driver = new ChromeDriver(opt);
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\Amazon all links.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet("Sheet1");
		 List<WebElement> all = driver.findElements(By.xpath("//a"));
		 for(int i=0;i<all.size();i++)
		 {
			Row row = sh.getRow(i);
			Cell cell = row.getCell(0);
			cell.setCellValue(all.get(i).getAttribute("href"));
		 }
		 FileOutputStream fos=new FileOutputStream(".\\src\\test\\resources\\Amazon all links.xlsx");
         book.write(fos);
         book.close();
	}



	}


