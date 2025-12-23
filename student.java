public class Student {
    private String name;
    private String age;
    private String course;

    public Student(String name, String age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getCourse() {
        return course;
    }
}
