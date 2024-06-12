package common;

public class MultiAccessHandler extends Thread {
    private EnrollmentView enrollmentView;

    public MultiAccessHandler(EnrollmentView enrollmentView) {
        this.enrollmentView = enrollmentView;
    }

    @Override
    public void run() {
        // 다중 접속 환경 구현
        synchronized (this) {
            try {
                enrollmentView.enrollCourse();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

