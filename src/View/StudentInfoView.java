package View;

public class StudentInfoView extends JPanel {
    private JLabel nameLabel, genderLabel, phoneNumberLabel, emailLabel, departmentLabel, semesterLabel, studentIdLabel, gradeLabel;

    public StudentInfoView() {
        setLayout(new GridLayout(8, 2));
        nameLabel = new JLabel("Name: ");
        genderLabel = new JLabel("Gender: ");
        phoneNumberLabel = new JLabel("Phone Number: ");
        emailLabel = new JLabel("Email: ");
        departmentLabel = new JLabel("Department: ");
        semesterLabel = new JLabel("Semester: ");
        studentIdLabel = new JLabel("Student ID: ");
        gradeLabel = new JLabel("Grade: ");

        add(nameLabel);
        add(new JLabel(""));
        add(genderLabel);
        add(new JLabel(""));
        add(phoneNumberLabel);
        add(new JLabel(""));
        add(emailLabel);
        add(new JLabel(""));
        add(departmentLabel);
        add(new JLabel(""));
        add(semesterLabel);
        add(new JLabel(""));
        add(studentIdLabel);
        add(new JLabel(""));
        add(gradeLabel);
        add(new JLabel(""));
    }

    public void setStudentInfo(UserDTO student) {
        nameLabel.setText("Name: " + student.getName());
        genderLabel.setText("Gender: " + student.getGender());
        phoneNumberLabel.setText("Phone Number: " + student.getPhoneNumber());
        emailLabel.setText("Email: " + student.getEmail());
        departmentLabel.setText("Department: " + student.getDepartment());
        semesterLabel.setText("Semester: " + student.getSemester());
        studentIdLabel.setText("Student ID: " + student.getStudentId());
        gradeLabel.setText("Grade: " + student.getGrade());
    }
}

