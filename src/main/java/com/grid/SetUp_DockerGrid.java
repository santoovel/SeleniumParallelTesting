package com.grid;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class SetUp_DockerGrid {

	//@Test(priority=1)
	//Before starting/executing all the test cases we need to do docker compose up
	@BeforeTest
	void startDockerGrid() throws Exception {
		//to run docker-compose up
		Runtime.getRuntime().exec("cmd /c start start_dockergrid.bat");
		
		//wait for docker-compose up
		Thread.sleep(15000);
	}

	// @Test(priority=2)
	//After completion/executing all the test cases we need to do docker compose down
	@AfterTest
	void stopDockerGrid() throws Exception {
		
		//to run docker-compose down
		
		Runtime.getRuntime().exec("cmd /c start stop_dockergrid.bat");
		Thread.sleep(5000);
		
		//closed all command prompts which ever opened in our system
		
		Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
	}
}
