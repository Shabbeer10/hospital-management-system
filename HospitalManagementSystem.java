import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * The `HospitalManagementSystem` class in Java provides a console-based interface for managing
 * patients, doctors, appointments, and schedules in a hospital setting.
 */
public class HospitalManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital("City Hospital", "123 Health St.");

        while (true) {
            System.out.println("\nHospital Management System:");
            System.out.println("1. Register Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Schedule Appointment");
            System.out.println("4. View Doctor's Schedule");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Patient ID: ");
                    int patientId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Patient Name: ");
                    String patientName = scanner.nextLine();
                    System.out.print("Enter Patient Age: ");
                    int patientAge = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Patient Gender: ");
                    String patientGender = scanner.nextLine();

                    Patient newPatient = new Patient(patientId, patientName, patientAge, patientGender);
                    hospital.registerPatient(newPatient);
                }

                case 2 -> {
                    System.out.print("Enter Doctor ID: ");
                    int doctorId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Doctor Name: ");
                    String doctorName = scanner.nextLine();
                    System.out.print("Enter Department: ");
                    String department = scanner.nextLine();
                    System.out.print("Enter Specialization: ");
                    String specialization = scanner.nextLine();

                    Doctor newDoctor = new Doctor(doctorId, doctorName, department, specialization);
                    hospital.addStaff(newDoctor);
                }

                case 3 -> {
                    System.out.print("Enter Appointment ID: ");
                    int appointmentId = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Patient ID for Appointment: ");
                    int patientIdForAppointment = scanner.nextInt();
                    scanner.nextLine();
                    
                    Patient patientForAppointment = hospital.getPatients().stream()
                            .filter(patient -> patient.getId() == patientIdForAppointment)
                            .findFirst()
                            .orElse(null);
                    
                    if (patientForAppointment == null) {
                        System.out.println("Patient not found.");
                        break;
                    }

                    System.out.print("Enter Doctor ID for Appointment: ");
                    int doctorIdForAppointment = scanner.nextInt();
                    scanner.nextLine();
                    
                    Doctor doctorForAppointment = (Doctor) hospital.getStaffList().stream()
                            .filter(staff -> staff instanceof Doctor && staff.getStaffId() == doctorIdForAppointment)
                            .findFirst()
                            .orElse(null);
                    
                    if (doctorForAppointment == null) {
                        System.out.println("Doctor not found.");
                        break;
                    }

                    System.out.print("Enter Appointment Date (yyyy-MM-dd): ");
                    String dateStr = scanner.nextLine();
                    Date date = null;
                    try {
                        date = new SimpleDateFormat("yyyy-MM-dd").parse(dateStr);
                    } catch (ParseException e) {
                        System.out.println("Invalid date format.");
                        break;
                    }

                    System.out.print("Enter Appointment Time (e.g., 10:00 AM): ");
                    String time = scanner.nextLine();

                    Appointment appointment = new Appointment(appointmentId, patientForAppointment, doctorForAppointment, date, time);
                    try {
                        hospital.scheduleAppointment(appointment);
                    } catch (AppointmentConflictException e) {
                        System.out.println(e.getMessage());
                    }
                }

                case 4 -> {
                    System.out.print("Enter Doctor ID to View Schedule: ");
                    int viewDoctorId = scanner.nextInt();
                    scanner.nextLine();

                    Doctor viewDoctor = (Doctor) hospital.getStaffList().stream()
                            .filter(staff -> staff instanceof Doctor && staff.getStaffId() == viewDoctorId)
                            .findFirst()
                            .orElse(null);
                    
                    if (viewDoctor != null) {
                        viewDoctor.viewSchedule();
                    } else {
                        System.out.println("Doctor not found.");
                    }
                }

                case 5 -> {
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                }

                default -> System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
