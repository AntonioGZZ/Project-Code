package com.basic.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.accenture.test.ui.WebDriverSession;

public class BasicPage extends WebDriverSession{
	
	public BasicPage() {

        PageFactory.initElements(getWebDriverSession(), this);

    }
	
    
    @FindBy(xpath = "//a[contains(text(),'Chapter1')]")
    public WebElement chapter1;
    
    @FindBy(xpath = "//div[@class='mainheading']")
    public WebElement espera1;
       
    @FindBy(xpath = "//div[@id='divontheleft']")
    public WebElement espera2;
    
    @FindBy(id = "//input[@id='radiobutton']")
    public WebElement boton1;
    
    @FindBy(id = "//select[@id='selecttype']")
    public WebElement selrc;
    
    @FindBy(xpath = "//input[@name='selected(1234)']")
    public WebElement box;
  
    @FindBy(xpath = "//input[@id='secondajaxbutton']")
    public WebElement ttp;
    
    @FindBy(xpath = "//div[@class='belowcenter']")
    public WebElement timout;
    
    @FindBy(xpath = "//input[@id='storeinput']")
    public WebElement tes;
    
    @FindBy(xpath = "//input[@id='verifybutton']")
    public WebElement btb;
    
    @FindBy(xpath = "//div[@id='loadajax']")
    public WebElement aja;
    
    @FindBy(xpath = "//p[contains(text(),'The following text has been loaded from another pa')]")
    public WebElement espera;

}
