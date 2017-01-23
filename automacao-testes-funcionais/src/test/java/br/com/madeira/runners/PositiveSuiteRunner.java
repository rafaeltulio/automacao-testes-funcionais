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
import br.com.madeira.webtests.CadastroPageValidationTest;

@RunWith(Categories.class)
@IncludeCategory(PositiveSuiteRunner.class)
@SuiteClasses({CadastroPageValidationTest.class})

public class PositiveSuiteRunner {
	protected static WebDriver driver;
	public static Boolean isSuiteTestExecution = false;

	@BeforeClass
	public static void beforeClass() throws Exception {
		isSuiteTestExecution = true;
		driver = Selenium.getDriver();
		driver.navigate().to(Property.SITE_ADDRESS);
	}

	@AfterClass
	public static void afterClass() throws Exception {
		driver.quit();
	}

}
