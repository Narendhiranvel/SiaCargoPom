package baseclass;

import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
		public static EdgeDriver driver;
		public static String textbox2Value;
		
		@BeforeMethod
		public void precondition() {
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.siacargo.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
		
		@AfterMethod
		public void closeAlltabs() throws InterruptedException {
			Thread.sleep(1000);
			driver.close();
			driver.quit();
		}

	}
