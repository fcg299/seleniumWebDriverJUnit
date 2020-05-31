package org.ual.hmis.d100; // Generated by Selenium IDE

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.HashMap;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import com.gargoylesoftware.htmlunit.BrowserVersion;

@SuppressWarnings("unused")
public class EditarelperfildeusuariologueadocorrectoTest {
	private WebDriver driver;
	private Map<String, Object> vars;
	JavascriptExecutor js;

	@Before
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		FirefoxOptions firefoxOptions = new FirefoxOptions(); 
	    firefoxOptions.setHeadless(true); 
	    driver = new FirefoxDriver(firefoxOptions);


		js = (JavascriptExecutor) driver;
		vars = new HashMap<String, Object>();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void editarelperfildeusuariologueadocorrecto() {
		driver.get("https://hmis.azurewebsites.net/");
		driver.manage().window().setSize(new Dimension(837, 554));
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
		driver.findElement(By.id("Input_PhoneNumber")).click();
		driver.findElement(By.id("Input_PhoneNumber")).clear();
		driver.findElement(By.id("Input_PhoneNumber")).sendKeys("856985957");
		driver.findElement(By.id("update-profile-button")).click();
		assertThat(driver.findElement(By.cssSelector(".alert")).getText(), is("×\nYour profile has been updated"));
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("Input_NewEmail")).click();
		driver.findElement(By.cssSelector(".row:nth-child(2)")).click();
		driver.findElement(By.id("Input_NewEmail")).click();
		driver.findElement(By.id("Input_NewEmail")).clear();
		vars.put("randommail2", js.executeScript("return \"ual-\" + Math.floor(Math.random()*1500000)+\"@ual.es\""));
		driver.findElement(By.id("Input_NewEmail")).sendKeys(vars.get("randommail2").toString());
		driver.findElement(By.id("change-email-button")).click();
		assertThat(driver.findElement(By.cssSelector(".alert")).getText(),
				is("×\nConfirmation link to change email sent. Please check your email."));
		driver.findElement(By.cssSelector(".close > span")).click();
		driver.findElement(By.cssSelector(".btn-link")).click();
	}
}
