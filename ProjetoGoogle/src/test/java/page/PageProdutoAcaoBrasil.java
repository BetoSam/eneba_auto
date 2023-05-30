package page;

import org.openqa.selenium.By;

import conexoes.DriversFactory;

public class PageProdutoAcaoBrasil extends DriversFactory {

	public void selecionarProduto(String produtoSelecionado) {
		if (produtoSelecionado.equalsIgnoreCase("fifa 23")) {
			produtoSelecionado = "ea-sportstm-fifa-23-standard-edition";
		}
		driver.findElement(By.xpath("//a[@class='oSVLlh'][@href='/br/xbox-"+produtoSelecionado+"-xbox-series-x-s-xbox-live-key-brazil']")).click();

	}

}
