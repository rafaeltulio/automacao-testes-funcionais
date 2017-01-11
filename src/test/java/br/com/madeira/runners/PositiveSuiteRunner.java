package br.com.madeira.runners;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import br.com.madeira.categories.RegressionTests;
import br.com.madeira.webtests.CadastroPageValidationTest;

@RunWith(Categories.class)
@IncludeCategory(RegressionTests.class)
@SuiteClasses({CadastroPageValidationTest.class})

public class PositiveSuiteRunner {	

}
