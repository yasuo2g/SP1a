class Character {
    public static Character monster;
    String name;
    int health;
    int attackPower;
    int defense;
    int gold;

    Character(String name, int health, int attackPower,int defense, int gold) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.defense = defense;
        this.gold = gold;
    }

    void takeDamage(int damage) {
        health = health - damage;
        if (health < 0) {
            health = 0;
        }
    }
    void attack(Character target) {
        System.out.println(name + " attacks " + target.name + "!");
        target.takeDamage(attackPower- target.defense);
    }
    boolean isAlive() {
        return health > 0;
    }
    void printStatus() {
        System.out.println(name + ": " + health + " HP");
    }

    static Character hero1 = new Character("Hero", 100, 10, 0, 500);
}
