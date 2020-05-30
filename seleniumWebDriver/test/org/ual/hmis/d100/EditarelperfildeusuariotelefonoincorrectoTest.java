package org.ual.hmis.d100; // Generated by Selenium IDE

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class EditarelperfildeusuariotelefonoincorrectoTest {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	@Before
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void editarelperfildeusuariotelefonoincorrecto() {
		driver.get("https://hmis.azurewebsites.net/");
		driver.manage().window().setSize(new Dimension(836, 554));
		driver.findElement(By.linkText("Login")).click();
		assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("Log in"));
		driver.findElement(By.id("Input_Email")).click();
		driver.findElement(By.id("Input_Email")).sendKeys("a@a.com");
		driver.findElement(By.id("Input_Password")).click();
		driver.findElement(By.id("Input_Password")).sendKeys("Viva_Windows10");
		driver.findElement(By.cssSelector("body")).click();
		driver.findElement(By.id("login-submit")).click();
		assertThat(driver.findElement(By.cssSelector(".display-4")).getText(), is("¡Bienvenido!"));
		driver.findElement(By.linkText("Hello a@a.com!")).click();
		assertThat(driver.findElement(By.cssSelector("h2")).getText(), is("Manage your account"));
		driver.findElement(By.id("Input_PhoneNumber")).click();
		driver.findElement(By.id("Input_PhoneNumber")).click();
		{
			WebElement element = driver.findElement(By.id("Input_PhoneNumber"));
			Actions builder = new Actions(driver);
			builder.doubleClick(element).perform();
		}
		driver.findElement(By.id("Input_PhoneNumber")).click();
		driver.findElement(By.id("Input_PhoneNumber")).sendKeys("no es un telefono");
		driver.findElement(By.id("profile-form")).click();
		driver.findElement(By.id("update-profile-button")).click();
		assertThat(driver.findElement(By.cssSelector(".text-danger li")).getText(),
				is("The Phone number field is not a valid phone number."));
		assertThat(driver.findElement(By.cssSelector(".field-validation-error")).getText(),
				is("The Phone number field is not a valid phone number."));
		driver.findElement(By.cssSelector(".btn-link")).click();
		assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("Log out"));
	}
}
