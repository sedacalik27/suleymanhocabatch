package day22staticblocksconstructors;

public class Student {
    String name;
    int age;
    int grade;
    String stdId;
    String adsress;

    public Student(String name, int age, int grade, String stdId, String adsress) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.stdId = stdId;
        this.adsress = adsress;
    }

    public Student(String name, int age, String stdId) {
        this.name = name;
        this.age = age;
        this.stdId = stdId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", stdId='" + stdId + '\'' +
                ", adsress='" + adsress + '\'' +
                '}';
    }
}
