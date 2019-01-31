package Utilities;

import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;

/**
 * Created by akshay.pokley on 1/31/2019.
 */
public class FullPageScreenshot {


    public static void PageScreenshot(WebDriver driver) throws Exception{
        Thread.sleep(2000);
        Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
        ImageIO.write(fpScreenshot.getImage(),"PNG",new File("FailedTestsScreenshots/FullPageScreenshot.png"));
    }
}
