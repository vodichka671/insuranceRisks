package project01.controller.console_reader;

import project01.controller.exceptions.IllegalInputException;
import project01.controller.exceptions.WrongInputException;
import java.util.Scanner;

public class ConsoleReader {

    public static int chooseBetwen(int lowLimt, int highLimit, int shift)throws WrongInputException, IllegalInputException {
        Scanner scanner = new Scanner(System.in);
        int input;
        if (!scanner.hasNextInt()) {
            scanner.next();
            throw new IllegalInputException();
        }
        input = scanner.nextInt();
        if (input < lowLimt || input > highLimit){
            throw new WrongInputException();
        }
        return input + shift;
    }
}
