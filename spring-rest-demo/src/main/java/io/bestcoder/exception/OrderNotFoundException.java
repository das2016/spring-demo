package io.bestcoder.exception;

public class OrderNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8879661226885013838L;
	

	public OrderNotFoundException(Long id) {
	    super("Could not find order " + id);
	  }

}
