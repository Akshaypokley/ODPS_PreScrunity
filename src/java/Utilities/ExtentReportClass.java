package Utilities;

import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.Status;


import java.io.File;

import static Utilities.UtilityDirectory.driver;

/**
 * Created by akshay.pokley on 2/4/2019.
 */
public class ExtentReportClass extends getScreenshot {

    static ExtentHtmlReporter htmlReporter;

  static   ExtentReports extent;
    //helps to generate the logs in test report.
   static ExtentTest test;


    public static void startReport(String result) throws Exception {

        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/testReport.html");

        //initialize ExtentReports and attach the HtmlReporter
        extent = new ExtentReports (System.getProperty("user.dir") +"/test-output/STMExtentReport.html", true);
        //extent.addSystemInfo("Environment","Environment Name")
        extent
                .addSystemInfo("Host Name", "SoftwareTestingMaterial")
                .addSystemInfo("Environment", "Automation Testing")
                .addSystemInfo("User Name", "Rajkumar SM");

        //To add system or environment info by using the setSystemInfo method.

        //configuration items to change the look and feel
        //add content, manage tests etc
        htmlReporter.config().setChartVisibilityOnOpen(true);
        htmlReporter.config().setDocumentTitle("Extent Report Demo");
        htmlReporter.config().setReportName("Test Report");
        htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
        htmlReporter.config().setTheme(Theme.STANDARD);
        htmlReporter.config().setTimeStampFormat("EEEE, MMMM dd, yyyy, hh:mm a '('zzz')'");

        if(result.equals("FALL")) {

            test.log(LogStatus.FAIL, "Snapshot below: " + test.addScreenCapture("./Login/"+Screenshot(driver)));

        }
        else{
            test.log(LogStatus.PASS, "Snapshot below: " + test.addScreenCapture("./Login/"+Screenshot(driver)));
        }



        extent.flush();

    }
}