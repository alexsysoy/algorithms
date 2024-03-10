package alexsysoy.insertionsort;

import static alexsysoy.utils.SortUtils.calculate;

/**
 * Wost-case performance O(n2)
 * Best-case performance O(n)
 * Average performance O(n2)
 * Memory O(n)
 */
public class InsertionSortCalculate {
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        Integer[] massive = insertionSort.generate(10);
        Integer[] clone = massive.clone();
        calculate(insertionSort, clone);
    }
}
