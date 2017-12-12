package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.naming.spi.DirStateFactory.Result;

import data.FabricaConexao;
import model.Livro;

public class LivroDao {

	Logger LOG = Logger.getGlobal();
	
	private static final String OBTER_POR_ID_SQL = "SELECT AUTOR, TITULO, COD_LIVRO, IMAGEM, PRECO, DESCRICAO FROM ESTOQUE WHERE COD_LIVRO =?";
	
	private static final String CONSULTA_SQL ="SELECT COD_LIVROTITULO, COD_LIVRO, IMAGEM, PRECO, DESCRICAO FROM ESTOQUE WHERE TITULO LIKE ?";

	private static final String CONSULTAR_SQL = null;
	
	public Livro consultar(int codigo){
		Livro livro = null;
		try (Connection conexao = FabricaConexao.getConnection();PreparedStatement consulta = conexao.prepareStatement(OBTER_POR_ID_SQL);){
			consulta.setInt(1, codigo);
			ResultSet resultado = consulta.executeQuery();
			if(resultado.next()){
				livro = new Livro();
				livro.setAutor(resultado.getString("AUTOR"));
				livro.setCodigo(resultado.getInt("COD_LIVRO"));
				livro.setImagem(resultado.getString("IMAGEM"));
				livro.setPreco(resultado.getDouble("PRECO"));
				livro.setTitulo(resultado.getString("TITULO"));
				livro.setDescricao(resultado.getNString("DESCRICAO"));
				
				resultado.close();
			}
		} catch (SQLException e) {

			LOG.severe(e.toString());
		}
				
		return livro;
		
	}
	public List<Livro> consultar(String titulo){
		java.util.List<Livro> lista = new ArrayList<Livro>();
		try (Connection conexao = FabricaConexao.getConnection(); PreparedStatement consulta = conexao.prepareStatement(CONSULTAR_SQL);){
			consulta.setString(1, "%" + titulo.toUpperCase()+"%");
			ResultSet resultado = consulta.executeQuery();
			
			while (resultado.next()){
				Livro livro = new Livro();
				
				
				lista.add(livro);
			}
			resultado.close();
		} catch (SQLException e) {
			LOG.severe(e.toString());
		}
		return lista;
	}
	
	
}
