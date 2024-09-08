public interface Sortable {
    // 若此方法返回正数，则认为当前对象大；
    // 如果方法返回负数，则认为参数obj大；
    // 如果方法返回零，则认为当前对象和obj一样大
    int sort(Object obj);
}
