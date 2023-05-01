package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home {
	
	WebDriver driver;
	
	
	
	public Home(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getProductSearchBox(){
		WebElement element = driver.findElement(By.xpath("//*[@id=\"nav-bb-search\"]"));
		return element;
	}
	
	public WebElement getProductSearchButton() {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"nav-bb-searchbar\"]/form/input"));
		return element;
	}
	
	public WebElement getFirstProduct() {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div[1]/span/a"));
		return element;
	}
	
	public WebElement getFirstDestination() {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"mat-dialog-3\"]/shared-destinations-dialog/div/div[2]/div/ul/li[1]"));
		return element;
	}
	
	public WebElement getFirstDate() {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"first-date\"]"));
		return element;
	}
	
	public WebElement getDoneButton() {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"mat-dialog-6\"]/shared-calendar-dialog/div/div[2]/div[2]/div/div/button"));
		return element;
	}
	
	public WebElement getSearchFligthButton() {
		WebElement element = driver.findElement(By.xpath("//*[@id=\"SearchWidgetAndCarousel\"]/div/div[1]/mbs-search-widget/div/div[5]/div/button"));
		return element;
	}
	
	public WebElement getRecommendedWord() {
		WebElement element = driver.findElement(By.linkText("Recomendado"));
		return element;
	}

}
