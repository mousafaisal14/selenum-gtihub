package moupro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FirstAutoClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");

		String testemail = "mousa.manager";
		String testPass = "0000";

		WebDriver driver = new ChromeDriver();

		driver.get("https://web.stage.agentsoncloud.com");
		driver.get("http://127.0.0.1:5500/index.html");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"input-106\"]")).sendKeys(testemail);
		driver.findElement(By.xpath("//*[@id=\"input-109\"]")).sendKeys(testPass);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/div/div/div[2]/div/span/div/div/div/button"))
				.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(
				"/html/body/div[1]/div/div/div/div/div/div/div[2]/div/span/div/div[2]/div/div[1]/div/div/div/div[2]/div/div/div/div/div/input"))
				.click();

		List <WebElement> myListOfOptions = driver.findElements(By.tagName("option"));
		
		for(int i = 0; i < myListOfOptions.size(); i++) {
			System.out.println("hi");
			
			
		}
	}
	}


