package steps;

import elementos.Elementos;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import page.categoriaPage;
import runner.Executa;

public class Categoria {
	Metodos metodos = new Metodos();
	categoriaPage categori = new categoriaPage();
Elementos el = new Elementos();
	@Before
	public void abrirNavegador() {
		
	}

	@Given("que esteja no site eneba")
	public void queEstejaNoSiteEneba() {
		Executa.abrirNavegador();
		
	}

	@When("escolher uma categoria")
	public void escolherUmaCategoria() {
		categori.selecionarcategoriagames("acao");
		metodos.pausa(4000);
		
		
	}

	@Then("o sistema devera apresenta a categoria escolhida")
	public void oSistemaDeveraApresentaACategoriaEscolhida() {
		metodos.evidencias("evidencia categoria");
	}

	@Given("que esteja na categoria selecionada")
	public void queEstejaNaCategoriaSelecionada() {
		metodos.clicar(el.gameCyberpunk2077);
	}

	@When("escolher um produto")
	public void escolherUmProduto() {
		metodos.clicar(el.regiaoBrasil);

	}

	@And("e clicar no campo comprar agora")
	public void eClicarNoCampoComprarAgora() {
		
metodos.clicar(el.cookies);
	}

	@Then("o produto devera ser enviado para o carrinho")
	public void oProdutoDeveraSerEnviadoParOCarrinho() {
metodos.clicar(el.enviarParaCarrinho);
	}

}
