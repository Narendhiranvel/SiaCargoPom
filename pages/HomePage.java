package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import baseclass.BaseClass;

public class HomePage extends BaseClass {
	
	public TrackShipmentPage clickTrackShipmentButton() throws InterruptedException {
		String homePage = driver.getTitle();
		System.out.println("You are in -" + homePage + "- home page");
		driver.findElement(By.xpath("(//span[@class='icon-tag'])[2]")).click();
		Set<String> trackShipWindow = driver.getWindowHandles();
		List<String> trackShipWindow2 = new ArrayList<String>(trackShipWindow);
		driver.switchTo().window(trackShipWindow2.get(1));
		Thread.sleep(1000);
		return new TrackShipmentPage();
	}

}
