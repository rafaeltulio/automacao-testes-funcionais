package br.com.madeira.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.madeira.utils.Selenium;


public class CarrinhoProdutoPage {

	/**
	 * Instância privada do webDriver que vira da suite de teste
	 */

	private static WebDriver driver;
	private static WebDriverWait wait;
	/**
	 * Construtor que ira adicionar a instância do WebDriver para utilizacao dos
	 * metodos
	 */
	static {
		driver = Selenium.getDriver();
		wait = new WebDriverWait(driver, 10);
	}

	/**
	 * Definição única dos locators utilizados na página
	 */
	
	static By buttonFinalizarCompraCarrinho = By.id("btnFinalizarCompra");
		
	public CarrinhoProdutoPage(){
		}	
	
	/**
	 * Clicar no botão Finalizar Compra
	 * @return FechamentoPage
	 */

	public FechamentoPage finalizarCompra() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(buttonFinalizarCompraCarrinho));
		WebElement buttonFinalizaCompra = driver.findElement(buttonFinalizarCompraCarrinho);
		buttonFinalizaCompra.click();
		System.out.println("Clicado no Bot�o Finalizar Compra na Página de Carrinho!");		
		return new FechamentoPage();
	}

	public void clicarButtonCalcularFrete() {
		WebElement btnCalculaFrete = driver.findElement(By.id("calc_frete"));
		btnCalculaFrete.click();
		System.out.println("Clicar no botão Calcular Frete!");
		
	}

}
