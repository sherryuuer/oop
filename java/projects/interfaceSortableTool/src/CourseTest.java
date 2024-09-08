public class CourseTest {
    public static void main(String[] args) {
        Course[] arr = new Course[3];
        arr[0] = new Course(1, "Java");
        arr[1] = new Course(2, "React");
        arr[2] = new Course(3, "Python");

        MyArray.bubbleSort(arr);
        MyArray.iterate(arr);
    }
}
