public abstract class Array implements Container, Viewable {
    protected Object[] elements;
    protected int total;

    public Array(int initialCapacity) {
        elements = new Object[initialCapacity];
    };

    public int size() {
        return total;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= total) {
            System.out.println(index + " element is not exsit");
            return;
        }
        for (int i = index; i < total - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[total - 1] = null;
    }

    @Override
    public void set(int index, Object obj) {
        if (index < 0 || index >= total) {
            System.out.println(index + " element is not exsit");
            return;
        }
        elements[index] = obj;
    }

    @Override
    public Viewer creatViewer() {
        return new InnerViewer();
    }

    public class InnerViewer implements Viewer {
        private int cursor;

        @Override
        public boolean hasNext() {
            return cursor < total;
        }

        @Override
        public Object next() {
            return elements[cursor++];
        }
    }
}
