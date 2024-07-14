package Battle;

import Enemies.EnemyATK;
import Enemies.EnemyHP;
import Enemies.RandomNames;
import Enemies.RandomStats;
import Player.*;

import java.util.Random;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BattleSys {

    public static String mcName = UserData.userName;
    static RandomNames rn = new RandomNames();
    String enemyName = rn.getEnemyName();
    public void battleRun() {

        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        SkillsMenu sm = new SkillsMenu();
        Skill skill = new Skill();
        List<String> skillsList = skill.getSkill();

        HealthPoints currHP = new HealthPoints(100);
        currHP.setHpValue(100);
        DMG currATK = new DMG(15);
        currATK.setAtkValue(15);
        StaminaSys currSP = new StaminaSys(40);
        currSP.setSpValue(40);

        EnemyHP currEnHP = new EnemyHP(500);
        currEnHP.setEnHpValue(RandomStats.getRandomHPStats());
        EnemyATK currEnATK = new EnemyATK(15);
        currEnATK.setEnAtkValue(RandomStats.getRandomATKStats());

        while (currHP.getHpValue() > 0 && currEnHP.getEnHpValue() > 0) {
            System.out.println("Battle status: ");
            System.out.print("[" + mcName + "]");
            System.out.print("   HP " + currHP.getHpValue());
            System.out.print("   ATK " + currATK.getAtkValue());
            System.out.print("   SP " + currSP.getSpValue());
            System.out.print("            vs");
            System.out.print("            [" + enemyName + "]");
            System.out.print("   HP " + currEnHP.getEnHpValue());
            System.out.println("   ATK " + currEnATK.getEnAtkValue());
            System.out.println(" ");
            System.out.println("          [1]Attack!   [2]Skills");
            int userInput = scan.nextInt();
            try {
                if (userInput == 1) {
                    currEnHP.setEnHpValue(currEnHP.getEnHpValue() - currATK.getAtkValue());
                    System.out.println("------------");
                    System.out.println(mcName + " did " + currATK.getAtkValue() + " damage!");
                }
                //User Skills
                if (userInput == 2) {
                    sm.SM();
                    try {
                        int userSkillInput = scan.nextInt();
                        if (userSkillInput == 1 && currSP.getSpValue() > 5) {
                            currSP.setSpValue(currSP.getSpValue() - 5);
                            currEnHP.setEnHpValue(currEnHP.getEnHpValue() - (currATK.getAtkValue() + 5));
                            System.out.println(mcName + " casted " + skillsList.get(0) + ", dealing " + currATK.getAtkValue() + 5 + " damage!");
                        }
                        if (userSkillInput == 2 && currSP.getSpValue() > 10) {
                            currEnHP.setEnHpValue(currEnHP.getEnHpValue() - (currATK.getAtkValue() * 2));
                            currSP.setSpValue(currSP.getSpValue() - 10);
                            System.out.println(mcName + " performed " + skillsList.get(1) + ", dealing " + (currATK.getAtkValue() * 2) + " damage!");
                        }
                        if (userSkillInput == 3 && currSP.getSpValue() > 20) {
                            currSP.setSpValue(currSP.getSpValue() - 20);
                            currHP.setHpValue(currHP.getHpValue() + 15);
                            System.out.println(mcName + " casted " + skillsList.get(2) + ", recovering " + 15 + " HP!");
                            System.out.println("Current HP " + currHP.getHpValue());
                        }
                        if (currSP.getSpValue() <= 0) {
                            System.out.println("SP consumed!");
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("No such option avaiable!");
                        scan.nextInt();
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("No such option avaiable!");
                scan.nextInt();
            }
            System.out.println(" ");
            System.out.println("------------");
            System.out.println(enemyName + " is approaching!");
            currHP.setHpValue(currHP.getHpValue() - currEnATK.getEnAtkValue());
            System.out.println(" ");
            System.out.println("------------");
            System.out.println(enemyName + " dealt " + currEnATK.getEnAtkValue() + " damage!");
            System.out.println(" ");
            System.out.println("------------");
        }

        if (currHP.getHpValue() > 0) {
            System.out.println("Victory!");
        } else {
            System.out.println("You lost.");
        }
    }
}
