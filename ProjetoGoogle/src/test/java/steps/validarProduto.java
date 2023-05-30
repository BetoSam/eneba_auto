package steps;


import elementos.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;
import page.PageProdutoAcaoBrasil;
import page.categoriaPage;
import runner.Executa;

public class validarProduto {
	Metodos metodos = new Metodos();
	categoriaPage categori = new categoriaPage();
	Elementos el = new Elementos();
PageProdutoAcaoBrasil prBr = new PageProdutoAcaoBrasil();
//Massa de Teste 
	String textoDesejado = "Resident Evil 4 (Xbox Series X|S) Xbox Live Key BRAZIL";

	@Given("que esteja na homepage do site eneba")
	public void queEstejaNaHomepageDoSiteEneba() {
		Executa.abrirNavegador();
		metodos.clicar(el.regiaoBrasil);
		metodos.clicar(el.cookies);
		metodos.pausa(4000);
	}

	@When("clicar na categoria desejada")
	public void clicarNaCategoriaDesejada() {
	
		
		metodos.scroll();
		metodos.pausa(4000);
		categori.selecionarcategoriagames("acao");
		//metodos.clicar(el.acao);
		metodos.pausa(4000);

	}

	@Then("o sistema devera apresenta a categoria desejada")
	public void oSistemaDeveraApresentaACategoriaDesejada() {
		metodos.evidencias("evidencia categoria acao");

	}

	@Given("que esteja na categoria acao")
	public void queEstejaNaCategoriaAcao() {
		metodos.evidencias("evidencia categoria acao");
		metodos.pausa(3000);
	}

	@When("clicar no produto Resident evil 4 Remake")
	public void clicarNoProdutoResidentEvil4Remake() {
		//metodos.clicar(el.fifa);
	//prBr.selecionarProduto("fifa 23");
		metodos.clicar(el.re);
	metodos.pausa(3000);
	}

	@Then("o sistema devera abrir o produto desejado")
	public void oSistemaDeveraAbrirOProdutoDesejado() {
		metodos.evidencias("evidencia game Resident Evil  4 Remake ");
		
	}

	@Given("que esteja na pagina do produto Resident evil 4 Remake")
	public void queEstejaNaPaginaDoProdutoResidentEvil4Reamake() {
		metodos.evidencias("evidencia game Resident Evil  4 Remake ");
		metodos.pausa(4000);
	}

	@When("clicar no campo compra agora")
	public void clicarNoCampoCompraAgora() {
		metodos.clicar(el.enviarParaCarrinho);
		metodos.pausa(4000);
	}

	@Then("o produto devere ser enviado para o carrinho")
	public void oProdutoDevereSerEnviadoParaOCarrinho() {
		metodos.evidencias("evidedencia produto no carrinho ");
		metodos.pausa(2000);
		metodos.validarMensagem(el.reCarrinho, textoDesejado);
	}

}
