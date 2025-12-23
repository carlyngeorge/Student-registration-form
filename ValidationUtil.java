public class ValidationUtil {

    public static boolean validateStudent(Student student) {
        return !student.getName().isEmpty() &&
               !student.getAge().isEmpty() &&
               !student.getCourse().isEmpty();
    }
}
