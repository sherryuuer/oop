public interface Container {
    void add(Object obj); // 添加一个元素

    void add(int index, Object obj); // 在指定位置index添加一个新元素

    void remove(int index); // 删除index位置的元素

    void remove(Object obj); // 删除指定元素，如果有重复的，则删除第一个

    void set(int index, Object obj); // 替换index位置的元素

    void set(Object obj, Object newObj); // 替换第一个找到的obj元素为newObj

    boolean contain(Object obj); // 查找某个元素是否存在

    int indexOf(Object obj); // 查找某个元素在数组容器中的下标，如果不存在则返回-1

    Object get(int index); // 返回index位置的元素

    int size(); // 返回实际存储元素的个数

    Object[] getAll(); // 返回实际存储的所有元素
}
