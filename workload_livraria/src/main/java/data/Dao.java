package data;

public interface Dao<ModelType> {

	ModelType criar (ModelType modelo);
	ModelType recuperar(int id  );
	ModelType alterar(ModelType modelo);
	ModelType excluir(int id);
}
