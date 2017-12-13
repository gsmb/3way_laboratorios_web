package dao;

import java.util.Iterator;
import java.util.List;

import model.Livro;

public class Pesquisa {

	public static void main(String[] args) {

		String titulo = "CASSINO";
		
		LivroDao dao = new LivroDao();
		
		List<Livro> livros = dao.consultar(titulo);
		for (Livro livro : livros) {
			System.out.println("Desc.: "+livro.getDescricao() + "Preço: "+livro.getPreco()
					);
		}	
		
	}

}
