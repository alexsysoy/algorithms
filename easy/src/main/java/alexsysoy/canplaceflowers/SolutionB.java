package alexsysoy.canplaceflowers;

public class SolutionB implements Solution {
    @Override
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int set = flowerbed[0] == 0 ? 2 : 0;
        for (int i = 1; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                set++;
            } else {
                set = 0;
            }
            if (set == 3) {
                set = 1;
                n--;
            }
            if (n <= 0) {
                break;
            }
        }
        if (set == 2) {
            n--;
        }
        return n <= 0;
    }
}
