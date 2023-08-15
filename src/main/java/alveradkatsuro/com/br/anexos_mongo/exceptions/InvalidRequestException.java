package alveradkatsuro.com.br.anexos_mongo.exceptions;

import alveradkatsuro.com.br.anexos_mongo.enumeration.ErrorType;
import lombok.Getter;

@Getter
public class InvalidRequestException extends Exception {

    private final String internalCode;

    public InvalidRequestException(String message, String internalCode) {
        super(message);
        this.internalCode = internalCode;
    }

    public InvalidRequestException() {
        super(ErrorType.REPORT_001.getMessage());
        this.internalCode = ErrorType.REPORT_001.getInternalCode();
    }
}
