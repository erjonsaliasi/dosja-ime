public class Course {

    private String courseName;
    private int courseSemester;

    public Course(String courseName, int courseSemester) {
        this.courseName = courseName;
        this.courseSemester=courseSemester;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseSemester=" + courseSemester +
                '}';
    }
}
