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

    }

}
