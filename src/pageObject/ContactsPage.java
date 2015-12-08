package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import utilities.AllMethod;

public class ContactsPage {

	public WebDriver driver;
	private By newContactLabel = By.xpath(".//*[@id='bodyCell']/div[1]/div[1]/div[1]/h2");
	private By saveButton = By.xpath(".//*[@id='topButtonRow']/input[1]");
	private By saveAndNewButton = By.xpath(".//*[@id='topButtonRow']/input[2]");
	private By canCelButton = By.xpath(".//*[@id='topButtonRow']/input[3]");
	private By accNameTxtbox = By.id("con4");
	private By fNameComboBox = By.id("name_salutationcon2");
	private By fNameTxtbox = By.id("name_firstcon2");
	private By mNameTxtbox = By.id("name_middlecon2");
	private By lNameTxtbox = By.id("name_lastcon2");
	private By phoneTxtbox = By.id("con10");
	private By suffixTxtbox = By.id("name_suffixcon2");
	private By addLine1Txtbox = By.id("00NF000000D2YGa");
	private By addLine2Txtbox = By.id("00NF000000D2YGb");
	private By cityTxtbox = By.id("00NF000000D2YGZ");
	private By stateListbox = By.id("00NF000000D2YGc");
	private By zipTxtbox = By.id("00NF000000D2YGd");
	private By mAddLine1Txtbox = By.id("00NF000000D2YGf");
	private By mAddLine2Txtbox = By.id("00NF000000D2YGg");
	private By mCityTxtbox = By.id("00NF000000D2YGe");
	private By mStateListbox = By.id("00NF000000D2YGh");
	private By mZipTxtbox = By.id("00NF000000D2YGi");
	private By emargencyCheckbox = By.id("00NF000000D2YGQ");
	private By nextToKinCheckbox = By.id("00NF000000D2YGV");
	private By responsiblePartyCheckbox = By.id("00NF000000D2YGY");
	private By healthcareProxyCheckbox = By.id("00NF000000D2YGR");
	private By appsWitnessCheckbox = By.id("00NL0000003ebGc");
	private By relationToMemberListbox = By.id("00NF000000D4Ens");

	// This is Constructor
	public ContactsPage(WebDriver driver) {
		this.driver = driver;
	}

	// For New Account Label
	public String getNewAccountLabel() {
		String getNewAccLabel = driver.findElement(newContactLabel).getText();
		return getNewAccLabel;
	}

	// Click Save Button
	public void clickSaveButton() {
		driver.findElement(saveButton).click();
	}

	// Click Save and Close Button
	public void clickSaveAndNewButton() {
		driver.findElement(saveAndNewButton).click();
	}

	// Click Cancel Button
	public void clickCancelButton() {
		driver.findElement(canCelButton).click();
	}

	// For Check on Emergency CheckBox
	public void checkOnEmergency() {
		driver.findElement(emargencyCheckbox).click();
	}

	// For Check on Next To Kin CheckBox
	public void checkNextToKin() {
		driver.findElement(nextToKinCheckbox).click();
	}

	// For Check on Responsible Party CheckBox
	public void checkOnResponsibleParty() {
		driver.findElement(responsiblePartyCheckbox).click();
	}

	// For Check on Next To Kin CheckBox
	public void checkHealthcareProxy() {
		driver.findElement(healthcareProxyCheckbox).click();
	}

	// For Check on Emergency CheckBox
	public void checkOnApplicationWitness() {
		driver.findElement(appsWitnessCheckbox).click();
	}

	// For Select Relationship To Member
	public void selectRelation(String relation) {
		try {
			AllMethod.selectTextFromComboByVisibleTextUseBy(relationToMemberListbox, relation);
		} catch (NoSuchElementException a) {
			System.out.println("Element Not Found");
		}
	}

	// Enter Contact Information
	public void enterContact(String accName, String fName, String lName, String phone) {
		AllMethod.useSendkeys("id", "con4", accName);
		AllMethod.useSendkeys("id", "name_firstcon2", fName);
		AllMethod.useSendkeys("id", "name_lastcon2", lName);
		AllMethod.useSendkeys("id", "con10", phone);
	}

	// Enter Address
	public void enterAddress(String add, String city, String state, String zip) {
		AllMethod.useSendkeys("id", "00NF000000D2YGa", add);
		AllMethod.useSendkeys("id", "00NF000000D2YGZ", city);
		AllMethod.selectTextFromComboByVisibleTextUseBy(stateListbox, state);
		AllMethod.useSendkeys("id", "00NF000000D2YGd", zip);

	}

	// Enter Mailing Address
	public void enterMailingAddress(String add, String city, String state, String zip) {
		AllMethod.useSendkeys("id", "00NF000000D2YGf", add);
		AllMethod.useSendkeys("id", "00NF000000D2YGe", city);
		AllMethod.selectTextFromComboByVisibleTextUseBy(mStateListbox, state);
		AllMethod.useSendkeys("id", "00NF000000D2YGi", zip);

	}

}
