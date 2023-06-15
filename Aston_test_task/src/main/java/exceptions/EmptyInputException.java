package exceptions;

public class EmptyInputException extends Exception {
    public EmptyInputException() {
        super("Вы ничего не ввели");
    }
}
