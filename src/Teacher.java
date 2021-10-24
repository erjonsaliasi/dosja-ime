import java.util.Arrays;

public class Teacher {

    private String name;
    private Course[] courses;

    public Teacher(String name,  Course[] courses) {
        this.name = name;
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", courses=" + Arrays.toString(courses) +
                '}';
    }
}
