public class FixedArray extends Array {
    public FixedArray(int initialCapacity) {
        super(initialCapacity);
    }

    @Override
    public void add(Object obj) {
        if (total >= elements.length) {
            System.out.println("The container is full");
            return;
        }
        elements[total++] = obj;
    }
}
