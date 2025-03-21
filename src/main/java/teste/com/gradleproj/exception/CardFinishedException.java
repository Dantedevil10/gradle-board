package teste.com.gradleproj.exception;

public class CardFinishedException extends RuntimeException{

    public CardFinishedException(final String message) {
        super(message);
    }
}
