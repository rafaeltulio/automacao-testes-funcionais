package br.com.madeira.WStest;

import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import com.jayway.restassured.http.ContentType;

import org.junit.Test;

public class APICadastroPageValidationTest {

	public APICadastroPageValidationTest(){		
		baseURI = "https://bkp4.madeiramadeira.com.br/ajax/verifycustomer";
	}
	
/**
 * 	VALIDAR O SERVIÇO VALIÇÃO DE E-MAIL NO CADASTRO DE CLIENTES
 */
	@Test
	public void testValidarEmailNaoCadastrado() {
		given().header("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.95 Safari/537.36")
			.param("email", "automacao@madeiramadeira.com.br")
		.when()
			.get()
		.then().log().all()
			.assertThat()
				.statusCode(200)
				.contentType(ContentType.JSON)
				.body("status", equalTo(200))
				.body("message", containsString("CPF n\u00e3o cadastrado"));
	}
	
	@Test
	public void testValidarEmailCadastrado() {
		given().header("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.95 Safari/537.36")
			.param("email", "teste@madeiramadeira.com.br")
		.when()
			.get()
		.then().log().all()
			.assertThat()
				.statusCode(200)
				.contentType(ContentType.JSON)
				.body("status", equalTo(204))
				.body("message", containsString("CPF j\u00e1 cadastrado"));
	}
}


