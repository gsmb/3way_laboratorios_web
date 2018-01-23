package data.dao;

import data.dao.exception.DAOException;

public interface Dao<ModelType> {

	ModelType create(ModelType modelo) throws DAOException;

	ModelType recuperar(Long id) throws DAOException;

	ModelType update(Long id, String chave, String valor) throws DAOException;

	ModelType delete(ModelType modelo) throws DAOException;
}
