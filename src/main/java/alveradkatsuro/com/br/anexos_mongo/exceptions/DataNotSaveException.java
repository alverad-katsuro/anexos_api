package alveradkatsuro.com.br.anexos_mongo.exceptions;

import lombok.Getter;

@Getter
public class DataNotSaveException extends Exception {

    private final String internalCode;

    public DataNotSaveException(String message, String internalCode) {
        super(message);
        this.internalCode = internalCode;
    }

}
