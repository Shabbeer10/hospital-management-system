import java.util.ArrayList;
import java.util.List;

/*
 The `Patient` class represents a patient with attributes such as id, name, age, gender, and a list
 of appointments.
 */
public class Patient {
    private int id;
    private String name;
    private int age;
    private String gender;
    private List<Appointment> appointments;

    // This is a constructor for the `Patient` class in Java. It initializes a `Patient` object with
    // the provided `id`, `name`, `age`, and `gender` values. It also initializes the `appointments`
    // list as an empty ArrayList. This constructor allows you to create a new `Patient` object with
    // the specified attributes.
    public Patient(int id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.appointments = new ArrayList<>();
    }

    // These are getter methods in the `Patient` class.
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    /**
     * The addAppointment function adds a new Appointment object to a list of appointments.
     * 
     * @param appointment The `addAppointment` method is used to add an `Appointment` object to a
     * collection of appointments. The `appointment` parameter represents the `Appointment` object that
     * you want to add to the collection.
     */
    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }
}
