import java.util.ArrayList;
import java.util.List;

public class Patient {
    private int id;
    private String name;
    private int age;
    private String gender;
    private List<Appointment> appointments;

    public Patient(int id, String name, int age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.appointments = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }
}
