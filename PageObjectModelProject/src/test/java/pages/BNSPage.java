package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BNSPage {
	
	@FindBy(how=How.XPATH, using ="html/body/div/div[2]/form/input[1]")
	WebElement firstname;
	public void enterFirstName(String FN) {
		firstname.sendKeys(FN);
	}
	@FindBy(how=How.NAME, using ="LName")
	WebElement lastname;
	public void enterLastName(String LN) {
		lastname.sendKeys(LN);
	}
	@FindBy(how=How.NAME, using ="Email")
	WebElement email;
	public void enterEmail(String EM) {
		email.sendKeys(EM);
	}
	@FindBy(how=How.NAME, using ="Pass")
	WebElement password;
	public void enterPassword(String PW) {
		password.sendKeys(PW);
	}
	@FindBy(how=How.NAME, using ="Phone")
	WebElement phone;
	
	public void enterPhone(String Pho) {
		phone.sendKeys(Pho);
	}
	@FindBy(how=How.NAME, using ="month")
	WebElement Month;
	public void selectMonth(String MN) {
		Select mselect=new Select(Month);
		mselect.selectByVisibleText(MN);
	}
	@FindBy(how=How.NAME, using ="day")
	WebElement Day;
	public void selectDay(String DY) {
		Select dselect=new Select(Day);
		dselect.selectByVisibleText(DY);
	}
	@FindBy(how=How.NAME, using ="year")
	WebElement Year;
	public void selectYear(String YR) {
		Select mselect=new Select(Year);
		mselect.selectByVisibleText(YR);
	}
	@FindBy(how=How.XPATH, using ="/html/body/div/div[2]/form/input[6]")
	WebElement male;
	
	public void clickMale() {
		male.click();
	}
	@FindBy(how=How.XPATH, using ="/html/body/div/div[2]/form/input[7]")
	WebElement female;
	
	public void clickFemale() {
		female.click();
	}
	@FindBy(how=How.XPATH, using ="/html/body/div/div[2]/form/input[8]")
	WebElement submit;
	
	public void clickSubmit() {
		submit.submit();
	}
	@FindBy(how=How.XPATH, using ="//*[contains(text(), 'Submitted')]")
	WebElement text;
	
	public void verifyMessage(String Msn) {
		String actualText=text.getText();
		Assert.assertEquals(actualText, Msn);
	}
	

}
