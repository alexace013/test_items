package hw2.university;

/**
 * Created by alexander on 14.12.15.
 */
public class StudentMain {

    public static void main(String[] args) {

        Subject subject1 = new Subject("Math", 180);
        Subject subject2 = new Subject("Physics", 240);
        Subject subject3 = new Subject("Programming", 360);

        Student student = new Student("Bob", "New Oklahoma", 3);
        student.addSubject(subject1);
        student.addSubject(subject2);
        student.addSubject(subject3);
        System.out.println(student.getSubjectsInfo());
        student.learn(90, 0);
        student.learn(170, 1);
        student.learn(250, 2);
        subject1.exams();
        System.out.println(subject1.getRank());
        subject2.exams();
        System.out.println(subject2.getRank());
        subject3.exams();
        System.out.println(subject3.getRank());
        System.out.println(student.getAverageSubjects());

    }

}
