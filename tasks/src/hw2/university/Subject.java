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
    private int allHours;
    private int studentHours;
    private int rank;

    public Subject() {}

    public Subject(String name, int allHours) {
        this.name = name;
        this.allHours = allHours;
        studentHours = 0;
    }

    public Subject(String name, int allHours, int studentHours) {
        this.name = name;
        this.allHours = allHours;
        this.studentHours = studentHours;
    }

    // take exam
    public void exams() {
        double result = allHours / studentHours;
        setRank((int)result);
        if (rank < 2) {
            System.out.println("subject completed.");
        } else {
            System.err.println("subject no completed.");
        }
    }

    // subject information
    public String getSubjectInfo() {
        return "subject name: " + name + ", hours of subject : " + allHours;
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
