import java.util.ArrayList;
import java.util.List;

public class Doctor extends MedicalStaff {
    private List<Appointment> appointments;

    public Doctor(int staffId, String name, String department, String specialization) {
        super(staffId, name, department, specialization);
        this.appointments = new ArrayList<>();
    }

    public void addAppointment(Appointment appointment) {
        appointments.add(appointment);
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    @Override
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
