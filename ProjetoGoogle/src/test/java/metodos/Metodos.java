

package metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import conexoes.DriversFactory;

public class Metodos extends DriversFactory {
	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).click();

	}public void validarMensagem(By elemento, String  msgEsperada) {
		String msgCapturado =driver.findElement(elemento).getText();
		assertEquals(msgEsperada, msgCapturado);
	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	public void evidencias(String evidencia) {
		TakesScreenshot srcShot = (TakesScreenshot) driver;
		File srcFile = srcShot.getScreenshotAs(OutputType.FILE);
		File srcDest = new File("./evidencias/" + evidencia + ".png");
		try {
			FileUtils.copyFile(srcFile, srcDest);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void pausa(int tempo) {
		try {
			Thread.sleep(tempo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
