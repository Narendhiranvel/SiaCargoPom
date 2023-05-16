package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclass.BaseClass;

public class ShipmentDetailsPage extends BaseClass {
	
	public ShipmentDetailsPage checkAwbNo() {
		WebElement awbNo = driver.findElement(By.xpath("//td[@class= 'size-14']"));
		String awbText = awbNo.getText();

		if (awbText.contains(textbox2Value)) {
			System.out.println(awbText + " Verified Successfully (AWB number and Air Waybill 1 number are same)");
		} else {
			System.out.println("Verification unsuccessful");
		}
		return this;
	}
	
//	public void clickNewSearch() throws InterruptedException {
//		Thread.sleep(1000);
//		driver.findElement(By.id("btnSearchAgain")).click();
//		Thread.sleep(1000);
//	}

}
