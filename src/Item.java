public class Item {
    String name;
    int price;
    int attackBonus;
    int defenseBonus;

    Item(String name, int price, int attackBonus, int defenseBonus) {
        this.name = name;
        this.price = price;
        this.attackBonus = attackBonus;
        this.defenseBonus = defenseBonus;
    }

    Item sword1 = new Item("Iron Sword", 100, 100, 0);
    Item shield1 = new Item("Iron Shield", 150, 0, 100);
    Item armor1 = new Item("Knight Armor", 300, 50, 200);
}
