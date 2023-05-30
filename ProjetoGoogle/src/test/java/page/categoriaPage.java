package page;

import org.openqa.selenium.By;

import conexoes.DriversFactory;

public class categoriaPage extends DriversFactory {

	public void selecionarcategoriagames(String categoria) {

		if (categoria.equalsIgnoreCase("aventura")) {
			categoria = "adventure-games";
		}
		if (categoria.equalsIgnoreCase("acao")) {
			categoria = "action-games";
		}
		if (categoria.equalsIgnoreCase("fps/tps")) {
			categoria = "fps-games";
		}
		if (categoria.equalsIgnoreCase("rpg")) {
			categoria = "rpg-games";
		}
		if (categoria.equalsIgnoreCase("indie")) {
			categoria = "indie-games";
		}
		if (categoria.equalsIgnoreCase("simulacao")) {
			categoria = "simulation-games";
		}
		if (categoria.equalsIgnoreCase("estrategeia")) {
			categoria = "strategy-games";
		}
		driver.findElement(By.xpath("//a[@class='UCOPAE'][@href='/br/category/" + categoria + "']")).click();
	}

}
