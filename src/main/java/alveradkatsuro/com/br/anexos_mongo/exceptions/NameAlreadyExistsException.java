package alveradkatsuro.com.br.anexos_mongo.exceptions;

import lombok.Getter;

@Getter
public class NameAlreadyExistsException extends Exception {
    private final String internalCode;

    public NameAlreadyExistsException(String message, String internalCode) {
        super(message);
        this.internalCode = internalCode;
    }
}
