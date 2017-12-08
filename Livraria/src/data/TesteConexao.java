package data;

import java.sql.Connection;
import java.sql.SQLException;

public class TesteConexao {

	public static void main(String[] args) {

		Connection con;

		try {
			con = FabricaConexao.getConnection();
			if (con != null) {
				System.out.println("Conex�o Estabelecida");
				con.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
