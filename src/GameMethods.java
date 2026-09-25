import java.util.Scanner;

public class GameMethods {
    static Scanner userinput = new Scanner(System.in);
    private static Enemy easyEnemy;
    private static Enemy mediumEnemy;
    private static Enemy hardEnemy;
    private static Enemy finalEnemy;

    static void gameStarted(){
        System.out.println("u r now in main menu. what do u want to do?");
        System.out.println("-   -   -   -   -   -   -   -   -   -   -");
        System.out.println("press 1 to fight easy battle");
        System.out.println("press 2 to fight medium battle");
        System.out.println("press 3 to fight hard battle");
        System.out.println("press 4 to final fight");
        System.out.println("press 5 to see inventory");
        System.out.println("press 6 to to enter store");
        System.out.println("press 7 to see character status");
        System.out.println("press 8 to ");
        System.out.println("press 9 to ");
        System.out.println("press 0 to go back");
        int choice = userinput.nextInt();
        switch (choice) {
            case 1:
                battlingSimulator1(Character.hero1, easyEnemy);
                break;
            case 2:
                battlingSimulator1(Character.hero1, mediumEnemy);
                break;
            case 3:
                battlingSimulator1(Character.hero1, hardEnemy);
                break;
            case 4:
                battlingSimulator1(Character.hero1, finalEnemy);
                break;
            case 5:
                System.out.println("5");
                break;
            case 6:
                System.out.println("6");
                break;
            case 7:
                GameMethods.showStatus(Character.hero1);
                break;
            case 8:
                System.out.println("8");
                break;
            case 9:
                System.out.println("9");
                break;
            case 0:
                System.out.println("u chose to move back one menu.");
                break;
            default:
                System.out.println("invalid number, try again");
                gameStarted();
        }
    }
    void buyItem(Character hero1, Item item) {
        if (hero1.gold >= item.price) { // && hero1 does not have the item.
            hero1.gold -= item.price;
            hero1.attackPower += item.attackBonus;
            hero1.defense += item.defenseBonus;
            System.out.println("You bought " + item.name);
            System.out.println("Attackpower increased by " + item.attackBonus);
            System.out.println("Defense increased by " + item.defenseBonus);
            System.out.println("Gold left: " + hero1.gold);
        } else {
            System.out.println("Not enough gold!"); // or has alrdy bought the item.
        }
    }
    static void levelUpAfterEachKill(Character hero1){
        hero1.health += 20;
        hero1.attackPower += 5;
        hero1.defense += 5;
    }
    static void battlingSimulator1(Character hero1, Enemy monster) { // turn counter
        System.out.println("u r in battle with a(n) " + Character.monster.name + "!");
        int count = 0;
        while (hero1.isAlive() && monster.isAlive()) {
            hero1.attack(Character.monster);
            count++;
            if (monster.isAlive()) {
                monster.attack(Enemy.hero1);
                // maybe return
            }else{
                System.out.println(" u won the battle in " + count + " turns, and leveled up!");
                GameMethods.levelUpAfterEachKill(hero1);
            }
        }
    }
    static void showStatus(Character hero1) {

        System.out.println("=== CHARACTER ===");
        System.out.println("Name: " + hero1.name);
        System.out.println("Health: " + hero1.health);
        System.out.println("Attackpower: " + hero1.attackPower);
        System.out.println("Defense: " + hero1.defense);
        System.out.println("Gold: " + hero1.gold);
    }
}
