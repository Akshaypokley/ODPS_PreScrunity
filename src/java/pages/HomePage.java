package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by akshay.pokley on 1/11/2019.
 */
public class HomePage {
WebDriver driver;
    @FindBy(xpath = "")
    WebElement HomepageLogo;

    @FindBy(xpath = "")
    WebElement NewPlanBtn;

    @FindBy(xpath = "")
    WebElement ResubmitBtn;

    @FindBy(xpath = "")
    WebElement ViewrepotBtn;

    public HomePage(WebDriver driver)
    { this.driver=driver;

        PageFactory.initElements(driver,this);
        if(!HomepageLogo.isDisplayed())
            throw new IllegalThreadStateException("This is not home page.");

    }

    public WebElement getHometitle() {
        return HomepageLogo;
    }

    public void ClickonNewPlan()
    {
        NewPlanBtn.click();
    }

    public void ClickonResubmitPlan()
    {
        ResubmitBtn.click();
    }

    public void ClickonViewReport()
    {
        ViewrepotBtn.click();
    }
}
