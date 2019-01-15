package pages;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by akshay.pokley on 1/14/2019.
 */
public class Newplan {

WebDriver driver;

@FindBy(xpath = ".//*[@id='imglogo']")
WebElement NeplanLogo;

    @FindBy(xpath = "//div/select[@name='cboAuthority']")
    WebElement Authority;

    @FindBy(xpath = "//div/select[@name='CboTypeofcase']")
    WebElement TypeofCase;

    @FindBy(xpath = "//div/select[@name='cboPermisiontype']")
    WebElement PermissionType;

    @FindBy(xpath = "//div/select[@name='cboDevelopmentarea']")
    WebElement Development_Area;

    @FindBy(xpath = "//div/select[@name='CboZone']")
    WebElement Zone;
    @FindBy(xpath = "//div/select[@name='cboBaselandusezone']")
    WebElement BaseLandUsZone;
    @FindBy(xpath = "//div/select[@name='CboSpecialcontrolArea']")
    WebElement SpecialControlArea;
    @FindBy(xpath = "//div/input[@name='txtdistrict']")
    WebElement District;
    @FindBy(xpath = "//div/input[@name='txtTaluka']")
    WebElement Taluka;
    @FindBy(xpath = "//div/input[@name='txtvillage']")
    WebElement Village;
    @FindBy(xpath = "//div/input[@name='txtvillagersno']")
    WebElement BlockNo;
    @FindBy(xpath = "//div/input[@name='txtCitysurveywardno']")
    WebElement WardNo;
    @FindBy(xpath = "//div/input[@name='txtAbductRoadMaxWidth']")
    WebElement AbductingRoadMaxWidth;
    @FindBy(xpath = "//div/input[@name='txtTenement']")
    WebElement TenementPropertyNo;

    @FindBy(xpath = "//div/input[@name='txtTtpsNNO']")
    WebElement TPSNameandNo;
    @FindBy(xpath = "//div/input[@name='txtOpno']")
    WebElement OPNo;
    @FindBy(xpath = "//div/input[@name='txtFpno']")
    WebElement  FPNo;
    @FindBy(xpath = "//div/input[@name='txtsubplotno']")
    WebElement  SubPlotNo;
    @FindBy(xpath = "//div/input[@name='txtSectorno']")
    WebElement SectorNo;
    @FindBy(xpath = "//div/input[@name='txtApplicant']")
    WebElement Name;
    @FindBy(xpath = "//div/textarea[@name='txtAddress']")
    WebElement Address;
    @FindBy(xpath = "//div/input[@name='txtMobileNum']")
    WebElement MobileNumber;

    @FindBy(xpath = "//div/input[@name='txtEmailidowner']")
    WebElement  EmailID;
    @FindBy(xpath = "//div/input[@name='txtArchLicencenum']")
    WebElement ALicenseNumber;
    @FindBy(xpath = "//div/input[@name='txtArchName']")
    WebElement AName;
    @FindBy(xpath = "//div/input[@name='txtarchemail']")
    WebElement AEmailID;
    @FindBy(xpath = "//div/input[@name='txtArchMobile']")
    WebElement AMobile;

    @FindBy(xpath = "//div/input[@name='txtStructLicense']")
    WebElement SLicenseNumber;
    @FindBy(xpath = "//div/input[@name='txtStructName']")
    WebElement SName;
    @FindBy(xpath = "//div/input[@name='txtstructemail']")
    WebElement SEmailID;
    @FindBy(xpath = "//div/input[@name='txtStructMobile']")
    WebElement SMobile;

    @FindBy(xpath = "//div//input[@name='txtClerklicenseno']")
    WebElement CLicenseNumber;
    @FindBy(xpath = "//div//input[@name='txtClerkname']")
    WebElement CName;
    @FindBy(xpath = "//div//input[@name='txtClerkemail']")
    WebElement CEmailID;
    @FindBy(xpath = "//div//input[@name='txtClerkmobile']")
    WebElement CMobile;
    /*---------------------------------------------------------------*/
    @FindBy(xpath = "//div/select[@name='ddlApplicantInterest']")
    WebElement  ApplicantInterest;
    @FindBy(xpath = "//div/input[@name='txtPlotArea']")
    WebElement PlotArea;
    @FindBy(xpath = "//div/select[@name='ddlLandUse']")
    WebElement LandUse;
    @FindBy(xpath = "//div/select[@name='ddlLanSubUse']")
    WebElement LanSubUse;
    @FindBy(xpath = "//div/input[@name='txtTotalUnits']")
    WebElement TotalUnits;

    @FindBy(xpath = "//div/input[@name='txtMaxBuildingHeight']")
    WebElement MaxBuildingHeight;
    @FindBy(xpath = "//div/select[@name='cboSpecialRoad']")
    WebElement SpecialRoad;
    @FindBy(xpath = "//div/input[@name='txtAeroDistance']")
    WebElement AeroDistance;
    @FindBy(xpath = "//div/input[@name='txtAeroDistanceFunnel']")
    WebElement AeroDistanceFunnel;

    @FindBy(xpath = "//div//select[@name='cboNorth']")
    WebElement North;
    @FindBy(xpath = "//div//select[@name='cboSouth']")
    WebElement South;
    @FindBy(xpath = "//div//select[@name='cboWest']")
    WebElement West;
    @FindBy(xpath = "//div//select[@name='cboEast']")
    WebElement East;

    @FindBy(xpath = "//div//input[@name='txtNorth']")
    WebElement txtNorth;
    @FindBy(xpath = "//div//input[@name='txtSouth']")
    WebElement txtSouth;
    @FindBy(xpath = "//div//input[@name='txtWest']")
    WebElement txtWest;
    @FindBy(xpath = "//div//input[@name='txtEast']")
    WebElement txtEast;


    public Newplan(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
        if(!NeplanLogo.isDisplayed())
        throw new IllegalStateException("This is not ODPS page");

    }

    public void setAuthority(String autho)
    {
        Select aut=new Select(Authority);
        aut.selectByVisibleText(autho);
    }

    public void setTypeofCase(String typeofCase)
    {
        Select TOC=new Select(TypeofCase);
            TOC.selectByVisibleText(typeofCase);
    }

    public void setPermissionType(String permissionType)
    {
        Select permisType=new Select(PermissionType);
        permisType.selectByVisibleText(permissionType);

    }

    public void setDevelopment_Area(String development_area)

    {
        Select dArea= new Select(Development_Area);
        dArea.selectByVisibleText(development_area);
    }
    public void setZone(String zone)
    {
        Select zon=new Select(Zone);
        zon.selectByVisibleText(zone);
    }

    public void setBaseLandUsZone(String baseLandUsZone)
    {
        Select baselU=new Select(BaseLandUsZone);
        baselU.selectByVisibleText(baseLandUsZone);
    }

    public void setSpecialControlArea(String specialControlArea)
    {
        Select special=new Select(SpecialControlArea);
        special.selectByVisibleText(specialControlArea);
    }

    public void setDistrict (String district)
    {
    District.sendKeys(district);
    }

    public void setTaluka(String taluka)
    {
        Taluka.sendKeys(taluka);
    }
    public void setVillage(String village)
    {
        Village.sendKeys(village);
    }
    public void setBlockNo(String blockNo)
    {
        BlockNo.sendKeys(blockNo);
    }
    public void setWardNo(String wardNo)
    {
        WardNo.sendKeys(wardNo);
    }
    public void setAbductingRoadMaxWidth(String abductingRoadMaxWidth)
    {
        AbductingRoadMaxWidth.sendKeys(abductingRoadMaxWidth);
    }
    public void setTenementPropertyNo(String tenementPropertyNo)
    {
        TenementPropertyNo.sendKeys(tenementPropertyNo);
    }
    public void setTPSNameandNo(String tpsNameandNo)
    {
        TPSNameandNo.sendKeys(tpsNameandNo);
    }

    public void setOPNo(String opNo)
    {
        OPNo.sendKeys(opNo);
    }
    public void setFPNo(String fpNo)
    {
        FPNo.sendKeys(fpNo);
    }

    public void setSectorNo(String sectorNo)
    {
        SectorNo.sendKeys(sectorNo);
    }

    public void setName(String name)
    {
        Name.sendKeys(name);
    }
    public void setAddress(String address)
    {
        Address.sendKeys(address);
    }

    public void setMobileNumber(String mobileNumber)
    {
        MobileNumber.sendKeys(mobileNumber);
    }
    public void setALicenseNumber(String licenseNumber)
    {
        ALicenseNumber.sendKeys(licenseNumber);
    }

    public void setAEmailID(String emailID )
    {
        AEmailID.sendKeys(emailID);

    }
    public void setAMobile(String aMobile)
    {
        AMobile.sendKeys(aMobile);
    }
    public void setSLicenseNumber(String sLicenseNumber)
    {
        SLicenseNumber.sendKeys(sLicenseNumber);
    }
    public void setSName(String sName)
    {
        SName.sendKeys(sName);
    }
    public void setSEmailID(String sEmailID)
    {
        SEmailID.sendKeys(sEmailID);
    }
    public  void setSMobile(String sMobile)
    {
        SMobile.sendKeys(sMobile);
    }

    public  void setCLicenseNumber(String cLicenseNumber)
    {
        CLicenseNumber.sendKeys(cLicenseNumber);
    }

    public void setCName(String cName)
    {
        setCLicenseNumber(cName);
    }

    public void setCEmailID(String cEmailID)
    {
        CEmailID.sendKeys(cEmailID);
    }

    public void setCMobile(String cMobile)
    {
        CMobile.sendKeys(cMobile);
    }





}
