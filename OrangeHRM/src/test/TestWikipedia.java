package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestWikipedia {
	
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\gopik\\Downloads\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.wikipedia.org");
		WebElement link;
		link = driver.findElement(By.partialLinkText("English"));
		link.click();
		Thread.sleep(5000);
		WebElement searchBox;
		searchBox = driver.findElement(By.id("searchInput"));
		searchBox.sendKeys("software");
		searchBox.submit();
		Thread.sleep(5000);
				
	}

}
