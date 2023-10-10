package nested_classes;

public class ExamAppMain {
    public static void main(String[] args) {
        Exam exam = new Exam(1);
        exam.start();

        Exam.Teacher teacher = new Exam.Teacher();

        Exam.examStatic();
    }
}
