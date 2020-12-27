package com.cucumber_maven.testBase;

import pages.amazon.com.AmazonFrontPage;

public class PageInitializer extends BaseClass {
	
	public static AmazonFrontPage search;
	
	public static void initialize() {
		search= new AmazonFrontPage();
	}

}
