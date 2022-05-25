class Player{
    String name; // modifier default
    public int experience; // public
    private int health; // private

    Player(String name, int experience, int health){
        this.name = name;
        this.experience = experience;
        this.health = health;
    }

    // default modifier access method
    void display(){
        setExp(); // access private method
        System.out.println("\nName\t: " + name);
        System.out.println("exp\t: " + experience);
        System.out.println("health\t: " + health); // read the variable but in class
    }

    // public method
    public void setName(String newName){
        this.name = newName;
    }

    // private method
    private void setExp(){
        this.experience += 100;
    }
}

public class Keyword {
    public static void main(String[] args) {
        Player player1 = new Player("Marni", 0, 100);

        // default
        System.out.println(player1.name); // read data
        player1.name = "Surti"; // write data
        System.out.println(player1.name);

        // public
        System.out.println(player1.experience);
        player1.experience = 100;
        System.out.println(player1.experience);

        // private (can't be access)
//        System.out.println(player1.health);
        // player1.health = 1000;
        // System.out.println(player1.health);

        // method default
        player1.display();

        // public method
        player1.setName("Acel");
        player1.display();

        // private method (can't be access)
//        player1.setExp();
    }
}
