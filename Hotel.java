package com.selenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Hotel {


	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.edge.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Naveenproject\\src\\com\\navin\\Selenium\\driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("http://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);

		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("naveenkumar1234");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("naveen@1234");
		
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		
		
		WebElement location = driver.findElement(By.id("location"));
		Select ss = new Select(location);
		ss.selectByVisibleText("Paris");
		
		WebElement Hotels = driver.findElement(By.name("hotels"));
		Select sd = new Select(Hotels);
		sd.selectByVisibleText("Hotel Hervey");
		
		WebElement Room_type = driver.findElement(By.id("room_type"));
		Select rt = new Select(Room_type);
		rt.selectByVisibleText("Super Deluxe");
		
		Thread.sleep(1000);
		
		WebElement Room_nos = driver.findElement(By.id("room_nos"));
		Select rn = new Select(Room_nos);
		rn.selectByIndex(2);
		
		Thread.sleep(1000);
		
		WebElement Check_in = driver.findElement(By.id("datepick_in"));
		Check_in.clear();
		Check_in.sendKeys("22/11/2022");
		
		Thread.sleep(1000);
		
		WebElement Check_out = driver.findElement(By.id("datepick_out"));
		Check_out.clear();
		Check_out.sendKeys("24/11/2022");
		
		WebElement Adult_room = driver.findElement(By.name("adult_room"));
		Select ar = new Select(Adult_room);
		ar.selectByIndex(2);
		
		WebElement Child_room = driver.findElement(By.id("child_room"));
		Select cr = new Select(Child_room);
		cr.selectByIndex(1);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File ssa = ts.getScreenshotAs(OutputType.FILE);
		File sa = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Naveenproject\\src\\com\\navin\\Selenium\\Screen_shot\\hotel.jpeg");
		FileUtils.copyFile(ssa, sa);
		
		WebElement Search = driver.findElement(By.xpath("//input[@value='Search']"));
		Search.click();
		
		WebElement Select = driver.findElement(By.id("radiobutton_0"));
		Select.click();
		
		
		Thread.sleep(1000);
		
		TakesScreenshot tss = (TakesScreenshot)driver;
		File sss = tss.getScreenshotAs(OutputType.FILE);
		File saa = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Naveenproject\\src\\com\\navin\\Selenium\\Screen_shot\\hotel2.jpeg");
		FileUtils.copyFile(sss, saa);
		
		WebElement Continue = driver.findElement(By.xpath("//input[@value='Continue']"));
		Continue.click();
		
		Thread.sleep(1000);
		
		WebElement First_name = driver.findElement(By.id("first_name"));
		First_name.sendKeys("Naveen");
		
		WebElement Last_name = driver.findElement(By.id("last_name"));
		Last_name.sendKeys("kumar");
		
		WebElement Address = driver.findElement(By.id("address"));
		Address.sendKeys("No.10,Anna nagar,chenni-600000.");
		
		WebElement Card_num = driver.findElement(By.id("cc_num"));
		Card_num.sendKeys("1234567890123456");
		
		WebElement Card_type = driver.findElement(By.id("cc_type"));
		Select ct = new Select(Card_type);
		ct.selectByVisibleText("VISA");
		
		WebElement Exp_mon = driver.findElement(By.id("cc_exp_month"));
		Select em = new Select(Exp_mon);
		em.selectByIndex(7);
		
		Thread.sleep(1000);
		
		WebElement Exp_year = driver.findElement(By.id("cc_exp_year"));
		Select ey = new Select(Exp_year);
		ey.selectByVisibleText("2022");
		
		WebElement CVV = driver.findElement(By.id("cc_cvv"));
		CVV.sendKeys("123");
		
		Thread.sleep(1000);
		
		TakesScreenshot tsss = (TakesScreenshot)driver;
		File ssss = tsss.getScreenshotAs(OutputType.FILE);
		File saaa = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Naveenproject\\src\\com\\navin\\Selenium\\Screen_shot\\hotel3.jpeg");
		FileUtils.copyFile(ssss, saaa);
		
		WebElement Book_now = driver.findElement(By.id("book_now"));
		Book_now.click();		
		
		Thread.sleep(5000);
		
		TakesScreenshot tsts = (TakesScreenshot)driver;
		File s = tsts.getScreenshotAs(OutputType.FILE);
		File a = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Naveenproject\\src\\com\\navin\\Selenium\\Screen_shot\\hotel3.jpeg");
		FileUtils.copyFile(s, a);
		
		WebElement logout = driver.findElement(By.xpath("//a[@href='Logout.php']"));
		logout.click();
		
		TakesScreenshot t = (TakesScreenshot)driver;
		File sn = t.getScreenshotAs(OutputType.FILE);
		File an = new File("C:\\Users\\ELCOT\\eclipse-workspace\\Naveenproject\\src\\com\\navin\\Selenium\\Screen_shot\\hotel3.jpeg");
		FileUtils.copyFile(sn, an);
	}	
		
}