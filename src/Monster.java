public class Monster {
    // contructor
    public Monster(String name, int health, int attack, int defense, Items[] loot){
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;

    }
    // class adjectives
    public String name;
    public int health;
    private int attack;
    public int defense;
    // class verbs
    public String getinfo(){
        return name+" "+health+" hp "+attack+" attack "+defense+" defense ";
    }
    public int eAttack(){
        return attack;
    }
    public void takeDamage(int weapon){
        weapon = weapon - defense;
        health = health - weapon;
    }
}
