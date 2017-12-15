package dao;

import model.ModelType;

public interface Dao {

	// CRUD: CREAT, REMOVE, UPDATE, DELETE
	
	 ModelType criar(ModelType modelo);
	 ModelType recuperar(Long id);
	 ModelType alterar(ModelType modelo);
	 ModelType deletar(ModelType modelo);
	
	
	
}
