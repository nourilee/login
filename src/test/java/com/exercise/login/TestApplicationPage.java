package com.exercise.login;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class TestApplicationPage{
		String driverPath = "C:\\configuration\\resources\\drivers\\";
		WebDriver driver;

        @Before
        public void setup(){
        	System.setProperty("webdriver.ie.driver", driverPath + "IEDriverServer.exe");
            driver = new InternetExplorerDriver();
    		driver.manage().window().maximize();
        }

        @Test
        public void loginAsAdmin() {

            //Create object of Page Class
            ApplicationPage login = new ApplicationPage(driver);

            //Check if page is loaded
            Assert.assertTrue(login.isPageLoaded());

            //Fill up credentials
            login.setUserName("admin");
            login.setPassword("admin");

            //Click on login button
            login.clickLogin();
        }

        @After
        public void close(){
            driver.close();
        }
    }
