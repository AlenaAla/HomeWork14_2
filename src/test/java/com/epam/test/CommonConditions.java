package com.epam.test;


import com.epam.taf.driver.DriverSingleton;
import com.epam.taf.util.TestListener;
import com.epam.reportportal.testng.ReportPortalTestNGListener;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;

@Listeners(ReportPortalTestNGListener.class)
public class CommonConditions {



    //@BeforeMethod(description = "init browser")//added within module9
    public void setUp() {

    }

    @AfterMethod(alwaysRun = true)
    public void stopBrowser() {
        DriverSingleton.closeDriver();

    }
}
