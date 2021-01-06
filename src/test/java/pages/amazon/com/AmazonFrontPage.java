package pages.amazon.com;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber_maven.testBase.BaseClass;

public class AmazonFrontPage extends BaseClass {

	@FindBy(id = "searchDropdownBox")
	public WebElement searChBoxDD;

	@FindBy(xpath = "//input[@id = 'twotabsearchtextbox']")
	public WebElement searchBox;

	@FindBy(xpath = "//input[@id = 'nav-search-submit-button']")
	public WebElement searchBtn;
	@FindBy(xpath = "//a[@id='nav-logo-sprites']")
	public WebElement amazonLogo;

	@FindBy(xpath = "//span[contains(text(),'Medical Books')]")
	public WebElement departConfirm;

	@FindBy(className = "a-spacing-micro")
	public List<WebElement> checkBoxes;

	// input[contains(text(),'asdfasd')]/following-sibling::xyz
	public AmazonFrontPage() {
		PageFactory.initElements(driver, this);
	}

}
