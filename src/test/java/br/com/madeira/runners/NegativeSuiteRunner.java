package br.com.madeira.runners;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;
import org.openqa.selenium.WebDriver;

import br.com.madeira.utils.Property;
import br.com.madeira.utils.Selenium;
import br.com.madeira.utils.dbconnection;
import br.com.madeira.webtests.CadastroPageValidationTest;
import br.com.madeira.webtests.FretePageValidationTest;

@RunWith(Categories.class)
@IncludeCategory(NegativeSuiteRunner.class)
@SuiteClasses({ CadastroPageValidationTest.class, 
				FretePageValidationTest.class })


public class NegativeSuiteRunner {
	protected static WebDriver driver;
	public static Boolean isSuiteTestExecution = false;	
	static long startTime;
	static long endTime;
	static long totalTime;

	@BeforeClass
	public static void beforeClass() throws Exception {
		isSuiteTestExecution = true;		
		driver = Selenium.getDriver();
		driver.navigate().to(Property.SITE_ADDRESS);
		driver.manage().window().maximize();
		dbconnection db = new dbconnection();
		db.clean();
		System.out.println("Chrome Driver Iniciado Para Teste Negativos!");
	}

	@AfterClass
	public static void afterClass() throws Exception {
		driver.quit();
		
		endTime = System.currentTimeMillis();
		totalTime = endTime - startTime;
		System.out.println("Tempo de Execução Suite Teste: " + totalTime+ "Segundos");
		System.out.println("Driver Finalizado! Suuite Testes Negativos");
		}

	}
