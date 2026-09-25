
public class Enemy {
    public static Enemy hero1; // target fungerer hvordan?
    String name;
    int health;
    int attackPower;
    int defense;
    int goldReward;

    Enemy(String name, int health, int attack, int defense, int goldReward) {
        this.name = name;
        this.health = health;
        this.attackPower = attack;
        this.defense = defense;
        this.goldReward = goldReward;
    }
    void takeDamage(int damage) {
        health = health - damage;
        if (health < 0) {
            health = 0;
        }
    }

    void attack(Enemy target) {
        System.out.println(name + " attacks " + target.name + "!");
        target.takeDamage(attackPower);
    }

    boolean isAlive() {
        return health > 0;
    }

    void printStatus() {
        System.out.println(name + ": " + health + " HP");
    }

    Enemy easyEnemy = new Enemy("Goblin", 50, 8, 2, 2000);

    Enemy mediumEnemy = new Enemy("Orc", 100, 15, 5, 5000);

    Enemy hardEnemy = new Enemy("Dragon", 200, 25, 10, 5000);

    Enemy finalEnemy = new Enemy("Demon King", 400, 40, 15, 1000);
}
