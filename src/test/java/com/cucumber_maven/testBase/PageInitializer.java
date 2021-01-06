package com.cucumber_maven.testBase;

import pages.amazon.com.AmazonFrontPage;

public class PageInitializer {
	
	public static AmazonFrontPage amazon;
	
	public static void initialize() {
		amazon= new AmazonFrontPage();
	}

}
