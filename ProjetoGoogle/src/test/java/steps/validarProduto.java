package steps;

import org.junit.Before;

import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import page.categoriaPage;
import runner.Executa;

public class validarProduto {
	Metodos metodos = new Metodos();
	categoriaPage categori = new categoriaPage();
	Elementos el = new Elementos();

	@Before
	public void abrirNavegador() {

	}

	@Given("que esteja na homepage do site eneba")
	public void queEstejaNaHomepageDoSiteEneba() {
		Executa.abrirNavegador();

	}

	@When("clicar na categoria desejada")
	public void clicarNaCategoriaDesejada() {
		categori.selecionarcategoriagames("acao");
		metodos.pausa(4000);

	}

	@Then("o sistema devera apresenta a categoria desejada")
	public void oSistemaDeveraApresentaACategoriaDesejada() {
		metodos.evidencias("evidencia categoria acao");

	}

	@Given("que esteja na categoria acao")
	public void queEstejaNaCategoriaAcao() {
		metodos.clicar(el.gameDmc);
	}

	@When("clicar no produto Dmc")
	public void clicarNoProdutoDmc() {
		metodos.pausa(4000);
	}

	@Then("o sistema devera abrir o produto desejado")
	public void oSistemaDeveraAbrirOProdutoDesejado() {
		metodos.evidencias("evidencia game Dmc");
		metodos.clicar(el.regiaoBrasil);
		metodos.clicar(el.cookies);
	}

	@Given("que esteja na pagina do produto Dmc")
	public void queEstejaNaPaginaDoProdutoDmc() {
		metodos.evidencias("evidencia game Dmc");
	}

	@When("clicar no campo compra agora")
	public void clicarNoCampoCompraAgora() {
		metodos.clicar(el.enviarParaCarrinho);
		metodos.pausa(4000);
	}

	@Then("o produto devere ser enviado para o carrinho")
	public void oProdutoDevereSerEnviadoParaOCarrinho() {
		metodos.evidencias("evidedencia produto no carrinho ");
	}

}
