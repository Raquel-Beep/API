package org.serratec.raquel.exception;

public class EntradaDuplicadaExcepition extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public EntradaDuplicadaExcepition(String message) {
        super(message);
    }   
    
}
