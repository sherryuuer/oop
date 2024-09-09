import java.util.Arrays;

public class MyArrayList implements Container {
    private Object[] all;
    private int total;

    public MyArrayList(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new IllegalArgumentException("Initial capacity must be positive");
        }
        all = new Object[initialCapacity];
    }

    private void extend() {
        if (total >= all.length) {
            all = Arrays.copyOf(all, all.length + (all.length >> 1));
        }
    }

    private void checkIndex(int index) {
        if (index < 0 || index > total) {
            throw new IndexOutOfBoundsException(index + " is out of bounds");
        }
    }

    @Override // 添加一个元素
    public void add(Object obj) {
        extend();
        all[total++] = obj;
    }

    @Override // 在指定位置index添加一个新元素
    public void add(int index, Object obj) {
        checkIndex(index);
        extend();
        System.arraycopy(all, index, all, index + 1, total - index);
        all[index] = obj;
        total++;
    }

    @Override // 删除index位置的元素
    public void remove(int index) {
        checkIndex(index);
        System.arraycopy(all, index + 1, all, index, total - index - 1);
        all[--total] = null;
    }

    @Override // 删除指定元素，如果有重复的，则删除第一个
    public void remove(Object obj) {
        int index = indexOf(obj);
        if (index != -1) {
            remove(index);
        }
    }

    @Override // 替换index位置的元素
    public void set(int index, Object obj) {
        checkIndex(index);
        all[index] = obj;
    }

    @Override // 替换第一个找到的obj元素为newObj
    public void set(Object obj, Object newObj) {
        int index = indexOf(obj);
        if (index != 1) {
            set(index, newObj);
        }
    }

    @Override // 查找某个元素是否存在
    public boolean contain(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // 查找某个元素在数组容器中的下标，如果不存在则返回-1
    public int indexOf(Object obj) {
        if (obj == null) {
            for (int i = 0; i < total; i++) {
                if (all[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < total; i++) {
                if (obj.equals(all[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override // 返回index位置的元素
    public Object get(int index) {
        checkIndex(index);
        return all[index];
    }

    @Override // 返回实际存储元素的个数
    public int size() {
        return total;
    }

    @Override // 返回实际存储的所有元素
    public Object[] getAll() {
        return Arrays.copyOf(all, total);
    }

}
