package pages.amazon.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumber_maven.testBase.BaseClass;

public class AmazonFrontPage extends BaseClass{
	
	
	@FindBy(id="searchDropdownBox")
	public WebElement searChBoxDD;
	
	@FindBy(xpath="//input[@id = 'twotabsearchtextbox']")
	public WebElement searchBox;
	
	@FindBy(xpath="//input[@class = 'nav-input'][@type = 'submit']")
	public WebElement searchBtn;
	
	//input[contains(text(),'asdfasd')]/following-sibling::xyz
	public AmazonFrontPage() {
		PageFactory.initElements(driver, this);
	}

}
