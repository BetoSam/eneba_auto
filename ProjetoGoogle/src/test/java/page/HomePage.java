package page;

import org.openqa.selenium.By;

import conexoes.DriversFactory;

public class HomePage extends DriversFactory {

	public void selecionarCategoria(String categoria) {
		String categoriaSelecionada = categoria.toLowerCase();
		driver.findElement(By.xpath("//div[@class='RXvh7P']//a[@class='UCOPAE'][@href='/category/"+categoriaSelecionada+"']")).click();

	}

}
