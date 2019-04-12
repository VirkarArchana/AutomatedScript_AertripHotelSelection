package aertrip_pkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class aertrip_Hotel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 System.setProperty("webdriver.chrome.driver","F:\\Automation\\chromedriver_win32(2)\\chromedriver.exe");
		 WebDriver wd = new ChromeDriver();
		 wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 wd.get("https://aertrip.com/Hotels/");
		 wd.findElement(By.id("hotels-module")).click();
         new WebDriverWait(wd, 20).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Check-out']")));
		 Thread.sleep(3000);
		 wd.findElement(By.id("autocomplete-js")).clear();
		 Thread.sleep(3000);
		 wd.findElement(By.id("autocomplete-js")).sendKeys("Navi Mumbai");
		 wd.findElement(By.xpath("//input[@placeholder='Check-in']")).click();
		 wd.findElement(By.xpath("//input[@placeholder='Check-in']")).clear();
		 Thread.sleep(3000);
		 wd.findElement(By.xpath("//td[@class='datepickerSunday']//a[@href='#']//span[contains(text(),'14')]")).click();
		 wd.findElement(By.xpath("//input[@placeholder='Check-out']")).click();
		 wd.findElement(By.xpath("//td[@class='datepickerSunday']//a[@href='#']//span[contains(text(),'21')]")).click();
		 wd.findElement(By.xpath("//button[@id='searchHotelButton']")).click();
	     Thread.sleep(3000);
		 wd.findElement(By.xpath("//div[@class='css-hotel-sorting css-sort-wrapper']//jq-popover[@class='css-sort-dropdown'] ")).click();
		 wd.findElement(By.xpath("//li[contains(text(),'Price - Low to High')]")).click();
		 wd.findElement(By.xpath("//div[@class='css-result-price-type css-sort-wrapper']//jq-popover[@class='css-sort-dropdown']")).click();
		 wd.findElement(By.xpath("//li[contains(text(),'Total')]")).click();
		 wd.findElement(By.xpath("//input[@placeholder='Search hotel name or landmark']")).sendKeys("Hotel Star Palace");
         Thread.sleep(5000);
		 wd.findElement(By.xpath("//div[@id='withinRange-hotels-js']//div[@class='css-hotel-detail-wrapper']")).click();
		 //wd.close();
		 
	}

}    

