import java.util.ArrayList;
import java.util.List;

public class Doctor extends MedicalStaff {
    private List<Appointment> appointments;

    // This is a constructor for the `Doctor` class in Java. It initializes a `Doctor` object with the
    // provided `staffId`, `name`, `department`, and `specialization` parameters by calling the
    // constructor of the superclass `MedicalStaff` using `super(staffId, name, department,
    // specialization)`.
    public Doctor(int staffId, String name, String department, String specialization) {
        super(staffId, name, department, specialization);
        this.appointments = new ArrayList<>();
    }

    /**
     * The addAppointment function adds a new appointment to a list of appointments.
     * 
     * @param appointment The `addAppointment` method is used to add an `Appointment` object to a
     * collection of appointments. The `appointment` parameter represents the `Appointment` object that
     * you want to add to the collection.
     */
    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    /**
     * The function `getAppointments()` returns a list of Appointment objects.
     * 
     * @return A List of Appointment objects is being returned.
     */
    public List<Appointment> getAppointments() {
        return appointments;
    }

    @Override
    // The `viewSchedule()` method in the `Doctor` class is responsible for displaying the schedule of
    // appointments for a particular doctor. Here's a breakdown of what it does:
    public void viewSchedule() {
        if (appointments.isEmpty()) {
            System.out.println("No scheduled appointments for Dr. " + getName());
        } else {
            System.out.println("Schedule for Dr. " + getName() + ":");
            for (Appointment appointment : appointments) {
                System.out.println(appointment);
            }
        }
    }
}
