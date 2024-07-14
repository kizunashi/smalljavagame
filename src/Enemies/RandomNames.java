package Enemies;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNames {
    public String getEnemyName() {
        List<String> enemyNames = new ArrayList<>();
        enemyNames.add("Deadstorm");
        enemyNames.add("Thaal");
        enemyNames.add("Hate_Bringer");
        enemyNames.add("The_Empty_One");
        enemyNames.add("Belial");

        Random random = new Random();
        int randomIndex = random.nextInt(enemyNames.size());
        String randomName = enemyNames.get(randomIndex);
        return randomName;
    }
    public static String getEnemyDescription() {
        List<String> enemyDescription = new ArrayList<>();
        enemyDescription.add("Deadstorm - A deadly black dragon covered with reddish spines.");
        enemyDescription.add("Thaal - A mythic god of the sea, that has a majestic, yet terrifying aura.");
        enemyDescription.add("Hate_Bringer - A demon that once was human. To serve Belial had to give up everything except from hate");
        enemyDescription.add("The_Empty_One - An incomprehensible entity. Legends tell that he is the eternity herself.");
        enemyDescription.add("Belial - The one and only, terrifying and odious demon king.");

        Random random = new Random();
        int randomIndex = random.nextInt(enemyDescription.size());
        String randomDesc = enemyDescription.get(randomIndex);
        return randomDesc;
    }
}
