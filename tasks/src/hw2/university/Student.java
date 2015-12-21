package hw2.university;

/**
 * Студент
 поля:
 Имя
 Адрес
 Предметы

 методы:
 учиться
 добавить предмет
 удалить предмет из списка последний
 показать всю информацию о предметах
 получить средний бал за все предметы
 */
public class Student {

    private String name;
    private String address;
    private Subject[] subjects;
    private int index;

    public Student() {
        subjects = new Subject[0];
    }

    public Student(String name, String address, int sizeSubjects) {
        this.name = name;
        this.address = address;
        subjects = new Subject[sizeSubjects];
    }

    public void learn(int hours, int subIdx) {
        Subject tempSubject = subjects[subIdx];
        tempSubject.addHours(hours);
    }

    public void addSubject(Subject subject) {
        subjects[index] = subject;
        index++;
    }

    public void removeLastSubject() {
        subjects[index] = null;
        index--;
    }

    public String getSubjectsInfo() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < index; i++) {
            builder.append(subjects[i].getSubjectInfo() + "\n");
        }
        return builder.toString();
    }

    public double getAverageSubjects() {
        double result = 0;
        for (Subject subject : subjects) {
            result += subject.getRank();
        }
        return result / subjects.length;
    }

}
