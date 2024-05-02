package testcases;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobjects.AccountRegistrationPage;
import pageobjects.HomePage;
import testbase.BaseClass;


public class TC001_AccountRegistrationTest extends BaseClass{
	
@Test (groups= {"regression","master"})
public void Verify_Account_Registration()
{
	
	logger.info("**** starting TC_001_AccountRegistrationTest  *****");
	logger.info("homepage");
	HomePage hp=new HomePage(driver);
	hp.clickMyAccount();
	hp.clickRegister();
	logger.info("Clicked on registration link");
	logger.info("clicked on continue..");
	logger.info("Validating expected message..");
	AccountRegistrationPage AP=new AccountRegistrationPage(driver);
	AP.setFirstName(randomString().toUpperCase());
	AP.setLastName(randomString().toUpperCase());
	AP.setEmail(randomString()+"@gmail.com");
	String password=randomAlphaNumeric();
	AP.setPassword(password);
	//AP.setConfirmPassword(password);
	//AP.setTelephone(randomNumber());
	//AP.setPrivacyPolicy();
	//AP.clickContinue();
	logger.info("clicked on continue..");
	logger.info("Validating expected message..");

	//String confmsg=AP.getConfirmationMsg();
	//Assert.assertEquals(confmsg, "Your Account Has Been Created!");
	

}
	}

