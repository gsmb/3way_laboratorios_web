package dao;

import model.Livro;

public interface Dao {

	// CRUD: CRIAR, RECUPERAR, UPDATE, DELETE
	
	public Livro criar(Livro modelo);
	public Livro recuperar(Long id);
	public Livro alterar(Livro modelo);
	public Livro deletar()
	
	
	
}
