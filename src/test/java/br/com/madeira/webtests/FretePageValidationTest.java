package br.com.madeira.webtests;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import br.com.madeira.pageObjects.CadastroPage;
import br.com.madeira.pageObjects.CarrinhoProdutoPage;
import br.com.madeira.pageObjects.HomePage;
import br.com.madeira.pageObjects.ResultProdutoPage;
import br.com.madeira.runners.NegativeSuiteRunner;

public class FretePageValidationTest extends BaseTestcase{

	CadastroPage cadastroPage = new CadastroPage();
	HomePage homePage = new HomePage();
	ResultProdutoPage resultadoProdutoPage = new ResultProdutoPage();
	CarrinhoProdutoPage carrinhoProduto = new CarrinhoProdutoPage();


	@Test
	@Category(NegativeSuiteRunner.class)
	public void testVallidarFreteResumoProduto() {
		
		homePage.navegarURLProduto();
		carrinhoProduto = resultadoProdutoPage.preencherFrete("82920030");
		carrinhoProduto.clicarButtonCalcularFrete();
	}

	@Test
	public void testValidarCEPInexistente() {

	}

	@Test
	public void testValidarCEPTotal() {

	}

}