package dao;

import java.util.Iterator;
import java.util.List;

import model.ModelType;

public class Pesquisa {

	public static void main(String[] args) {

		String titulo = "CASSINO";
		
		LivroDao dao = new LivroDao();
		
		List<ModelType> livros = dao.consultar(titulo);
		for (ModelType livro : livros) {
			System.out.println("Desc.: "+livro.getDescricao() + "Preço: "+livro.getPreco()
					);
		}	
		
	}

}
