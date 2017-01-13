package br.com.madeira.pageObjects;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuracoes {
	public static String lerConfiguracao(String chaveConfiguracao) throws IOException {
		Properties properties = new Properties();
		FileInputStream file = new FileInputStream("src/test/resources/ConfiguracoesPRD.properties");
		properties.load(file);
		System.out.println("Lendo a chave " + chaveConfiguracao);
		return properties.getProperty(chaveConfiguracao);
	}
}
