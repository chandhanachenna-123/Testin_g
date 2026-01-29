package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class rashi {
	WebDriver driver;
	@Given("browser is open")
	public void browser_is_open() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    
	}

	@Given("user enter a text in search box")
	public void user_enter_a_text_in_search_box() {
		driver.get("https:www.google.com");
		
	    
	}

	@When("user is on google search page")
	public void user_is_on_google_search_page() {
		System.out.println("user is on gooogle search page");
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
	    driver.quit();
	}



}
