package com.actitimeautomation;

import com.actitimeautomation.common.BaseClass;
import com.actitimeautomation.common.CommonUtil;
import com.actitimeautomation.common.ExtentReportUtil;
import com.actitimeautomation.common.PropertyHandling;
import com.actitimeautomation.pages.CustomerPage;
import com.actitimeautomation.pages.LoginPage;
import com.actitimeautomation.pages.ProjectPage;
import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TaskTest extends BaseClass
{
        WebDriver driver;
        PropertyHandling propertyHandling;
        CustomerPage customerPage;
        LoginPage loginPage;
        ProjectPage projectPage;
        CommonUtil commonUtil;

        @BeforeClass
        public void setup(ITestContext context) throws Exception {
            propertyHandling = new PropertyHandling();
            String browser = propertyHandling.getProperty("browser");
            launchBrowser(browser);
            driver = super.driver;
            String url = propertyHandling.getProperty("actitimeUrl");
            driver.get(url);
            loginPage = new LoginPage(driver);
            String username = propertyHandling.getProperty("username");
            String password = propertyHandling.getProperty("password");
            loginPage.login(username, password);
            customerPage = new CustomerPage(driver);
            projectPage = new ProjectPage(driver);
            commonUtil = new CommonUtil(driver);
            //set the driver context
            context.setAttribute("webDriver", driver);
        }
        @Test
        public void verifyCreateTask ()
        {
            System.out.println("The additional test method");

            //1 create custometer
            //2. create project
            //3. create task
        }
    }

