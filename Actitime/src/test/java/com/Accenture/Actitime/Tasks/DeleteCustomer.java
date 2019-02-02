package com.Accenture.Actitime.Tasks;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.Accenture.Actitime.BasePack.BaseClass;

public class DeleteCustomer extends BaseClass{
  @Test
  public void testDeleteCustomer() throws InterruptedException {
	  wd.findElement(By.xpath("//a[@href='/tasks/tasklist.do']")).click();
	  String s6=xl.Data("Sheet2", 1, 0);
	  wd.findElement(By.xpath("//input[@placeholder='Start typing name ...']")).sendKeys(s6);
	  wd.findElement(By.xpath("//span[text()='"+s6+"']/../../..//div[@class='editButton']")).click();
	  Thread.sleep(3000);
	  wd.findElement(By.xpath("(//div[@class='actionButton'])[1]")).click();
	  wd.findElement(By.xpath("(//div[text()='Delete'])[2]")).click();
	  wd.findElement(By.xpath("//span[text()='Delete permanently']")).click();
  }
}
