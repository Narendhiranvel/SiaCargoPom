package testcase;

import org.testng.annotations.Test;

import baseclass.BaseClass;
import pages.HomePage;

public class TC_0001 extends BaseClass {

	@Test
	public void runData() throws InterruptedException {
		HomePage hp = new HomePage();
		hp.clickTrackShipmentButton().verifyTeackShipmentPage().enterWaybillNo().clickSubmit().checkAwbNo();
	}

}
