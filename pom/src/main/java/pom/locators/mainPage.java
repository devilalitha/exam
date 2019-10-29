package pom.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import pom.baseClass;

public class mainPage extends baseClass {

	//locators for flight booking main page
		@FindBy(css = "     ")
		public WebElement fromCity;
		@FindBy(css = "    ")
		public WebElement toCity;
		@FindBy(css = "     ")
		public WebElement departFlight;
		@FindBy(css = "     ")
		public WebElement returnFlight;
		@FindBy(css = "    ")
		public WebElement search;
		
		//Initializing the Page Objects:
		public mainPage(){
			PageFactory.initElements(driver, this);
		}

//actions
		public void fromCity(String fromCityName) {
			fromCity.clear();
			fromCity.sendKeys(fromCityName,Keys.ENTER);
		
	
			}
		public void toCity(String toCityName) {
				fromCity.sendKeys(toCityName,Keys.ENTER);
	
			}
		public void calenderSelect()
			{
	
			}

		public void SearchButton()
			{
				search.click();
	
				/*	//loginBtn.click(); - incase if the above dont work
		    	JavascriptExecutor js = (JavascriptExecutor)driver;
		    	js.executeScript("arguments[0].click();", loginBtn);*/
			}

}