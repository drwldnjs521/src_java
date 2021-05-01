import java.util.Arrays;

public class WildcardExample {
    public static void registerCourse(Course<?> course) {
        System.out.println(course.getName() + "participant" + Arrays.toString(course.getStudents()));
    }

    public static void registerCourseStudent(Course<? extends Student> course) {
        System.out.println(course.getName() + "participant" + Arrays.toString(course.getStudents()));
    }

    public static void registerCourseWorker(Course<? super Worker> course) {
        System.out.println(course.getName() + "participant" + Arrays.toString(course.getStudents()));
    }

    public static void main(String[] args) {
        Course<Person> personCourse = new Course<>("normal", 5);
        personCourse.add(new Person("Person"));
        personCourse.add(new Person("Worker"));
        personCourse.add(new Student("Student"));
        personCourse.add(new HighStudent("HighStudent"));
        Course<Worker> workerCourse = new Course<>("Worker", 5);
        workerCourse.add(new Worker("Worker"));
        Course<Student> studentCourse = new Course<>("Student", 5);
        studentCourse.add(new Student("Student"));
        studentCourse.add(new HighStudent("HighStudent"));
        Course<HighStudent> highStudentCourse = new Course<>("HighStudent", 5);
        highStudentCourse.add(new HighStudent("HighStudent"));

        registerCourse(personCourse);
        registerCourse(workerCourse);
        registerCourse(studentCourse);
        registerCourse(highStudentCourse);
        System.out.println();

        registerCourseStudent(studentCourse);
        registerCourseStudent(highStudentCourse);
        System.out.println();
        registerCourseWorker(personCourse);
        registerCourseWorker(workerCourse);


    }

}
