package View;

import Model.UserDTO;

import javax.swing.*;
import java.awt.*;
/**
 * SignUpView Class
 * 회원가입 View를 갖는 Class 로 비즈니스 로직은 없다.
 */

public class SignUpView extends JPanel {
    private JTextField idField, pwField, nameField, genderField, phoneNumberField, emailField, departmentField, semesterField, studentIdField;
    private JComboBox<String> typeComboBox;
    private JButton duplicateButton, signUpButton, emailButton, exitButton;
    private JLabel emailChkLabel;

    public SignUpView() {
        setLayout(new GridLayout(12, 2));

        idField = new JTextField();
        pwField = new JTextField();
        nameField = new JTextField();
        genderField = new JTextField();
        phoneNumberField = new JTextField();
        emailField = new JTextField();
        departmentField = new JTextField();
        semesterField = new JTextField();
        studentIdField = new JTextField();
        typeComboBox = new JComboBox<>(new String[]{"student", "teacher"});

        duplicateButton = new JButton(Constants.DUPLICATE_TXT);
        signUpButton = new JButton(Constants.SIGNUP_TXT);
        emailButton = new JButton(Constants.EMAIL_TXT);
        exitButton = new JButton(Constants.EXIT_TXT);

        emailChkLabel = new JLabel("Email not checked");

        add(new JLabel("ID:"));
        add(idField);
        add(new JLabel("Password:"));
        add(pwField);
        add(new JLabel("Name:"));
        add(nameField);
        add(new JLabel("Gender:"));
        add(genderField);
        add(new JLabel("Phone Number:"));
        add(phoneNumberField);
        add(new JLabel("Email:"));
        add(emailField);
        add(new JLabel("Department:"));
        add(departmentField);
        add(new JLabel("Semester:"));
        add(semesterField);
        add(new JLabel("Student ID:"));
        add(studentIdField);
        add(new JLabel("Type:"));
        add(typeComboBox);
        add(duplicateButton);
        add(emailButton);
        add(emailChkLabel);
        add(signUpButton);
        add(exitButton);

        duplicateButton.addActionListener(new SignUpController(this));
        signUpButton.addActionListener(new SignUpController(this));
        emailButton.addActionListener(new SignUpController(this));
        exitButton.addActionListener(new SignUpController(this));
    }

    public String getId() { return idField.getText(); }
    public String getPw() { return pwField.getText(); }
    public String getName() { return nameField.getText(); }
    public String getGender() { return genderField.getText(); }
    public String getPhoneNumber() { return phoneNumberField.getText(); }
    public String getEmail() { return emailField.getText(); }
    public String getDepartment() { return departmentField.getText(); }
    public String getSemester() { return semesterField.getText(); }
    public String getStudentId() { return studentIdField.getText(); }
    public String getType() { return typeComboBox.getSelectedItem().toString(); }

    public UserDTO getInsertData() {
        String id = getId();
        String pw = getPw();
        String name = getName();
        String gender = getGender();
        String phone = getPhoneNumber();
        String email = getEmail();
        String department = getDepartment();
        String semester = getSemester();
        String studentId = getStudentId();
        String type = getType();

        if (id.isEmpty() || pw.isEmpty() || name.isEmpty() || gender.isEmpty() || phone.isEmpty() || email.isEmpty() || department.isEmpty() || semester.isEmpty() || studentId.isEmpty() || type.isEmpty()) {
            return null;
        }
        return new UserDTO(id, pw, name, gender, phone, email, department, semester, studentId, type);
    }

    public void resetView() {
        idField.setText("");
        pwField.setText("");
        nameField.setText("");
        genderField.setText("");
        phoneNumberField.setText("");
        emailField.setText("");
        departmentField.setText("");
        semesterField.setText("");
        studentIdField.setText("");
        emailChkLabel.setText("Email not checked");
    }

    public void setEmailChk() {
        emailChkLabel.setText("Email checked");
    }
}
