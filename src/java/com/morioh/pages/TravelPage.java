package com.morioh.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.accenture.test.ui.WebDriverSession;

public class TravelPage extends WebDriverSession{

    public TravelPage() {

        PageFactory.initElements(getWebDriverSession(), this);

    }
    
    @FindBy(xpath = "//span[contains(text(),'Search by Hotel or City Name')]")
    public WebElement searchBy1;
    
    @FindBy(xpath = "//*[@id = 'select2-drop']/div/input")
    public WebElement searchBy2;
       
    @FindBy(name = "checkin")
    public WebElement checkIn;
    
    @FindBy(name = "checkout")
    public WebElement checkOut;
    
    @FindBy(name = "travellers")
    public WebElement travellers;
    
    @FindBy(xpath = "//button[@class='btn btn-lg btn-block btn-primary pfb0 loader']")
    public WebElement button;
	

}
