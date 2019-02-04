import jxl.Workbook;
import jxl.format.CellFormat;
import jxl.read.biff.BiffException;
import jxl.write.*;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import pages.HomePage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import static Utilities.ExtentReportClass.startReport;
import static Utilities.FullPageScreenshot.PageScreenshot;
import static Utilities.UtilityDirectory.GetUrl;
import static Utilities.UtilityDirectory.openBrowser;
import static Utilities.getScreenshot.Screenshot;
import static jxl.format.Colour.*;


/**
 * Created by akshay.pokley on 1/11/2019.
 */
public class TestHomePage{
    static WebDriver driver;
    public Label l4;
    public static WritableCellFormat cellFormat;
    public static WritableCellFormat cellFormat1;
    public static WritableCellFormat cellFormat3;
    public static WritableCellFormat cellFormat4;
    public WritableCellFormat cellFormat2;
    public static WritableCellFormat cellFormat6;
    public static WritableCellFormat cellFormat5;
    public String TestCase;
    public WritableWorkbook writableTempSource;
    public WritableWorkbook copyDocument;
    public WritableSheet sourceSheet;
    public static WritableSheet targetSheet;
    public Workbook sourceDocument;
    /*****************************************************************/
    private static int n = 2;
    private static int j = 1;
    public static String Result;
    public static String k;
    public static String ResultPass1 = "Username";
    public static String ResultFail1 = "Password";
    public static String Actual;
    public static String Actual2;
    static int LastRow;
    static int SetBord;
    static int RowIncr;
    static final java.util.regex.Pattern String = java.util.regex.Pattern.compile("^[A-Za-z, ]++$");
    static final java.util.regex.Pattern Num = java.util.regex.Pattern.compile("^[0-9]++$");
    static final java.util.regex.Pattern Emailval = java.util.regex.Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    static final java.util.regex.Pattern Alphnu = java.util.regex.Pattern.compile("^[A-Za-z,0-9  ]++$");
    static final java.util.regex.Pattern Flot = java.util.regex.Pattern.compile("^[+-]?([0-9]*[.])?[0-9]++$");
    public static String subWindowHandler = null;
    public static String Actvalue;
    public static int x = 3;
    public static int u;
    public static int vb = 2;
    public static int k1;
    public static int rr = 1;
    public static int Rec = 2;
    public static  HomePage homePage ;

    @BeforeTest
    public void OutputExcelCreation() throws IOException, BiffException, WriteException {

        sourceDocument = Workbook.getWorkbook(new File("TestCaseData/TestHomePage1.xls"));
        writableTempSource = Workbook.createWorkbook(new File("TestCaseData/temp.xls"), sourceDocument);
        copyDocument = Workbook.createWorkbook(new File("TestCaseResult/TestHomePageTestReport.xls"));
        sourceSheet = writableTempSource.getSheet(0);
        targetSheet = copyDocument.createSheet("sheet 1", 2);

        WritableFont cellFont = new WritableFont(WritableFont.TIMES, 11);
        cellFont.setBoldStyle(WritableFont.BOLD);
/************************************************************************************************/
        WritableFont cellFont2 = new WritableFont(WritableFont.TIMES, 10);
        cellFont2.setColour(BLACK);
        //cellFont2.setBoldStyle(WritableFont.BOLD);
        cellFormat1 = new WritableCellFormat(cellFont2);
        cellFormat1.setBorder(jxl.format.Border.ALL, jxl.format.BorderLineStyle.THIN);
        cellFormat1.setWrap(true);
/*******************************************************************************************************/
/************************************************************************************************/
        WritableFont cellFont3 = new WritableFont(WritableFont.TIMES, 10);
        cellFont3.setColour(RED);
        cellFont3.setBoldStyle(WritableFont.BOLD);
        cellFormat3 = new WritableCellFormat(cellFont3);
        cellFormat3.setBorder(jxl.format.Border.ALL, jxl.format.BorderLineStyle.THIN);
        cellFormat3.setWrap(true);

        WritableFont cellFont4 = new WritableFont(WritableFont.TIMES, 10);
        cellFont4.setColour(GREEN);
        cellFont4.setBoldStyle(WritableFont.BOLD);
        cellFormat4 = new WritableCellFormat(cellFont4);
        cellFormat4.setBorder(jxl.format.Border.ALL, jxl.format.BorderLineStyle.THIN);
        cellFormat4.setWrap(true);


        cellFormat = new WritableCellFormat(cellFont);
        cellFormat.setBackground(PALE_BLUE);
        cellFormat.setBorder(jxl.format.Border.ALL, jxl.format.BorderLineStyle.THIN);
        cellFormat.setWrap(true);
        cellFormat2 = new WritableCellFormat(cellFont);
        cellFormat2.setBackground(RED);
        //cellFormat.setAlignment(jxl.format.Alignment.getAlignment(20));
        WritableFont cellFont5 = new WritableFont(WritableFont.TIMES, 18);
        cellFont5.setColour(BLACK);
        cellFont5.setBoldStyle(WritableFont.BOLD);
        cellFormat5 = new WritableCellFormat(cellFont5);
        cellFormat5.setBorder(jxl.format.Border.ALL, jxl.format.BorderLineStyle.THIN);
        cellFormat5.setBackground(PALE_BLUE);
        cellFormat5.setAlignment(Alignment.CENTRE);


        cellFormat6 = new WritableCellFormat(cellFont2);
        cellFormat6.setBorder(jxl.format.Border.ALL, jxl.format.BorderLineStyle.THIN);
        cellFormat6.setWrap(true);
        cellFormat6.setBackground(PALE_BLUE);
        //  sheet.addCell(new Label(col, 1, "CCCCC", cellFormat));

        for (int row = 0; row < sourceSheet.getRows(); row++) {
            for (int col = 0; col < sourceSheet.getColumns(); col++) {
                WritableCell readCell = sourceSheet.getWritableCell(col, row);
                WritableCell newCell = readCell.copyTo(col, row);
                CellFormat readFormat = readCell.getCellFormat();

                WritableCellFormat newFormat = new WritableCellFormat(readFormat);
                newCell.setCellFormat(newFormat);
                targetSheet.addCell(newCell);


                Label l2 = new Label(5, 1, "Actual", cellFormat);

                Label l3 = new Label(6, 1, "Status", cellFormat);
                //Label l4=new Label(4,row,"",cellFormat);
                int widthInChars = 36;
                int widthInChars2 = 18;
                int widthInChars1 = 16;
                targetSheet.setColumnView(2, widthInChars1);
                targetSheet.setColumnView(3, widthInChars1);
                targetSheet.setColumnView(1, widthInChars1);
                targetSheet.setColumnView(4, widthInChars);
                targetSheet.setColumnView(5, widthInChars);

/*-----------------------------------------------------------------------------------------------------------------------*/
                targetSheet.setColumnView(0, widthInChars2);
                targetSheet.setColumnView(2, widthInChars2);

                targetSheet.setColumnView(3, widthInChars2);
                targetSheet.mergeCells(0, 0, 6, 0);
                Label lable = new Label(0, 0,
                        "ODPS UI screen test Case Result", cellFormat5);
                targetSheet.addCell(lable);
                targetSheet.addCell(l2);
                targetSheet.addCell(l3);
                //targetSheet.addCell(l4);

            }
        }

    }

    @AfterTest
    public void f() throws IOException, WriteException {

        copyDocument.write();
        copyDocument.close();
        writableTempSource.close();
        sourceDocument.close();

    }




    @Test(dataProvider = "hybridData")
    public static void HomePageTest(String testcaseName, String keyword, String objectName, String value, String Expected) throws Exception {

        if (testcaseName != null && testcaseName.length() != 0) {

            driver = openBrowser("chrome");
            GetUrl("url");
            Thread.sleep(200);
            SetBord = j++;
            Label l7 = new Label(5, SetBord, "", cellFormat6);
            targetSheet.addCell(l7);
            Label l8 = new Label(6, SetBord, "", cellFormat6);
            targetSheet.addCell(l8);
            k1 = 1;
        } else {
            SetBord = j++;
        }



        try {

            homePage=new HomePage(driver);
            switch (keyword.toUpperCase()) {

                case "BROWSER CLOSED":
                    switch (objectName) {
                        case "Closed":
                            driver.close();

                            Result="PASS";

                            break;
                        default:
                            System.out.println("Need To Implemented Test case for -->" + " " + objectName);
                            Result = "FAIL";
                            Actual="Need To Implemented Test case for -->" + " " + objectName;
                            break;
                    }
                    break;

                case "UI":
                    switch (objectName) {
                        case "Get Title":
                            WebElement titleUI = homePage.getHometitle();
                            String actual = titleUI.getText();
                            Actual=actual;
                            if (actual.equals(Expected)) {
                                Result = "PASS";
                                startReport(Result);
                            }
                            else{
                                Result = "FAIL";
                                startReport(Result);
                            }

                            break;

                        default:
                            System.out.println("Need To Implemented Test case for -->" + " " + objectName);
                            Actual="Need To Implemented Test case for -->" + " " + objectName;
                            Result = "FAIL";
                            startReport(Result);
                            break;
                    }
                    break;
            }


            if (testcaseName.isEmpty()) {
                LastRow = n++;
                if (Result.equals("PASS")) {
                    Label l5 = new Label(5, LastRow, "As Excepted", cellFormat1);
                    targetSheet.addCell(l5);
                    Label l6 = new Label(6, LastRow, "PASS", cellFormat4);
                    targetSheet.addCell(l6);
                } else {

                    Label l5 = new Label(5, LastRow, Actual, cellFormat1);
                    targetSheet.addCell(l5);
                    Label l6 = new Label(6, LastRow, "FAIL", cellFormat3);
                    targetSheet.addCell(l6);
                }
            } else {
                LastRow = n++;

            }

        } catch (Throwable n) {
            System.out.println(n.getMessage());

        }


    }

    @DataProvider(name = "hybridData")
    public Object[][] getDataFromDataprovider() throws IOException {
        Object[][] object = null;
        FileInputStream fis = new FileInputStream("TestCaseData/TestHomePage1.xls");
        HSSFWorkbook wb = new HSSFWorkbook(fis);
        HSSFSheet sh = wb.getSheet("Applicant");
        //  HSSFRow rows = sh.getRow(1);
//Read keyword sheet// /Find number of rows in Expl.excel file
        int rowCount = sh.getLastRowNum() - sh.getFirstRowNum();
        System.out.println(rowCount);
        object = new Object[rowCount][5];
        for (int i = 1; i < rowCount; i++) {
            HSSFRow row = sh.getRow(i + 1);
            for (int j = 0; j < row.getLastCellNum(); j++) {
//                System.out.println(row.getCell(j).toString());
                object[i][j] = row.getCell(j).toString();

            }


        }
        return object;


    }

}