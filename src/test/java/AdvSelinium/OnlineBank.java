package AdvSelinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class OnlineBank {

	public static void main(String[] args) {
		String id="210001";
		String pwd="password";
		WebDriver driver=new EdgeDriver();
		driver.get("http://rmgtestingserver/domain/Online_Banking_System/");
		Actions a=new Actions(driver);
		WebElement stafflogin = driver.findElement(By.linkText("Staff Login"));
		a.moveToElement(stafflogin).click().perform();
		driver.findElement(By.name("staff_id")).sendKeys(id);
		driver.findElement(By.cssSelector("[name='password']")).sendKeys(pwd);
		

	}

}
