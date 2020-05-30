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

public class RegistrodeusuariocorrectoTest {
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
	public void registrodeusuariocorrecto() {
		driver.get("https://hmis.azurewebsites.net/");
		driver.manage().window().setSize(new Dimension(837, 553));
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("Input_Email")).click();
		vars.put("emailrandom", js.executeScript("return \"ual-\" + Math.floor(Math.random()*1500000)+\"@ual.es\""));
		driver.findElement(By.id("Input_Email")).sendKeys(vars.get("emailrandom").toString());
		assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("Register"));
		driver.findElement(By.id("Input_Password")).click();
		driver.findElement(By.id("Input_Password")).sendKeys("Viva_Windows10");
		driver.findElement(By.id("Input_ConfirmPassword")).click();
		driver.findElement(By.id("Input_ConfirmPassword")).sendKeys("Viva_Windows10");
		driver.findElement(By.id("registerForm")).click();
		driver.findElement(By.id("registerSubmit")).click();
		assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("Register confirmation"));
		driver.findElement(By.id("confirm-link")).click();
		assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("Confirm email"));
	}
}
