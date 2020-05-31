package tests;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basePack.BaseClass;
import datahelper.ExcelFileReader;
import pages.BNSPage;

public class BNSExcelDataTest extends BaseClass{
	
	static String filePath=System.getProperty("user.dir")+"//src//test//resources//TestData//BNSData.xlsx";
	static String sheetName="Data1";

@Test(dataProvider = "bnsdata")
public void bnspage(String FN, String LN, String EM, String PW, String Pho, 
		String MN, String DY, String YR, String Gender, String Msn) throws InterruptedException {

	test=report.createTest("BNS page Test");
	BNSPage bns=PageFactory.initElements(driver, BNSPage.class);

	driver.get("file:///C:/Users/ubaid/Desktop/BNS.html");
	bns.enterFirstName(FN);
	bns.enterLastName(LN);
	bns.enterEmail(EM);
	bns.enterPassword(PW);
	bns.enterPhone(Pho);

	bns.selectMonth(MN);
	bns.selectDay(DY);
	bns.selectYear(YR);
	Thread.sleep(4000);
	if(Gender.equalsIgnoreCase("Male")) {
		bns.clickMale();
	}
	else {
		bns.clickFemale();
	}
	

	bns.clickSubmit();
	Thread.sleep(4000);


	bns.verifyMessage(Msn);
	Thread.sleep(4000);
}
@DataProvider(name="bnsdata")
public Object[][] getData() throws IOException{
return ExcelFileReader.dataReading(filePath, sheetName);


}


}
