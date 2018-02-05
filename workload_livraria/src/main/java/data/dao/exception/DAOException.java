package data.dao.exception;

public class DAOException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DAOException() {
		this("Erro desconhecido no DAO");
	}

	public DAOException(String message) {
		super(message);
	}

	public DAOException(Throwable cause) {
		this("Erro desconhecido no DAO", cause);
	}

	public DAOException(String message, Throwable cause) {
		super(message, cause);
	}

	public DAOException(String message, Throwable cause,boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
