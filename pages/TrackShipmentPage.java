package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import baseclass.BaseClass;

public class TrackShipmentPage extends BaseClass {
	
	public TrackShipmentPage verifyTeackShipmentPage() {
		String trackShipment = driver.getTitle();
		if (trackShipment.contains("Track Shipment")) {
			System.out.println("You have navigated to Track Shipment Page");
		} else {
			System.out.println("You are not in Track Shipment page ");
		}
		return this;
	}
	public TrackShipmentPage enterWaybillNo() throws InterruptedException {
		WebElement textbox1 = driver.findElement(By.xpath("//input[@id = 'Prefix1']"));
		String textBox1Value = textbox1.getAttribute("value");

		if (textBox1Value.equals("618")) {
			WebElement textbox2 = driver.findElement(By.xpath("//input[@id = 'Suffix1']"));
			textbox2.sendKeys("24160393");
			Thread.sleep(2000);
			textbox2Value = textbox2.getText();
		} else {
			WebElement textbox2 = driver.findElement(By.xpath("//input[@id = 'Suffix1']"));
			textbox2.sendKeys("24160393");
			driver.findElement(By.id("btnQuery")).click();

			WebElement awbNotFound = driver.findElement(By.xpath("//td[@class ='error-awb']"));
			String anf = awbNotFound.getText();
			System.out.println(anf);
		}
		return this;
	}
	
	public ShipmentDetailsPage clickSubmit() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.id("btnQuery")).click();
		Thread.sleep(1000);
		return new ShipmentDetailsPage();
	}

}
