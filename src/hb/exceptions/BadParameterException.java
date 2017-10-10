package hb.exceptions;

public class BadParameterException extends Exception {

	private static final long serialVersionUID = 2621812501769476417L;

	public BadParameterException(final String msg) {
		super(msg);
	}
}
