package org.maven.CucuPro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Looogin {
	public static WebDriver driver;

	@Given("^The user in the demo guru page$")
	public void the_user_in_the_demo_guru_page() {
		System.setProperty("webdriver.chrome.driver", "G:\\Manivelworkspace\\CucuPro\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
	}

	@When("^The user enters login credientials$")
	public void the_user_enters_login_credientials() {
		driver.findElement(By.name("uid")).sendKeys("mngr165435");
		driver.findElement(By.name("password")).sendKeys("agenajE");
		driver.findElement(By.name("btnLogin")).click();
	}

	@Then("^The user should view the home page$")
	public void the_user_should_view_the_home_page() {

		Assert.assertEquals("Manager",
				driver.findElement(By.xpath("//a[text()='Manager']")).getText());

//	Assert.assertEquals(" Guru99 Bank Manager HomePage ", driver.getTitle());

	}

}
