package pagesTest;


import org.testng.annotations.Test;
import static common.CommonActions.clickElement;
import static common.CommonActions.clickUsingJavascriptExecutor;
import static common.CommonActions.elementDisplayed;
import static common.CommonActions.elementEnabled;
import static common.CommonActions.elementSelected;
import static common.CommonActions.getAttributeValue;
import static common.CommonActions.inputTextUsingJavascriptExecutor;
import static common.CommonActions.pause;
import static common.CommonActions.scrollIntoViewTheElementUsingJavascriptExecutor;
import static common.CommonActions.verifyTextOfTheWebElement;
import static common.CommonWaits.waitUntilConditionThenClick;

import java.awt.AWTException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import baseUtil.BaseClass;
import constants.Attribute;

public class HomePageTest extends BaseClass {
	@Test
	public void clickLogoTest() {
		homePage.clickLogo();
	}
	@Test
	public void clickPassWord() {
		homePage.clickPassWord();
	}
	
	@Test()
	public void enrollmentTest() {
		homePage.clickLoginButton();
		//homePage.clickAutomationButtonAndDirectToEnrollmentPage();
		

	}
	/*@Test
	public void OppenApplicationPageandClickSubmitButtonTest() {
		homePage.clickLoginButton();
		homePage.clickAutomationButtonAndDirectToEnrollmentPage();
		
homePage.OppenApplicationPageandClickSubmitButton() ;
	}
	@ Test()

	public void use_of_dropdown_selectByValue_test() {
		//homePages.use_of_dropdown_selectByValue();
		//homePages.clickAutomationButton();
	}
	
	@Test
	
	public void useAutomationBttn() {
		homePage.clickAutomationButtonAndDirectToEnrollmentPage();
	}
	

	@Test
	public void enrollmentProcess() {
		homePage.clickLoginButton();
		homePage.clickAutomationButtonAndDirectToEnrollmentPage();
		homePage.firstNameValidation();
		homePage.iAmValidation();
	}*/
	
		
	}