package br.com.madeira.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import br.com.madeira.webtests.*;

public class dbconnection extends BaseTestcase {

	private static String dbUrl;
	private static String username;
	private static String password;
	private static String dbClass;
	private static String query;
	
	
	/**
	 * CLASSE CONEXÃO BD PARA EXECUTAR O DELETE DOS DADOS CADASTRADOS.
	 * 
	 */

	static {

		dbUrl = "jdbc:mysql://db.madeiramadeira.com.br/madeira_fc"; 
		username = "madeira"; // Default username is root
		password = "m2xIqNZn48zOM0J"; // Default password is root
		dbClass = "com.mysql.jdbc.Driver";
		query = "call clearTestsAuto();"; // query execução delete
	}

	public void clean(){

		try {

			Class.forName(dbClass);
			Connection con = DriverManager.getConnection(dbUrl, username, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			System.out.println(query);
			System.out.println("Exclusão de Cadastro na Base de Dados!");
			con.close();
		} // end try

		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
