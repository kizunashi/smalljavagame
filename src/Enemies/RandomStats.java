package Enemies;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomStats {
    public static int getRandomHPStats() {
        int[] stats = new int[101];
        for (int i = 0; i < stats.length; i++) {
            stats[i] = 100 + i;
        }
        Random random = new Random();
        int randomIndex = random.nextInt(stats.length); // Генерируем случайный индекс
        return stats[randomIndex];
    }

    public static int getRandomATKStats() {
        int[] stats = new int[7];
        for (int i = 0; i < stats.length; i++) {
            stats[i] = 8 + i;
        }
        Random random = new Random();
        int randomIndex = random.nextInt(stats.length); // Генерируем случайный индекс
        return stats[randomIndex];
    }
}
