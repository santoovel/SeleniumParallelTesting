package com.grid;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ChromeTest3 {
	
	@Test
	public void test3() throws Exception{
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		
		URL url = new URL("http://localhost:4444/wd/hub");
		
		RemoteWebDriver driver = new RemoteWebDriver(url,dc);

		driver.get("https://www.flipkart.com/");
		
		System.out.println("Flipkart Page title is : ===> "+ driver.getTitle());
		
		driver.quit();
	}
}
