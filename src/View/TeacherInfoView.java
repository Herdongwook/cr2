package View;

public class TeacherInfoView extends JPanel {
    private JLabel nameLabel, genderLabel, phoneNumberLabel, emailLabel, departmentLabel, semesterLabel;

    public TeacherInfoView() {
        setLayout(new GridLayout(6, 2));
        nameLabel = new JLabel("Name: ");
        genderLabel = new JLabel("Gender: ");
        phoneNumberLabel = new JLabel("Phone Number: ");
        emailLabel = new JLabel("Email: ");
        departmentLabel = new JLabel("Department: ");
        semesterLabel = new JLabel("Semester: ");

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
    }

    public void setTeacherInfo(UserDTO teacher) {
        nameLabel.setText("Name: " + teacher.getName());
        genderLabel.setText("Gender: " + teacher.getGender());
        phoneNumberLabel.setText("Phone Number: " + teacher.getPhoneNumber());
        emailLabel.setText("Email: " + teacher.getEmail());
        departmentLabel.setText("Department: " + teacher.getDepartment());
        semesterLabel.setText("Semester: " + teacher.getSemester());
    }
}
