class Person {
    private int age;
    public String fullName;
    public String phoneNumber;

    public Person(String fullName, String phoneNumber, int age) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

class Student extends Person {
    public int course;
    public String faculty;
    private int yearOfAdmission;

    public Student(String fullName, String phoneNumber, int age, int course, String faculty, int yearOfAdmission) {
        super(fullName, phoneNumber, age);
        this.course = course;
        this.faculty = faculty;
        this.yearOfAdmission = yearOfAdmission;
    }

    public int getYearOfAdmission() {
        return yearOfAdmission;
    }
}

public class Main {
    public static void main(String[] args) {
        Student[] students = {
                new Student("Иванов Иван", "+7 999 111-11-11",  20, 1, "Информатика", 2020),
                new Student("Петров Петр", "+7 999 222-22-22",  21, 2, "Физика", 2019),
                new Student("Сидоров Алексей", "+7 999 333-33-33",  19, 1, "Информатика", 2022)
        };
        System.out.println("Студенты:");
        for ( Student student : students){
            System.out.println(student.fullName+" "+student.getAge());
        }
        System.out.println("Студенты, учащиеся на \"Информатика:\" ");
        for ( Student student : students){
            if ( student.faculty == "Информатика") {
                System.out.println(student.fullName);
            }
        }
        System.out.println("Студенты, поступившие после 2021 года");
        for (int i = 0; i < students.length; i++){
            if ( students[i].getYearOfAdmission() > 2021) {
                System.out.println(students[i].fullName);
            }
        }
    }
}