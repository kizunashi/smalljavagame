package Player;

public class MC {
    public static String mcName = UserData.userName;

    static HealthPoints maxHP = new HealthPoints(100);
    int currentHP = maxHP.getHpValue();

    static DMG maxATK = new DMG(15);
    int currentATK = maxATK.getAtkValue();
    public static void getInfo() {
        System.out.println("Player info:");
        System.out.print("Name [" + mcName + "]");
        System.out.print("   HP [" + maxHP.getHpValue() + "]");
        System.out.println("   ATK [" + maxATK.getAtkValue() + "]");
    }
}
