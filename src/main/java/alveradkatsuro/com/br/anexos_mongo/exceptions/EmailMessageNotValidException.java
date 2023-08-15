package alveradkatsuro.com.br.anexos_mongo.exceptions;

import lombok.Getter;

@Getter
public class EmailMessageNotValidException extends Exception {
    private final String internalCode;

    public EmailMessageNotValidException(String message, String internalCode) {
        super(message);
        this.internalCode = internalCode;
    }
}
