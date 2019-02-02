package com.Accenture.Actitime.BasePack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	public WebDriver wd;
	public XlData xl;
@BeforeClass
  	public void OpenBrowser() {
	System.setProperty("webdriver.chrome.driver", "E:\\MavenProject\\Browsers\\chromedriver.exe");  
	wd=new ChromeDriver();
	wd.manage().window().maximize();
	wd.get("https://demo.actitime.com/login.do");
	wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
  }
@BeforeMethod
	public void Login(){
		xl=new XlData();
		String s1=xl.Data("Sheet1", 1, 0);
		String s2=xl.Data("Sheet1", 1, 1);
		wd.findElement(By.id("username")).sendKeys(s1);
		wd.findElement(By.xpath("//input[@name='pwd']")).sendKeys(s2);
		wd.findElement(By.id("loginButton")).click();	 
//	 	String Exptitle="https://demo.actitime.com/user/submit_tt.do";
//		 String Acttitle=wd.getCurrentUrl();
//		 Assert.assertEquals(Acttitle, Exptitle);
 }
@AfterMethod
	public void Logout() throws InterruptedException{
	Thread.sleep(3000);
	wd.findElement(By.xpath("//a[text()='Logout']")).click();
 }
@AfterClass
	public void CloseBrowser(){
	  wd.close();
  }
}
