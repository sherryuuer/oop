public class StudentTest {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        arr[0] = new Student("Jack", 89);
        arr[1] = new Student("Sunny", 93);
        arr[2] = new Student("Lucy", 78);

        MyArray.bubbleSort(arr);
        MyArray.iterate(arr);
    }
}
