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

public class Registrodeusuarioincorrecto2Test {
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
	public void registrodeusuarioincorrecto2() {
		driver.get("https://hmis.azurewebsites.net/");
		driver.manage().window().setSize(new Dimension(836, 553));
		driver.findElement(By.linkText("Register")).click();
		assertThat(driver.findElement(By.cssSelector("h1")).getText(), is("Register"));
		driver.findElement(By.id("registerSubmit")).click();
		assertThat(driver.findElement(By.cssSelector(".text-danger li:nth-child(1)")).getText(),
				is("The Email field is required."));
		assertThat(driver.findElement(By.cssSelector(".text-danger li:nth-child(2)")).getText(),
				is("The Password field is required."));
		assertThat(driver.findElement(By.id("Input_Email-error")).getText(), is("The Email field is required."));
		assertThat(driver.findElement(By.id("Input_Password-error")).getText(), is("The Password field is required."));
		driver.findElement(By.id("Input_Email")).click();
		driver.findElement(By.id("Input_Email")).click();
		{
			WebElement element = driver.findElement(By.id("Input_Email"));
			Actions builder = new Actions(driver);
			builder.doubleClick(element).perform();
		}
		driver.findElement(By.id("Input_Email")).sendKeys("felipe.antonio.1997@gmail.com");
		driver.findElement(By.id("Input_Password")).click();
		driver.findElement(By.id("Input_Password")).sendKeys("veryeasy");
		driver.findElement(By.cssSelector(".col-md-6")).click();
		assertThat(driver.findElement(By.id("Input_ConfirmPassword-error")).getText(),
				is("The password and confirmation password do not match."));
		driver.findElement(By.id("registerSubmit")).click();
	}
}
