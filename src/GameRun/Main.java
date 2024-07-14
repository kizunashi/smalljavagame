package GameRun;

import Battle.BattleSys;
import Enemies.Enemy;
import Enemies.RandomNames;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter a username.");
        Scanner scan = new Scanner(System.in);
        String userName = scan.next();

        Player.UserData.setUserName(userName);

        Menu menu = new Menu();
        menu.showMenu();

        Scanner scan1 = new Scanner(System.in);
        int userChoice = scan1.nextInt();
        while (true) {
            if (userChoice == 1) {
                BattleSys newBattle = new BattleSys();
                newBattle.battleRun();
            }
            if (userChoice == 2) {
                RandomNames rn1 = new RandomNames();
                String enemyDesc = rn1.getEnemyDescription();
                System.out.println("                                    <+>");
                System.out.println(" ");
                System.out.println(enemyDesc);
                System.out.println(" ");
                System.out.println("                                    <+>");
                System.out.println("[1]Menu");
                Scanner scan2 = new Scanner(System.in);
                int userChoice2 = scan2.nextInt();

                if (userChoice2 == 1) {
                    Menu menu2 = new Menu();
                    menu2.showMenu();
                }

            }
            if (userChoice == 3) {
                menu.showMenu();
            }

//        System.out.println("enter a username");
//        Scanner scan = new Scanner(System.in);
//        String userName = scan.next();
//
//        Player.UserData.setUserName(userName);

//        BattleSys newBattle = new BattleSys();
//        newBattle.battleRun();

        }
    }
}