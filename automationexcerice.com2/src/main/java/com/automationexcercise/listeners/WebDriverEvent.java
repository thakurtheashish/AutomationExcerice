package com.automationexcercise.listeners;


import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.events.WebDriverListener;

import com.automationexcercise.TestBasePackage.TestBase;

public class WebDriverEvent extends TestBase implements WebDriverListener{
	
	 public void beforeGet(WebDriver driver, String url) {
		 logger.info("Getting the website " + url);
	 }
	  
	 public void beforeFindElement(WebDriver driver, By locator) {
		 logger.info("Finding the element " + locator);
	 }

	 public void afterFindElement(WebDriver driver, By locator, WebElement result) {
		 logger.info("Found the element " + locator);
	 }
	 

	 public void beforeFindElements(WebDriver driver, By locator) {
		 logger.info("Finding the element " + locator);
	 }

	 public void afterFindElements(WebDriver driver, By locator, List<WebElement> result) {
		 logger.info("Found the element " + locator);
	 }
	  

	 public void beforeClick(WebElement element) {
		 logger.info("Clicking on element " + element);
	 }

	 public void afterClick(WebElement element) {
		 logger.info("Clicked on element " + element);
	 }

	 public void beforeSubmit(WebElement element) {}

	 public void afterSubmit(WebElement element) {}

	 public void beforeSendKeys(WebElement element, CharSequence... keysToSend) {}

	 public void afterSendKeys(WebElement element, CharSequence... keysToSend) {}

	 public void beforeGetText(WebElement element) {}

	 public void afterGetText(WebElement element, String result) {}

	 public void beforeFindElement(WebElement element, By locator) {}

	 public void afterFindElement(WebElement element, By locator, WebElement result) {}

	 public void beforeFindElements(WebElement element, By locator) {}

	 public void afterFindElements(WebElement element, By locator, List<WebElement> result) {}


	
}
