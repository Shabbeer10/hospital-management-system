import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String name;
    private String address;
    private List<Patient> patients;
    private List<MedicalStaff> staffList;

    // This is a constructor for the `Hospital` class in Java. It initializes a new instance of the
    // `Hospital` class with the provided `name` and `address`. It also initializes the `patients` and
    // `staffList` lists as empty ArrayLists to store patient and staff information within the hospital
    // object.
    public Hospital(String name, String address) {
        this.name = name;
        this.address = address;
        this.patients = new ArrayList<>();
        this.staffList = new ArrayList<>();
    }

    // These methods `getPatients()` and `getStaffList()` are getter methods in the `Hospital` class in
    // Java.
    public List<Patient> getPatients() {
        return patients;
    }

    public List<MedicalStaff> getStaffList() {
        return staffList;
    }

    /**
     * The function `registerPatient` adds a patient to a list and prints a message confirming the
     * registration.
     * 
     * @param patient The parameter `patient` is an object of type `Patient`, which represents a
     * patient entity with attributes such as name, age, gender, etc.
     */
    public void registerPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient registered: " + patient.getName());
    }

    /**
     * The addStaff function adds a MedicalStaff object to a list and prints a message with the staff's
     * name.
     * 
     * @param staff The parameter `staff` in the `addStaff` method is an object of type `MedicalStaff`.
     */
    public void addStaff(MedicalStaff staff) {
        staffList.add(staff);
        System.out.println("Staff added: " + staff.getName());
    }

    /**
     * The `scheduleAppointment` function checks for conflicts and schedules an appointment for a
     * doctor.
     * 
     * @param appointment The `scheduleAppointment` method takes an `Appointment` object as a
     * parameter. This method is responsible for scheduling the appointment by checking for any
     * conflicts with existing appointments for the same doctor.
     */
    public void scheduleAppointment(Appointment appointment) {
        for (Appointment a : appointment.getDoctor().getAppointments()) {
            if (a.getDate().equals(appointment.getDate()) && a.getTime().equals(appointment.getTime())) {
                throw new AppointmentConflictException("Appointment time conflict for Doctor: " + appointment.getDoctor().getName());
            }
        }
        appointment.getDoctor().addAppointment(appointment);
        System.out.println("Appointment scheduled: " + appointment);
    }
}
