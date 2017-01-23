package br.com.madeira.WStest;

import static com.jayway.restassured.RestAssured.baseURI;
import static com.jayway.restassured.RestAssured.given;

import org.junit.Test;


public class APIFretePageValidationTest {

	public APIFretePageValidationTest() {
		baseURI = "https://www.madeiramadeira.com.br/ajax/freight";
	}

	@Test
	public void test() {
		given().header("User-Agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_11_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.95 Safari/537.36")
		.param("destinationZip",82510060)
		.param("volumes[0][sku]",174028)
		.param("volumes[0][quantity]","1")
	.when()
		.post()
	.then().log().all();
//		.contentType(ContentType.HTML);
//		.body("message", containsString("CPF n\u00e3o cadastrado"));
}
}