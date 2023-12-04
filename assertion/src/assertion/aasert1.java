package assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class aasert1 extends parass {
	SoftAssert softassert = new SoftAssert();

	@BeforeTest
	public void Setup() {
		driver.get(WebsiteUrl);

	}

	@Test(priority = 1)
	public void Contact() throws InterruptedException {
		driver.get(signUpPage);
		WebElement FirstName = driver.findElement(By.id("firstname"));
		WebElement LastName = driver.findElement(By.id("lastname"));
		WebElement Email = driver.findElement(By.id("email_address"));
		WebElement Password = driver.findElement(By.id("password"));
		WebElement confirmPassword = driver.findElement(By.id("password-confirmation"));
		WebElement Button = driver.findElement(By.className("primary"));

		FirstName.sendKeys(Name);
		LastName.sendKeys(fatherNames);
		Email.sendKeys(Emailg);
		Password.sendKeys(Pass);
		confirmPassword.sendKeys(Pass);
		Button.click();
		Thread.sleep(2000);

	}

	@Test(priority = 2)
	public void LogoutTest() throws InterruptedException {

		driver.get(logOutPage);
		Thread.sleep(1000);
	}

	@Test(priority = 3)
	public void LoginTest() {

		driver.get(loginPage);
		WebElement emailInput = driver.findElement(By.id("email"));
		WebElement passInput = driver.findElement(By.id("pass"));
		WebElement loginbut = driver.findElement(By.id("send2"));

		emailInput.sendKeys(Emailg);
		passInput.sendKeys(Pass);
		loginbut.click();

		softassert.assertEquals(driver.getCurrentUrl(),checkTheUrl,"the url is wrong");
		softassert.assertAll();
	}

	@AfterTest
	public void AfterTest() {

	}
}