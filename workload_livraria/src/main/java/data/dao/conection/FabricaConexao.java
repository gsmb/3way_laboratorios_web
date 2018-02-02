package data.dao.conection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FabricaConexao {

	public static String url = "jdbc:postgresql://localhost:5432/livraria_ter-qui";
	public static String usuario = "postgres";
	public static String senha = "12345";

	public static Connection getConnection() {
		try {
			Class.forName("org.postgresql.Driver");
			return DriverManager.getConnection(url, usuario, senha);
		} catch (ClassNotFoundException e) {
			System.out.println("Erro do driver de banco");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Erro de conexao com o banco");
			e.printStackTrace();
		}

		return null;
	}

}
