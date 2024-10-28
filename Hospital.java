import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String name;
    private String address;
    private List<Patient> patients;
    private List<MedicalStaff> staffList;

    public Hospital(String name, String address) {
        this.name = name;
        this.address = address;
        this.patients = new ArrayList<>();
        this.staffList = new ArrayList<>();
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public List<MedicalStaff> getStaffList() {
        return staffList;
    }

    public void registerPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient registered: " + patient.getName());
    }

    public void addStaff(MedicalStaff staff) {
        staffList.add(staff);
        System.out.println("Staff added: " + staff.getName());
    }

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
