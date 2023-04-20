package robos;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MeuRobo {
	public void abrirChrome() {
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.http.factory", "jdk-http-client");

		ChromeDriver smokDriver = new ChromeDriver();
		 smokDriver.get("https://www.kavak.com/br");

	}

	public void acessarUmSite() {
	

	}
}