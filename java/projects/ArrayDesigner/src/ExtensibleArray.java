public class ExtensibleArray extends Array {
    public ExtensibleArray(int initialCapacity) {
        super(initialCapacity);
    }

    @Override
    public void add(Object obj) {
        if (total >= elements.length) {
            Object[] newArr = new Object[elements.length + (elements.length >> 1)];
            for (int i = 0; i < elements.length; i++) {
                newArr[i] = elements[i];
            }
            elements = newArr;
        }
        elements[total++] = obj;
    }
}
