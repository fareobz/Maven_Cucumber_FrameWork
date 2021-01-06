package com.cucumber_maven.steps;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.cucumber_maven.utils.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonFuncSteps extends CommonMethods {
	@Given("user is navigated to amazon.com")
	public void user_is_navigated_to_amazon_com() {
		boolean flag=amazon.amazonLogo.isDisplayed();
		Assert.assertTrue(flag);
		System.out.println("Assertion passed");
	}


	@Given("user selects {string} from the searchFropDownBox")
	public void user_selects_from_the_searchFropDownBox(String book) {
	   Select selectDd= new Select(amazon.searChBoxDD);
	  List<WebElement>ddOptions= selectDd.getOptions();
	  for (WebElement option : ddOptions) {
		  String optionText=option.getText();
		  System.out.println(optionText);	
	}
	  selectDd.selectByVisibleText(book);	 
	}

	@When("user inputs {string} in the search box")
	public void user_inputs_in_the_search_box(String bookName) {
	    sendText(amazon.searchBox, bookName);
	    click(amazon.searchBtn);
	}

	@Then("the user sees {string} book available in different stores")
	public void the_user_sees_book_available_in_different_stores(String string)  {
	
		for(WebElement el: amazon.checkBoxes) {
			String checkboxText = el.getText();
			if(!el.isSelected() && checkboxText.equals("Unofficial Cookbook")) {
				el.click();
				break;
			}
		}
	}




}
