package br.com.madeira.runners;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.openqa.selenium.WebDriver;

import br.com.madeira.utils.Property;
import br.com.madeira.utils.Selenium;
import br.com.madeira.webtests.CadastroPageValidationTest;
import br.com.madeira.webtests.CompraPageValidationTest;

/**
 * Classe que agrupa todas as classes de teste, funcionando com uma suíte de
 * regressão.
 * 
 * @author ti-16
 * 
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ 
	CompraPageValidationTest.class, 
	CadastroPageValidationTest.class,

	})

public class AllTests {
protected static WebDriver driver;

	public static Boolean isAllTestsExecution = false;

	@BeforeClass
	public static void beforeClass() throws Exception {
		isAllTestsExecution = true;
		driver = Selenium.getDriver();
		driver.navigate().to(Property.SITE_ADDRESS);
	}
	
	@AfterClass
	public static void afterClass() throws Exception {
		driver.quit();
	}

}
