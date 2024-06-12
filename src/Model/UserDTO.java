package Model;

/**
 * UserDTO Class
 * 유저의 정보를 저장하는 Class
 */

public class UserDTO {
    private String id;
    private String password;
    private String name;
    private String gender;
    private String phoneNumber;
    private String email;
    private String department;
    private String semester;
    private String studentId;
    private String grade;
    private String type; // "student" or "teacher"

    public UserDTO(String id, String password, String name, String gender, String phoneNumber, String email, String department, String semester, String studentId, String type) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.department = department;
        this.semester = semester;
        this.studentId = studentId;
        this.type = type;
    }

    // Getter and setter methods
    public String getId() { return id; }
    public String getPassword() { return password; }
    public String getName() { return name; }
    public String getGender() { return gender; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getEmail() { return email; }
    public String getDepartment() { return department; }
    public String getSemester() { return semester; }
    public String getStudentId() { return studentId; }
    public String getGrade() { return grade; }
    public String getType() { return type; }

    public void setId(String id) { this.id = id; }
    public void setPassword(String password) { this.password = password; }
    public void setName(String name) { this.name = name; }
    public void setGender(String gender) { this.gender = gender; }
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public void setEmail(String email) { this.email = email; }
    public void setDepartment(String department) { this.department = department; }
    public void setSemester(String semester) { this.semester = semester; }
    public void setStudentId(String studentId) { this.studentId = studentId; }
    public void setGrade(String grade) { this.grade = grade; }
    public void setType(String type) { this.type = type; }
}