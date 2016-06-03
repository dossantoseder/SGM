package br.com.sgm.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BDMySql {
	private static BDMySql singleton = null;
	private static Connection con = null;

	// padrao de projeto que cria uma unica instancia da classe BDMySql
	public static BDMySql getInstance() {
		if (singleton == null) {
			singleton = new BDMySql();
		}
		return singleton;
	}

	// construtor que conecta ao banco
	private BDMySql() {
		try {

			String url = "jdbc:postgresql://localhost:5432/sgm";
			String usuario = "postgres";
			String senha = "postgres";
			/*
			 * String url = "jdbc:mysql://localhost:3306/sgm";
			 * String usuario ="root";
			 * String senha = "p0s25@05";
			 */

			// Class.forName("com.mysql.jdbc.Driver").newInstance();
			Class.forName("org.postgresql.Driver").newInstance();

			con = DriverManager.getConnection(url, usuario, senha);

		} catch (SQLException e) {
			System.out.println("Nao foi possivel realizar a conexao.");
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Connection getConexao() {

		return con;

	}
}
