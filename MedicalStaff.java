
public abstract class MedicalStaff {
    private int staffId;
    private String name;
    private String department;
    private String specialization;

    // This is a constructor for the `MedicalStaff` class in Java. It initializes the `staffId`,
    // `name`, `department`, and `specialization` fields of a `MedicalStaff` object with the values
    // passed as arguments when creating a new instance of `MedicalStaff`.
    public MedicalStaff(int staffId, String name, String department, String specialization) {
        this.staffId = staffId;
        this.name = name;
        this.department = department;
        this.specialization = specialization;
    }

    // The `getStaffId()` method is a getter method that returns the `staffId` of a `MedicalStaff`
    // object. It allows other classes to access the `staffId` field of a `MedicalStaff` object.
    public int getStaffId() {
        return staffId;
    }

    public String getName() {
        return name;
    }

    public abstract void viewSchedule();
}
