package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.Attribute;

// new, you have to manually write it to get access of common actions
// this is possible when they are static in nature, * means all
// This is called static import
import static common.CommonActions.*;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class HomePage {
	public WebDriver driver;
	public WebDriverWait wait;
	public Select select;
	JavascriptExecutor js;
	Actions actions;

	// parameterized constructor initialized when class in instantiated [object created]
	public HomePage(WebDriver driver) {
		this.driver = driver;
		// PageFactory class help to instantiate WebElements
		// Important interview question
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		js = (JavascriptExecutor)driver;
		actions = new Actions(driver);
		
	}

	

		@FindBy(xpath = "//img//parent::a//parent::nav")
		WebElement logo;

		@FindBy(xpath = "//a[text()='Login']")
		WebElement logInFromToolbar;
	

		@FindBy(xpath = "//input[@name='username']")
		WebElement email;

		@FindBy(xpath = "//input[@name='password']")
		WebElement password;

		@FindBy(css = "input.btn.btn-lg.px-5")
		WebElement loginButton;

		@FindBy(xpath = "//span[text()='Automation']")
		WebElement automation;

		@FindBy(xpath = "//a[text()='Enroll Now']")
		WebElement enrollNow;

		@FindBy(xpath = "//input[@name='f_name']")
		WebElement fName;
		
		@FindBy(xpath = "//small[contains(text(), 'alphabetic')]")
		WebElement mustBeAlphabeticCharactersErrorMessage;
		
		@FindBy(xpath = "//small[contains(text(), 'First Name is a required field.')]")
		WebElement firstNameIsARequiredFieldErrorMesssage;

		@FindBy(xpath = "//input[@name='l_name']")
		WebElement lName;

		@FindBy(xpath = "//select[@name = 'i_am']")
		WebElement iAm;
		
		@FindBy(xpath = "//select[@name='i_am']/option")
		List<WebElement> iAmList;

		@FindBy(xpath = "//select[@id='id_course_wish_to_enroll']")
		WebElement courseWishToEnroll;

		@FindBy(xpath = "//input[@name='phone']")
		WebElement phonNumber;

		@FindBy(xpath = "//input[@name='email']")
		WebElement emailAddress;

		@FindBy(xpath = "//input[@name='password']")
		WebElement passwordElement;

		@FindBy(xpath = "//input[@name='home_address_line_1']")
		WebElement homeAddressLine1;

		@FindBy(xpath = "//input[@name='home_address_line_2']")
		WebElement homeAddressLine2;

		@FindBy(xpath = "//input[@name='city']")
		WebElement city;

		@FindBy(xpath = "//input[@name='zip_code']")
		WebElement zipCode;

		@FindBy(xpath = "//input[@name='emergency_contact']")
		WebElement emergencyContract;

		@FindBy(xpath = "//input[@name='sign_by_name']")
		WebElement signature;

		@FindBy(xpath = "//select[@name='birth_year']")
		WebElement birthYear;
		@FindBy(xpath = "//select[@name='birth_month']")
		WebElement birthMonth;
		@FindBy(xpath = "//select[@name='gender']")
		WebElement gender;
		@FindBy(xpath = "//select[@id='id_birth_date']")
		WebElement birthDate;
		@FindBy(xpath = "//select[@name='immigration_status']")
		WebElement immigrationStatus;
		@FindBy(xpath = "//input[@name='arrival_date']")
		WebElement dateOfArrival;
		@FindBy(xpath = "//button[text()='Submit']")
		WebElement submitButton;
		@FindBy(xpath = "//select[@name='state']")
		WebElement state;
		@FindBy(xpath = "//select[@id='id_immigration_status']")
		WebElement imergencyStatus;
		// input[@id='id_know_us']
		@FindBy(xpath = "//input[@id='id_know_us']")
		WebElement HowDidYouKnow;
		// input[@id='id_arrival_date']
		
		// select[@id='id_highest_education']
		@FindBy(xpath = "//input[@name='emergency_contact']")
		WebElement imergencyContact;
		@FindBy(xpath = "//select[@id='id_highest_education']")
		WebElement higherEducation;
		@FindBy(xpath = "//select[@class='form-control' and @name='country_of_origin']")
		WebElement country;

		@FindBy(xpath = "//select[@class='form-control' and @name='country_of_origin']/option")
		List<WebElement> setOfCountry;
		// input[@id='is_agree']

		@FindBy(xpath = "//input[@id='is_agree']")
		WebElement checkBoxIagree;
		@FindBy(css = "select#id_primary_language")
		WebElement language;
		@FindBy(xpath = "//input[@name='image']")
		WebElement personalImage;
		@FindBy(xpath = "//input[@name='photo_id']")
		WebElement photoId;

		// @FindBy(xpath = "//select[@name='i_am' and @class='form-control']")
		// WebElement IamDd;
	
		public void clickLogo() {
			logo.click();
			pause(4000);
		}
	
		public void clickLoginButton() {
			elementDisplayed(logInFromToolbar);
			// clickEliment(logInFromToolbar);
			js.executeScript("arguments[0].click()", logInFromToolbar);
			pause(4000);
			// elementDisplayed(email);
			elementDisplayed(email);
			inputText(email, "ayshasiddqua26@gmail.com");
			elementDisplayed(password);
			inputText(password, "Faizan2026#");
			pause(4000);
			elementEnabled(loginButton);
			// verifyTextOfTheWebElement(loginButton, "log in");
			clickElement(loginButton);
			pause(2000);

		}
	
		public void use_of_dropdown_selectByValue() {
			//pause(4000);
			clickLoginButton();
			pause(4000);
			 driver.navigate().to("https://enthrallit.com/course/dashboard/enrolls/");
			 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
			 driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(3000));
			 pause(4000);
			select = new Select(iAm);
			select.selectByValue("Student");
			pause(4000);
			//https://enthrallit.com/course/dashboard/enrolls/
		}

		public void use_of_dropdown_selectByIndex() {
			pause(4000);
			select = new Select(courseWishToEnroll);
			select.selectByIndex(1);
			pause(4000);

		}

		public void use_of_dropdown_selectByVisibleText() {
			select = new Select(birthYear);
			select.selectByVisibleText("1960");
			pause(4000);

		}
		

		public void clickAutomationButtonAndDirectToEnrollmentPage() {
			elementEnabled(automation);
			verifyTextOfTheWebElement(automation, "Automation");
			clickElement(automation);
			pause(2000);
			elementEnabled(enrollNow);
			verifyTextOfTheWebElement(enrollNow, "Enroll Now");
			clickElement(enrollNow);
			pause(4000);
			Set<String> allWindowHandales = driver.getWindowHandles();
			// Extract parent and child
			String parent = (String) allWindowHandales.toArray()[0];
			String child = (String) allWindowHandales.toArray()[1];
			driver.switchTo().window(child);
			pause(4000);
			
		}
		public void OppenApplicationPageandClickSubmitButton() {
			pause(3000);
		//	driver.navigate().to("https://enthrallit.com/course/dashboard/enrolls/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			pause(3000);
			inputText(fName, "Aysha");
			pause(4000);
			
			
			inputText(lName, "Siddqua");
			// selectElelementFromDropdownOnebyOne(iM, iMList);
			pause(3000);
			selectDropdown(iAm, "a Student");
			pause(3000);
			// selectElelementFromDropdownOnebyOne(course, courseOfList);
			pause(300);
			selectDropdown(courseWishToEnroll, "Python");
			pause(3000);
			inputText(phonNumber, "6464277830");
			pause(3000);
			inputText(emailAddress, "ayshasiddqua26@gmail.com");
			pause(3000);
			inputText(passwordElement, "Faizan2026#");
			pause(3000);
			selectDropdown(gender, "Female");
			pause(3000);

			uploadPhotoImage(personalImage, "./image/imageId.jpeg");

			pause(3000);
			uploadPhotoImage(photoId, "./image/photoId.jpeg");
			pause(3000);
			selectDropdown(birthYear, "1999");
			pause(3000);
			selectDropdown(birthMonth, "September");
			pause(3000);
			selectDropdown(birthDate, "26");
			pause(3000);
			inputText(homeAddressLine1, "3084 Decatur ave");
			inputTextThenClickEnter(homeAddressLine2, "2");

			inputText(city, "Bronx");
			inputText(state, "New York");
			inputText(zipCode, "10467");
			inputText(immigrationStatus, "Citizen");
			inputText(dateOfArrival, "12/1/2017");
			inputText(HowDidYouKnow, "Friend");
			selectDropdown(higherEducation, "Other");
			inputText(imergencyContact, "9292477058");
			pause(4000);
			selectDropdown(country, "Bangladesh");

			pause(4000);
			selectDropdown(language, "English");
			pause(4000);
			////selectElelementFromDropdownOnebyOne(language, listOfLanguage);
			pause(3000);
			//selectDropdown(language, "Bengali");
			pause(3000);
			// waitUntilConditionThenClick(driver, submit);
			inputText(signature, "Aysha Siddqua");
			clickElement(checkBoxIagree);
			pause(3000);
			clickElement(submitButton);
		}
		public void firstNameValidation() {
			verifyLengthOfTheFieldContent(fName, Attribute.MAX_LENGTH, "20");
			inputTextThenClickTab(fName, "$$^&@$(");
			verifyErrorMessageUnderTheField(mustBeAlphabeticCharactersErrorMessage, Attribute.INNER_HTML, "Must be alphabetic characters.");
			pause(3000);
			clearTextFromTheField(fName);
			inputTextThenClickTab(fName, "");
			verifyErrorMessageUnderTheField(firstNameIsARequiredFieldErrorMesssage, Attribute.INNER_HTML, "First Name is a required field.");
			pause(3000);
			inputTextThenClickTab(fName, "176351245");
			verifyErrorMessageUnderTheField(mustBeAlphabeticCharactersErrorMessage, Attribute.INNER_HTML, "Must be alphabetic characters.");
			pause(3000);
		}
		
		public void iAmValidation() {
			selectElelementFromDropdownOnebyOne(iAm, iAmList);
			pause(3000);
			selectDropdown(iAm, "Employed");
			pause(3000);
		}
		
		public void clickPassWord() {
			password.click();
		}
}
		
		
		
		
		
		
		
			