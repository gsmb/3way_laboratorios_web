package data.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import data.dao.conection.FabricaConexao;
import data.dao.exception.DAOException;
import data.model.Livro;

public  class LivroDao implements Dao<Livro>, ProjecoesLivro {
	
	public static final String OBTER_LIVRO_COD = "" +"Select * from estoque e where e.cod_livro = ?;";
	public static final String OBTER_LIVROS_POR_CHAVE_VALOR = "Select * from estoque e where e.? like ?;";
	
	

	public Livro criar(Livro modelo) throws DAOException {
		try (Connection con = FabricaConexao.getConnection();){
			PreparedStatement ps = con.prepareStatement(Livro.CREATE_LIVRO);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return null;
	}

	public Livro recuperar(int id) {
		
		return null;
	}

	public Livro alterar(Livro modelo) {
	
		return null;
	}

	public Livro excluir(int id) {
		
		return null;
	}
// implementar os metodos....

	public Livro create(Livro modelo) {
		// TODO Auto-generated method stub
		return null;
	}

	public Livro recuperar(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Livro update(long id, String chave, String valor) {
		// TODO Auto-generated method stub
		return null;
	}

	public Livro delete(Livro modelo) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Livro> livrosPorChaveValor(String chave, String valor) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Livro> livrosPorCodigo(String codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Livro> livrosPorPreco(double preco) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
