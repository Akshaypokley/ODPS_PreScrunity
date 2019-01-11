import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;

import static Utilities.UtilityDirectory.GetUrl;
import static Utilities.UtilityDirectory.openBrowser;

/**
 * Created by akshay.pokley on 1/11/2019.
 */
public class TestHomePage {

    WebDriver driver;

    @BeforeTest
    public void BeforeTest()
    {
         driver=  openBrowser("chrome");
         GetUrl("url");

    }

    @AfterTest
    public void AfterTest()
    {

    }

    @Test
    public void HPagetesting()
    {
        HomePage homePage=new HomePage(driver);
        try
        {
         String hometitel=homePage.getHometitle().getText();
         if(hometitel.equals(""))
         {
             System.out.println("Title of page same as excepted");
         }else {
             System.out.println("Title of page same as Not_excepted");
         }


        }catch (Throwable e)
        {

        }

    }
}
