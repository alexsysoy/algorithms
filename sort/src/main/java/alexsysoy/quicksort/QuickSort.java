package alexsysoy.quicksort;

import alexsysoy.Print;

public class QuickSort {
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            // Определяем индекс опорного элемента
            int pi = partition(arr, low, high);

            // Рекурсивно сортируем левую и правую части относительно опорного элемента
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        // Выбираем последний элемент в качестве опорного
        int pivot = arr[high];

        // Индекс меньшего элемента
        int i = low - 1;

        for (int j = low; j <= high - 1; j++) {
            // Если текущий элемент меньше или равен опорному,
            // перемещаем его перед большим элементом
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = {10, 80, 30, 90, 40, 50, 70};

        quickSort(arr, 0, arr.length - 1);

        Print.printArray(arr);
    }
}
