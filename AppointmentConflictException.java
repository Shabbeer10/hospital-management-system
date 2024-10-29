/**
 * The `AppointmentConflictException` class is a custom exception in Java used to indicate conflicts in
 * appointment scheduling.
 */
public class AppointmentConflictException extends RuntimeException {
    public AppointmentConflictException(String message) {
        super(message);
    }
}
