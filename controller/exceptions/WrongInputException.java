package project01.controller.exceptions;

import java.io.IOException;
import static project01.constants.Constants.*;

public class WrongInputException extends IOException {

    @Override
    public String getMessage() {
        return OUT_OF_INPUT_RANGE.toString();
    }
}
