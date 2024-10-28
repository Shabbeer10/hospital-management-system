
public abstract class MedicalStaff {
    private int staffId;
    private String name;
    private String department;
    private String specialization;

    public MedicalStaff(int staffId, String name, String department, String specialization) {
        this.staffId = staffId;
        this.name = name;
        this.department = department;
        this.specialization = specialization;
    }

    public int getStaffId() {
        return staffId;
    }

    public String getName() {
        return name;
    }

    public abstract void viewSchedule();
}
