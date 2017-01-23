/**
 * 
 */
package br.com.madeira.webtests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import br.com.madeira.categories.RegressionTests;
import br.com.madeira.pageObjects.HomePage;
import br.com.madeira.runners.NegativeSuiteRunner;
import br.com.madeira.runners.PositiveSuiteRunner;
import br.com.madeira.runners.RegressionSuiteRunner;
import br.com.madeira.utils.Selenium;
import br.com.madeira.utils.dbconnection;

/**
 * CLASSE BASE DE TESTES, QUE INICIALIZA O DRIVER NO INICIO DOS TESTES E ENCERRA
 * O DRIVER AO FINAL DA EXECU��O.
 * 
 * @author RafaelTulio
 * 
 */

public class BaseTestcase {
	protected static HomePage homePage;
	protected static WebDriver driver;
	static long startTime;
	static long endTime;
	static long totalTime;

	@BeforeClass
	public static void beforeClass() throws Exception {		
		startTime = System.currentTimeMillis();		
		if (!NegativeSuiteRunner.isSuiteTestExecution && !PositiveSuiteRunner.isSuiteTestExecution && !RegressionSuiteRunner.isSuiteTestExecution) 
		{
			driver = Selenium.getDriver();
			driver.manage().window().maximize();
			dbconnection db = new dbconnection();
			db.clean();
			System.out.println("Chrome Driver iniciado para teste Base Teste!");
		}
	}

	@AfterClass
	public static void afterClass() throws Exception {
		dbconnection db = new dbconnection();
		db.clean();
		if (!NegativeSuiteRunner.isSuiteTestExecution && !PositiveSuiteRunner.isSuiteTestExecution && !RegressionSuiteRunner.isSuiteTestExecution) 
		{
			driver.quit();
			endTime = System.currentTimeMillis();
			totalTime = endTime - startTime;
			System.out.println("Tempo de Execução Suite Teste: " + totalTime+ "Segundos");
			System.out.println("Driver finalizado!\n");
		}
	}

}
