package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.HomePage;

public class TestStepDef {
	HomePage home;

	@Given("user opens the browser")
	public void user_opens_the_browser() {
		home = new HomePage();

	}

	@When("click on Shop Menu")
	public void click_on_shop_menu() throws InterruptedException {
		home.clickShop();
		Thread.sleep(1000);
		;
	}

	@Then("click on Home menu button")
	public void click_on_home_menu_button() throws InterruptedException {
		home.clickHome();
		Thread.sleep(1000);
	}

	@Then("firstslide is displayed")
	public void firstslide_is_displayed() throws InterruptedException {
		home.firstSlide();
		Thread.sleep(1000);
	}

	@Then("secondslide is displayed")
	public void secondslide_is_displayed() throws InterruptedException {
		home.secondSlide();
		Thread.sleep(1000);
	}

	@Then("thirdslide is displayed")
	public void thirdslide_is_displayed() throws InterruptedException {
		home.thirdSlide();
		Thread.sleep(1000);
	}

	@Given("user is on main page")
	public void user_is_on_main_page() throws InterruptedException {
		home = new HomePage();
		Thread.sleep(1000);
	}

	@When("user click show menu")
	public void user_click_show_menu() throws InterruptedException {
		home.clickShop();
		Thread.sleep(1000);
	}

	@When("user click home button")
	public void user_click_home_button() throws InterruptedException {
		home.clickHome();
		Thread.sleep(1000);
	}

	@Then("user is available with three arrivals")
	public void user_is_available_with_three_arrivals() throws InterruptedException {
		home.arrivals();
		Thread.sleep(1000);
	}

	@Then("arrival image should be clickable and navigable")
	public void arrival_image_should_be_clickable_and_navigable() throws InterruptedException {
		home.arrivalNavigation();
		Thread.sleep(1000);
	}

	@Then("click on description tab")
	public void click_on_description_tab() throws InterruptedException {
		home.clickDescriptionTab();
		Thread.sleep(1000);
	}

	@Then("click on review tab")
	public void click_on_review_tab() throws InterruptedException {
		home.clickReviewTab();
		Thread.sleep(1000);
	}

}
