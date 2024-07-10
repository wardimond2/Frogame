import java.util.Scanner;
public class Hero {
    public String name;
    private int attack;
    private int damage;
    public int health;
    public int defense;
    public String Class;
    public Items[] inventory;
    public int strength;
    public int dexterity;
    public int constitution;
    public int intelligence;
    public Hero(String name, int attack, int health, int defense, int strength, int dexterity,int constitution,int intelligance){
    this.name = name;
    this.attack = attack;
    this.health = health;
    this.defense = defense;
    this.strength = strength;
    this.dexterity = dexterity;
    this.constitution = constitution;
    this.intelligence = intelligance;
    Items empty = new Items("empty", 0);

    inventory = new Items[5];
        inventory[0] = empty;
        inventory[1] = empty;
        inventory[2] = empty;
        inventory[3] = empty;
        inventory[4] = empty;
    }
    public void takeDamage(int eWeapon){
        eWeapon = eWeapon - defense;
        health = health - eWeapon;
    }
    public int hero_attack(){
        return damage;
    }
    public void hero_upgrade(int weapon){
        damage = attack + weapon;
    }
    public String getInfo(){
        return name+" "+health+" hp "+attack+" attack "+defense+" defense";
    }
    public void grabItem(){
        String area = "safari";
        String item;
        Scanner hand = new Scanner(System.in);
        item = hand.nextLine();
        switch(item){
            case "iron sword":
                if(area == "safari"){
                Weapons iSword = new Weapons("iron sword",10);
                System.out.println("which slot would you like to fill" );
                int slot = hand.nextInt();
                slot--;
                inventory[slot] = iSword;
                hero_upgrade(iSword.power);
                }

            }
        }
    public void UseItem(String item){

        switch(item){
            case "small health potion":
                health = health+5;
            case "medium health potion":
                health = health+10;
            case "large health potion":
                health = health+15;
        }
        for (Items i : inventory){
            if (i.Iname == item){
            i = new Items("empty", 0);
        }
        }
    }
}
