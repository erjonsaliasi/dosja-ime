import java.util.Arrays;

public class Student {

    private String studentEmail;
    private int studentAge;
    private String studentPhoneNumber;
    private String studentName;
    private Course[] courses;
    private Teacher[] teachers;

    public Student(String studentName, int age, String email,
                   String phoneNumber, Teacher[] teachers, Course[] courses) {
        this.studentName = studentName;
        this.studentAge = age;
        this.studentEmail = email;
        this.studentPhoneNumber = phoneNumber;
        this.teachers = teachers;
        this.courses = courses;

    }

    @Override
    public String toString() {
        return "Student{" +
                "studentEmail='" + studentEmail + '\'' +
                ", studentAge=" + studentAge +
                ", studentPhoneNumber=" + studentPhoneNumber +
                ", studentName='" + studentName + '\'' +
                ", courses=" + Arrays.toString(courses) +
                ", teachers=" + Arrays.toString(teachers) +
                '}';
    }
}
