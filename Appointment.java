import java.util.Date;

public class Appointment {
    private int appointmentId;
    private Patient patient;
    private Doctor doctor;
    private Date date;
    private String time;

    public Appointment(int appointmentId, Patient patient, Doctor doctor, Date date, String time) {
        this.appointmentId = appointmentId;
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.time = time;
    }

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
