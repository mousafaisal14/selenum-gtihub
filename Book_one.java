package moupro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
public class Book_one {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();
	       Thread.sleep(3000);
	       
	       driver.get("http://127.0.0.1:5500/index.html");
	       driver.manage().window().maximize();
	       

	       List<WebElement> myListOption = driver.findElements(By.tagName("option"));
	       for(int i = 0; i < myListOption.size(); i++) {
	    	   System.out.println(myListOption.get(i).getText());
	       }
	}

}
