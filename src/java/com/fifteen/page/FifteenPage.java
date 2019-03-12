package com.fifteen.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.accenture.test.ui.WebDriverSession;

public class FifteenPage extends WebDriverSession{

	public FifteenPage() {

        PageFactory.initElements(getWebDriverSession(), this);

    }
    
    @FindBy(xpath = "//img[@class='img-responsive']")
    public WebElement espera1;
    
    @FindBy(xpath = "//a[@title='Log in to your customer account']")
    public WebElement login;
       
    @FindBy(xpath = "//img[@class='img-responsive']")
    public WebElement image;
    
    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    public WebElement cart;
  
    @FindBy(xpath = "//span[contains(text(),'							Proceed to checkout')]")
    public WebElement proceed;
    
    @FindBy(xpath = "//a[@id = 'total_price']")
    public WebElement total;
 

}

