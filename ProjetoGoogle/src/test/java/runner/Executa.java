package runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import conexoes.DriversFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import io.github.bonigarcia.wdm.WebDriverManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "steps", tags = "@tag3", monochrome = true, dryRun =false, plugin = {
		"pretty", "html:target/cucumber.html" }, snippets = SnippetType.CAMELCASE)

public class Executa extends DriversFactory {

	public static void abrirNavegador() {
		String url = "https://eneba.com";
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webDriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.http.factory","jdk-http-client");

		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

}