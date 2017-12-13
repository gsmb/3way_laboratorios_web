package data;

import java.sql.*;

public class FabricaConexao {

	static final String url = "jdbc:postgresql://localhost:5432/teste_banco";
	static final String usuario = "postgres";
	static final String senha = "12345";

	public static Connection getConnection() throws SQLException {
		try {
			Class.forName("org.postgresql.Driver");
			return DriverManager.getConnection(url, usuario, senha);
		} catch (Exception e) {
			throw new SQLException(e.getMessage());
			// e.printStackTrace();
		}

	}

}
