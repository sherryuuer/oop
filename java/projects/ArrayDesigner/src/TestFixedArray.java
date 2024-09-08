public class TestFixedArray {
    public static void main(String[] args) {
        FixedArray box = new FixedArray(3);
        box.add("Jack");
        box.add("Sunny");
        box.add("Lucy");
        box.add("Daisy");

        System.out.println("Size: " + box.size());
        box.remove(0);
        System.out.println("Size: " + box.size());
        box.set(1, "Sally");
        System.out.println("Print all: ");
        Viewer view = box.creatViewer();
        while (view.hasNext()) {
            System.out.println(view.next());
        }
    }
}
