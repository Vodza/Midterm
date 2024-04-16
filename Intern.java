import java.time.LocalDate;

public class Intern extends Employee {
    private String major;
    private int semester;
    private String universityName;

    public Intern() {
    }

    public Intern(String major, int semester, String universityName) {
        this.major = major;
        this.semester = semester;
        this.universityName = universityName;
    }

    public Intern(String id, String fullName, LocalDate birthday, String phone, String email, String major, int semester, String universityName) {
        super(id, fullName, birthday, phone, email);
        this.major = major;
        this.semester = semester;
        this.universityName = universityName;
    }

    @Override
    public void showInfo() {
        System.out.println(this);
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String toString() {
        return "Intern{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", birthday=" + birthday +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", major='" + major + '\'' +
                ", semester=" + semester +
                ", universityName='" + universityName + '\'' +
                '}';
    }
}