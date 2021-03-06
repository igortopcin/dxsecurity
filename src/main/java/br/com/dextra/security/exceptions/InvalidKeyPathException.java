package br.com.dextra.security.exceptions;

public class InvalidKeyPathException extends SecurityException {

	private static final long serialVersionUID = -5487069562392266139L;

	public InvalidKeyPathException(String path) {
		super("Invalid key path : " + path);
	}
}
