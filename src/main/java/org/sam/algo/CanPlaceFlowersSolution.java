package org.sam.algo;

public class CanPlaceFlowersSolution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int pre = 0;
        int next = 0;

        for (int i = 0; i < flowerbed.length; i++) {
            if (i != 0) {
                pre = flowerbed[i - 1];
            }
            if ((i + 1) < flowerbed.length) {
                next = flowerbed[i + 1];
            }
            if (flowerbed[i] == 0 && pre == 0 && next == 0) {
                flowerbed[i] = 1;
                n--;
            }
        }
        return n <= 0;
    }
}
