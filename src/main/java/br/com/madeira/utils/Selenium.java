/**
 * 
 */
package br.com.madeira.utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.collect.ImmutableMap;

/**
 * Classe Utils para o Selenium Identifica qual o browser escolhido no arquivo
 * de configuracao 'config.properties' e inicializa o webdriver correspondente *
 * 
 * @author ti-16
 * 
 */
public class Selenium {

	private static WebDriver driver = null;

	/**
	 * Verifica qual o browser escolhido no arquivo de propriedades inicializa o
	 * driver apropriado e o retorna
	 * 
	 * @return retorna inst�ncia do WebDriver
	 * @throws IOException 
	 */

	public static WebDriver getDriver() throws IOException {
		String browser = Property.BROWSER_NAME;
		if (driver == null) {
			if (Browser.CHROME.equals(browser)) {
				ChromeDriverService service = new ChromeDriverService.Builder().usingDriverExecutable(new File(System.getProperty("webdriver.chrome.driver"))).usingAnyFreePort()
					    .withEnvironment(ImmutableMap.of("DISPLAY", System.getProperty("webdriver.display"))).build();
					  service.start();
					  driver = new ChromeDriver(service, obterCapabilitiesChrome());				
				
				driver = new ChromeDriver();
			}

		}
		return driver;
	}

	private static ChromeOptions obterCapabilitiesChrome() {
		// TODO Auto-generated method stub
		return null;
	}

}
