package arrays.src;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QuickSort {

    public static List<Integer> quicksortSimple(List<Integer> arr) {
        if (arr.size() <= 1) {
            return arr;
        }

        Integer pivot = arr.get(0);
        List<Integer> less = arr.stream()
                .skip(1)
                .filter(x -> x <= pivot)
                .collect(Collectors.toList());
        List<Integer> greater = arr.stream()
                .skip(1)
                .filter(x -> x > pivot)
                .collect(Collectors.toList());

        List<Integer> sortedLess = quicksortSimple(less);
        List<Integer> sortedGreater = quicksortSimple(greater);

        List<Integer> result = new ArrayList<>();
        result.addAll(sortedLess);
        result.add(pivot);
        result.addAll(sortedGreater);

        return result;
    }

    public static void main(String[] args) {
        List<Integer> arr = List.of(3, 6, 8, 10, 1, 2, 1);
        List<Integer> sortedArr = quicksortSimple(arr);
        System.out.println(sortedArr);
    }
}
