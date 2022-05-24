package Latihan;

// player
class Player{
    String name;
    double health;
    int level;

    // object member
    Weapon weapon;
    Armor armor;

    Player(String name, double health){
        this.name = name;
        this.health = health;
    }

    void attack(Player opponent){
        double attackPower = this.weapon.attackPower;
        System.out.println(this.name + " attacking " + opponent.name + " with power " + attackPower);

        opponent.defence(attackPower);
    }

    void defence(double attackPower){

        // Akan mengambil damage
        double damage;
        if (this.armor.defencePower < attackPower){
            damage = attackPower - this.armor.defencePower;
        } else {
            damage = 0;
        }

        this.health -= damage;

        System.out.println(this.name + " gets damage " + damage);
    }

    void equipWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    void equipArmor(Armor armor){
        this.armor = armor;
    }

    void display(){
        System.out.println("Name: " + this.name);
        System.out.println("Health: " + this.health + " hp");
        this.weapon.display();
        this.armor.display();
    }
}

// Weapon
class Weapon{
    double attackPower;
    String name;

    Weapon(double attackPower, String name){
        this.attackPower = attackPower;
        this.name = name;
    }

    void display(){
        System.out.println("Weapon: " + this.name + ", attack: " + this.attackPower);
    }
}

// armor
class Armor{
    String name;
    double defencePower;

    Armor(String name, double defencePower){
        this.name = name;
        this.defencePower = defencePower;
    }

    void display(){
        System.out.println("Armor: " + name + ", defence: " + defencePower);
    }
}

public class Latihan1 {
    public static void main(String[] args) {
        // create player object
        Player player1 = new Player("Acel", 100);
        Player player2 = new Player("Ucil", 75);

        // create weapon object
        Weapon pedang = new Weapon(15, "pedang");
        Weapon ketapel = new Weapon(1,"ketapel");

        // create armor object
        Armor bajuBesi = new Armor("baju besi",10);
        Armor kaos = new Armor("kaos", 0);

        // player1 equip weapon and armor
        player1.equipWeapon(pedang);
        player1.equipArmor(bajuBesi);
        player1.display();

        // player2 equip weapon and armor
        player2.equipWeapon(ketapel);
        player2.equipArmor(kaos);
        player2.display();

        System.out.println("Pertempuran");
        System.out.println("Episode 1");
        player1.attack(player2);
        player1.display();
        player2.display();

        System.out.println("Episode 2");
        player2.attack(player1);
        player1.display();
        player2.display();

    }
}
