package View;

public class EnrollmentView extends JPanel {
    private JList<String> courseList;
    private JButton enrollButton, cancelButton;

    public EnrollmentView() {
        setLayout(new BorderLayout());
        courseList = new JList<>(new String[] {"Course 1", "Course 2", "Course 3"});
        enrollButton = new JButton("Enroll");
        cancelButton = new JButton("Cancel");

        add(new JScrollPane(courseList), BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(enrollButton);
        buttonPanel.add(cancelButton);
        add(buttonPanel, BorderLayout.SOUTH);

        enrollButton.addActionListener(new EnrollmentController(this));
        cancelButton.addActionListener(new EnrollmentController(this));
    }

    public String getSelectedCourse() {
        return courseList.getSelectedValue();
    }
}
