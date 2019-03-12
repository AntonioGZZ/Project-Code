package com.shop.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.accenture.test.ui.WebDriverSession;

public class ShopPage extends WebDriverSession{

    public ShopPage() {

        PageFactory.initElements(getWebDriverSession(), this);

    }
    
    @FindBy(xpath = "//a[@title = 'Women']")
    public WebElement women;
    
    @FindBy(xpath = "//span[@class = 'grower CLOSE']")
    public WebElement plusbut;
       
    @FindBy(xpath = "//ul[@class ='tree dynamized']/li/ul/li/a")
    public WebElement shirts;
    
    @FindBy(id = "layered_id_attribute_group_1")
    public WebElement small;
    
    @FindBy(id = "layered_id_attribute_group_14")
    public WebElement blue;
    
    @FindBy(xpath = "//span[contains(text(),'Add to cart')]")
    public WebElement cart;
  
    @FindBy(xpath = "//span[contains(text(),'							Proceed to checkout')]")
    public WebElement proceed;
    
    @FindBy(xpath = "//a[@id = 'total_price']")
    public WebElement total;
 

}
