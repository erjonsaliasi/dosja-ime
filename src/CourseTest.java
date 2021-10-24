public class CourseTest {

    public static void main(String[] args) {

        Course kursi1 = new Course("Anglisht", 1);
        Course kursi2 = new Course("Matematike", 1);
        Course kursi3 = new Course("Coding", 2);

        Teacher teacher1 = new Teacher("Erjon", new Course[]{kursi1, kursi2});
        Teacher teacher2 = new Teacher("Ana", new Course[]{kursi3});

        System.out.println(kursi1 + " " + kursi2);
        System.out.println(teacher1);

        Student student1 = new Student("Erjon", 18,
                "erjonsaliasi@gmail.com", "0676990472",
                new Teacher[]{teacher1}, new Course[]{kursi1});

        System.out.println(student1);
    }
}
