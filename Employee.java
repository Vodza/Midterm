import java.time.LocalDate;

public abstract class Employee {
    public static long Employee_count = 0;
    protected String id;
    protected String fullName;
    protected LocalDate birthday;
    protected String phone;
    protected String email;
    protected String employee_type;

    public Employee() {
    }

    public Employee(String id, String fullName, LocalDate birthday, String phone, String email) {
        this.id = id;
        this.fullName = fullName;
        this.birthday = birthday;
        this.phone = phone;
        this.email = email;
    }

    public abstract void showInfo();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}