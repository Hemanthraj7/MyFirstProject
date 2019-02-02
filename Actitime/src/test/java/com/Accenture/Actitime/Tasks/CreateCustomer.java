package com.Accenture.Actitime.Tasks;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Accenture.Actitime.BasePack.BaseClass;

public class CreateCustomer extends BaseClass {
  @Test
  public void testCreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
	 
	  int i2=xl.LastRow("Sheet2");
	  for (int i = 1; i < i2; i++) {
		  wd.findElement(By.xpath("//a[@href='/tasks/tasklist.do']")).click();
		  wd.findElement(By.xpath("//div[@class='addNewButton']")).click();
		  wd.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
		  String s3=xl.Data("Sheet2", i, 0);
		  String s4=xl.Data("Sheet2", i, 1);
		  wd.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys(s3);
		  wd.findElement(By.xpath("(//textarea[@class='textarea'])[8]")).sendKeys(s4);
		  wd.findElement(By.xpath("//div[@class='commitButtonPlaceHolder']")).click();
	}	  
  }
}
