package Controller;

import Model.LectureDTO;
import View.EnrollmentView;
import common.ClassManager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class EnrollmentController implements ActionListener {
    private EnrollmentView enrollmentView;
    private ArrayList<LectureDTO> lectureList;

    public EnrollmentController(EnrollmentView enrollmentView) {
        this.enrollmentView = enrollmentView;
        this.lectureList = new ArrayList<>();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();

        if (enrollmentView.isEnrollButton(obj)) {
            enroll();
        } else if (enrollmentView.isCancelButton(obj)) {
            cancel();
        } else {
            ClassManager.getInstance().getMain().comeToMain();
        }
    }

    private void enroll() {
        try {
            // 신청 로직 구현
        } catch (Exception ex) {
            ex.printStackTrace();
            // 에러 메시지 출력 로직
        }
    }

    private void cancel() {
        try {
            // 취소 로직 구현
        } catch (Exception ex) {
            ex.printStackTrace();
            // 에러 메시지 출력 로직
        }
    }
}
