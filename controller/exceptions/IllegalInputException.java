package project01.controller.exceptions;

import static project01.constants.Constants.*;

public class IllegalInputException extends NoSuchFieldException {

    @Override
    public String getMessage() {
        return WARNING.toString();
    }
}
