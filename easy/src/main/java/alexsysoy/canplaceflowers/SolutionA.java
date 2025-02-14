package alexsysoy.canplaceflowers;

/**
 * 1 ms (97,30%) 45.84 (31,89%)
 */
public class SolutionA implements Solution {
    @Override
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length == 0 || flowerbed.length < n) {
            return false;
        }
        if (n == 0) {
            return true;
        }
        if (flowerbed.length == 1) {
            return flowerbed[0] == 0 && n == 1;
        }

        if (flowerbed.length == 2) {
            return flowerbed[0] == 0 && flowerbed[1] == 0 && n == 1;
        }

        for (int i = 0; i <= flowerbed.length - 1; i++) {
            if (((i - 1) < 0)
                    && flowerbed[i] == 0
                    && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                n--;
            }
            if (i + 1 > flowerbed.length - 1
            && flowerbed[i] == 0
            && flowerbed[i - 1] == 0) {
                n--;
            }
            if ((i - 1 > 0)
                    && (i + 1 < flowerbed.length - 1)
                    && flowerbed[i - 1] == 0
                    && flowerbed[i] == 0
                    && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                n--;
            }
        }
        return n <= 0;
    }
}
