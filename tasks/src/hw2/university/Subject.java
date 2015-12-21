package hw2.university;

/**
 * Предмет содержит поля:
 имя
 количество часов в семестре
 количество проработанных часов студентом
 оценка студента за предмет

 методы:
 сдать экзамен
 показать информацию о предмете
 получить оценку студента за предмет
 */
public class Subject {

    private String name;
    private int semesterHours;
    private int studentHours;
    private int rank;

    public Subject() {}

    public Subject(String name, int semesterHours) {
        this.name = name;
        this.semesterHours = semesterHours;
        studentHours = 0;
    }

    public Subject(String name, int allHours, int studentHours) {
        this.name = name;
        this.semesterHours = allHours;
        this.studentHours = studentHours;
    }

    // take exam
    public void exams() {
        double result = semesterHours / studentHours;
        if (result == 1) {
            setRank(5);
        } else if (result <= 1.5) {
            setRank(4);
        } else if (result <= 2) {
            setRank(3);
        } else {
            setRank(2);
        }
        if (rank > 3) {
            System.out.println("subject completed.");
        } else {
            System.err.println("subject no completed.");
        }
    }

    // subject information
    public String getSubjectInfo() {
        return String.format("%s, %s", name, semesterHours);
    }

    // score per subject
    public int getRank() {
        return rank;
    }

    private void setRank(int rank) {
        this.rank = rank;
    }

    // add hours for student
    public void addHours(int hours) {
        studentHours += hours;
    }

}
