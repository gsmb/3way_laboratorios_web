package service;

import java.util.List;

import data.dao.LivroDao;
import data.model.Livro;

public class LivroService {

	private LivroDao livroDao;
	
	public List<Livro> listeLivro(){
		livroDao = new LivroDao();
		
		return livroDao.listeLivro();
	}
}
