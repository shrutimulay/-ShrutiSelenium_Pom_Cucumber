package page;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase {

	@FindBy(id = "menu-item-40")
	WebElement shop;

	@FindBy(xpath = "//a[contains(text(),'Home')]")
	WebElement home;

	@FindBy(xpath = "//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]")
	WebElement firstslide;

	@FindBy(xpath = "//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/img[1]")
	WebElement secondslide;

	@FindBy(xpath = "//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/img[1]")
	WebElement thirdslide;

	@FindBy(xpath = "//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]/img[1]")
	WebElement arrival;

	@FindBy(xpath = "//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ul[1]/li[1]/a[1]/img[1]")
	WebElement arrival1;

	@FindBy(xpath = "//body/div[@id='pagewrap']/div[@id='body']/div[@id='layout']/div[@id='content']/div[@id='page-22']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/ul[1]/li[1]/a[1]/img[1]")
	WebElement arrival2;

	@FindBy(xpath = "//button[contains(text(),'Add to basket')]")
	WebElement addToBasket;

	@FindBy(xpath = "//a[contains(text(),'Description')]")
	WebElement descriptionTab;

	@FindBy(xpath = "//a[contains(text(),'Reviews (0)')]")
	WebElement reviewTab;

	public HomePage() {
		init();
		PageFactory.initElements(driver, this);
	}

	public void clickShop() {
		shop.click();
	}

	public void clickHome() {
		home.click();
	}

	public void firstSlide() {
		firstslide.click();
	}

	public void secondSlide() {
		secondslide.click();
	}

	public void thirdSlide() {
		thirdslide.click();
	}

	public void arrivals() {
		if (arrival.isDisplayed() && arrival1.isDisplayed() && arrival2.isDisplayed()) {
			System.out.println("Arrivals available");
		}

	}

	public void arrivalNavigation() throws InterruptedException {
		arrival.click();
		driver.navigate().back();
		arrival1.click();
		driver.navigate().back();
		arrival2.click();
	}

	public void clickDescriptionTab() throws InterruptedException {
		arrival.click();
		descriptionTab.click();
		driver.navigate().back();
		arrival1.click();
		descriptionTab.click();
		driver.navigate().back();
		arrival2.click();
		descriptionTab.click();

	}

	public void clickReviewTab() {
		arrival.click();
		reviewTab.click();
		driver.navigate().back();
		arrival1.click();
		reviewTab.click();
		driver.navigate().back();
		arrival2.click();
		reviewTab.click();
	}

	public String getTitle() {
		return driver.getTitle();
	}
}
