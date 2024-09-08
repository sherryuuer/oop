public class TeacherTest {
    public static void main(String[] args) {
        Teacher[] arr = new Teacher[3];
        arr[0] = new Teacher("Hely", 12000);
        arr[1] = new Teacher("Doly", 16000);
        arr[2] = new Teacher("Timy", 18000);

        MyArray.bubbleSort(arr);
        MyArray.iterate(arr);
    }
}
