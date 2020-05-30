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

public class CambiarcontraseaincorrectoTest {
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
	public void cambiarcontraseaincorrecto() {
		driver.get("https://hmis.azurewebsites.net/");
		driver.manage().window().setSize(new Dimension(837, 553));
		driver.findElement(By.linkText("Login")).click();
		assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("Log in"));
		driver.findElement(By.id("Input_Email")).click();
		driver.findElement(By.id("Input_Email")).sendKeys("a@a.com");
		driver.findElement(By.id("Input_Password")).click();
		driver.findElement(By.id("Input_Password")).sendKeys("Viva_Windows10");
		driver.findElement(By.id("login-submit")).click();
		assertThat(driver.findElement(By.cssSelector(".display-4")).getText(), is("¡Bienvenido!"));
		driver.findElement(By.linkText("Hello a@a.com!")).click();
		assertThat(driver.findElement(By.cssSelector("h2")).getText(), is("Manage your account"));
		driver.findElement(By.id("change-password")).click();
		assertThat(driver.findElement(By.cssSelector(".col-md-9 > h4")).getText(), is("Change password"));
		driver.findElement(By.id("Input_OldPassword")).click();
		driver.findElement(By.id("Input_OldPassword")).sendKeys("Viva_Windows10");
		driver.findElement(By.id("Input_NewPassword")).click();
		driver.findElement(By.id("Input_NewPassword")).sendKeys("Viva_Windows10");
		driver.findElement(By.id("Input_ConfirmPassword")).click();
		driver.findElement(By.id("Input_ConfirmPassword")).sendKeys("Viva_Windows1");
		driver.findElement(By.cssSelector(".row:nth-child(2)")).click();
		assertThat(driver.findElement(By.id("Input_ConfirmPassword-error")).getText(),
				is("The new password and confirmation password do not match."));
		driver.findElement(By.cssSelector(".row:nth-child(3)")).click();
		driver.findElement(By.cssSelector(".row:nth-child(2)")).click();
		driver.findElement(By.id("Input_ConfirmPassword")).click();
		driver.findElement(By.id("Input_ConfirmPassword")).sendKeys("Viva_Windows10");
		driver.findElement(By.id("Input_OldPassword")).click();
		driver.findElement(By.id("Input_OldPassword")).sendKeys("Viva_Windows1");
		driver.findElement(By.cssSelector(".row:nth-child(2)")).click();
		driver.findElement(By.cssSelector(".btn-primary")).click();
		assertThat(driver.findElement(By.cssSelector(".text-danger li")).getText(), is("Incorrect password."));
		driver.findElement(By.cssSelector(".btn-link")).click();
		assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("Log out"));
	}
}
