package alexsysoy.bubblesort;

import alexsysoy.Sort;

public class BubbleSortB implements Sort {
    @Override
    public void sort(Integer[] massive) {
        boolean flag = true;

        while (flag) {
            flag = false;
            for (int i = 0; i < massive.length - 1; i++){
                if (massive[i] > massive[i + 1]) {
                    int tmp = massive[i];
                    massive[i] = massive[i + 1];
                    massive[i + 1] = tmp;
                    flag = true;
                }
            }
        }
    }
}
