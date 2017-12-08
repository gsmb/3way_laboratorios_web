package dao;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Logger;

import javax.naming.spi.DirStateFactory.Result;

import data.FabricaConexao;
import model.Livro;

public class LivroDao {

	Logger LOG = Logger.getGlobal();
	
	private static final String OBTER_POR_ID_SQL = "SELECT AUTOR, TITULO, COD_LIVRO, IMAGEM, PRECO, DESCRICAO FROM ESTOQUE WHERE COD_LIVRO =?";
	
	private static final String CONSULTA_SQL ="SELECT COD_LIVROTITULO, COD_LIVRO, IMAGEM, PRECO, DESCRICAO FROM ESTOQUE WHERE TITULO LIKE ?";
	
	public Livro consultar(int codigo){
		Livro livro = null;
		try (Connection conexao = FabricaConexao.getConnection();PreparedStatement consulta = conexao.prepareStatement(OBTER_POR_ID_SQL);){
			consulta.setInt(1, codigo);
			ResultSet resultado = consulta.executeQuery();
			if(resultado.next()){
				livro = new Livro();
				livro.setAutor(resultado.getString("AUTOR"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
				
		return livro;
		
	}
	public List<Livro>co
}
