import java.util.Date;

/**
 * The `Appointment` class represents an appointment with details such as ID, patient, doctor, date,
 * and time.
 */
public class Appointment {
    private int appointmentId;
    private Patient patient;
    private Doctor doctor;
    private Date date;
    private String time;

    // The `public Appointment` constructor in the `Appointment` class is initializing a new
    // appointment object with the provided parameters. It takes in an appointment ID, a `Patient`
    // object representing the patient, a `Doctor` object representing the doctor, a `Date` object
    // representing the date of the appointment, and a `String` representing the time of the
    // appointment.
    public Appointment(int appointmentId, Patient patient, Doctor doctor, Date date, String time) {
        this.appointmentId = appointmentId;
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.time = time;
    }

    // These methods in the `Appointment` class are providing functionality to retrieve specific
    // information about an appointment object:
    public Date getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    @Override
    public String toString() {
        return "Appointment [ID=" + appointmentId + ", Patient=" + patient.getName() + ", Doctor=" + doctor.getName() + ", Date=" + date + ", Time=" + time + "]";
    }
}
