# Hospital Management System

A console-based Java application that simulates a basic Hospital Management System. This application allows users to register patients, add doctors, schedule appointments, and view doctors' schedules. It demonstrates object-oriented programming principles, including inheritance, polymorphism, and exception handling.

## Features

- **Register Patients**: Add a new patient to the hospital system with details like name, age, and gender.
- **Add Doctors**: Register doctors by assigning them to a specific department and specialization.
- **Schedule Appointments**: Schedule appointments for patients with available doctors and manage appointment conflicts.
- **View Doctor’s Schedule**: View the complete schedule for any registered doctor.

## Technologies Used

- **Java**: Core programming language used for development.
- **OOP Principles**: Classes, inheritance, polymorphism, and exception handling.
- **Date and Time Parsing**: SimpleDateFormat used to manage dates for appointments.

## Project Structure

The application contains the following main classes:

- **Hospital**: Manages lists of `Patient` and `MedicalStaff` (such as `Doctor`), and handles scheduling appointments.
- **Patient**: Stores patient information and their appointment list.
- **MedicalStaff** (Abstract Class): Base class for medical staff members, extended by `Doctor`.
- **Doctor**: Extends `MedicalStaff`, containing a list of appointments and methods for scheduling.
- **Appointment**: Holds details of a patient’s appointment with a doctor, including date and time.
- **AppointmentConflictException**: Custom exception to handle scheduling conflicts when two appointments overlap.

## Installation and Setup

1. **Clone the repository**:

    ```bash
    git clone https://github.com/yourusername/HospitalManagementSystem.git
    cd HospitalManagementSystem
    ```

2. **Compile the application**:
    Compile all `.java` files to create executable classes.

    ```bash
    javac *.java
    ```

3. **Run the application**:

    ```bash
    java HospitalManagementSystem
    ```

## Usage

When you start the application, a main menu appears with the following options:

1. Register Patient
2. Add Doctor
3. Schedule Appointment
4. View Doctor's Schedule
5. Exit

Select an option by entering the corresponding number. Follow the prompts to enter required details for each operation.

## Contributing

Feel free to submit issues or pull requests to enhance the functionality of this application. Contributions are welcome!

## License

This project is licensed under the MIT License. See the LICENSE file for more details.
