package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by akshay.pokley on 2/1/2019.
 */
public class Validationfun {

    public static void ValdFun(WebDriver driver)
    {
        Newplan newplan=new Newplan(driver);
        newplan.ClickSubmitBtn();
    }
}
