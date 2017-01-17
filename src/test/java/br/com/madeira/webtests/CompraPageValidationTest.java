package br.com.madeira.webtests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.com.madeira.pageObjects.BoletoPage;
import br.com.madeira.pageObjects.CarrinhoProdutoPage;
import br.com.madeira.pageObjects.FechamentoPage;
import br.com.madeira.pageObjects.HomePage;
import br.com.madeira.pageObjects.ResultProdutoPage;
import br.com.madeira.runners.AllTests;
import br.com.madeira.utils.Property;
import br.com.madeira.utils.Selenium;

/**
 * @author ti-16 Classe de Teste com cen�rios relacionados ao fluxo de compra no
 *         site MM
 */

public class CompraPageValidationTest extends BaseTestcase {

	ResultProdutoPage resultadoProdutoPage = new ResultProdutoPage();
	CarrinhoProdutoPage carrinhoProduto = new CarrinhoProdutoPage();
	FechamentoPage fechamentoPage = new FechamentoPage();
	BoletoPage boletoGeradoPage = new BoletoPage();

	@BeforeClass
	public static void beforeClass() throws Exception {	
		if (!AllTests.isAllTestsExecution){
			driver = Selenium.getDriver();
			driver.navigate().to(Property.SITE_ADDRESS);
			driver.manage().window().maximize();
		}
	}
	
	/**
	 * Objetivo: Validar Fluxo de Compra Para Pessoa Fisica
	 * 
	 * @throws Exception
	 */

//	@Test
//	public void compraProdutoPessoaFisica() {
//
//		resultadoProdutoPage = HomePage.preencherFiltroPesquisa("146874");
//		resultadoProdutoPage.validaUrlProduto();
//		resultadoProdutoPage.clicarProduto();
//		carrinhoProduto = resultadoProdutoPage.adicionarCarrinho();
//		fechamentoPage = carrinhoProduto.finalizarCompra();
//		fechamentoPage.efetuarLogin("teste@madeiramadeira.com.br", "teste");
//		fechamentoPage.validarPageFechamento();
//		fechamentoPage.gerarBoleto();
//		boletoGeradoPage = fechamentoPage.clicarFinalizarCompra();
//		boletoGeradoPage.resumoPedido();
//		boletoGeradoPage.visualizarBoleto();
//		boletoGeradoPage.capturaDadosBoleto();
//
//	}

	
	@AfterClass
	public static void afterClass() throws Exception {
		if (!AllTests.isAllTestsExecution){
			driver.quit();
		}
	}
	
	
}
