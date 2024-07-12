import java.util.Locale;
import java.util.Scanner;
public class Hero {
    public String name;
    public int attack;
    public int damage;
    public int health;
    public int defense;
    public String Class;
    public Items[] inventory;
    public int strength;
    public int dexterity;
    public int constitution;
    public int intelligence;
    public int Maxhealth;
    public boolean exists;
    public Hero(String name, int attack, int health, int defense, int strength, int dexterity,int constitution,int intelligance, int max_health){
    this.name = name;
    this.attack = attack;
    this.health = health;
    this.defense = defense;
    this.strength = strength;
    this.dexterity = dexterity;
    this.constitution = constitution;
    this.intelligence = intelligance;
    this.Maxhealth = health;
    Items empty = new Items("empty", 5, 0, 0, 2);

    inventory = new Items[5];
        inventory[0] = empty;
        inventory[1] = empty;
        inventory[2] = empty;
        inventory[3] = empty;
        inventory[4] = empty;
    }
    public void takeDamage(int eWeapon){
        health -= eWeapon;
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
    public void grabItem(Items[] item) throws InterruptedException{
        String area = "swamp";
        SlowText.run("what item would you like to grab\n", 2);
        for(Items i : item){
            System.out.println(i.Iname);
        }
        Scanner hand = new Scanner(System.in);
        String items;
        items = hand.nextLine();
        items = items.toLowerCase();
        Items cItem = Items.Fang;
        exists = false;
        for (Items i : item) {
            if (i.Iname == items) {
                exists = true;
            }
        }
        switch(items) {
            case "iron sword":
                cItem = Items.bSword;
                break;
            case "javalin":
                cItem = Items.Javelin;
                break;
            case "dagger":
                cItem = Items.Dagger;
                break;
            case "stick":
                cItem = Items.Stick;
                break;
            case "bBat":
                cItem = Items.bBat;
                break;
            case "spear":
                cItem = Items.Spear;
                break;
            case "rock":
                cItem = Items.Rock;
                break;
            case "pfrog":
                cItem = Items.pFrog;
                break;
            case "fang":
                cItem = Items.Fang;
                break;
        }
            Scanner hands2 = new Scanner(System.in);
            System.out.println("what slot would you like to put it in");
            int slot = hands2.nextInt();
            slot--;
            inventory[slot] = cItem;
            hero_upgrade(cItem.power);
    
        }
        public void rest(){
        health = Maxhealth;
        }
    public void UseItem(String item) {

        boolean exists = false;
        for (Items i : inventory) {
            if (i.Iname == item) {
                i = new Items("empty", 1,0,0, 2);
                exists = true;
            }
        }
        if (exists == true) {
            switch (item) {
                case "small health potion":
                    health += 5;
                case "medium health potion":
                    health += 10;
                case "large health potion":
                    health += 15;
                case "exploding javalin":
            }
        }
    }
    public void classChange(String name, int attack, int health, int defense, int strength, int dexterity,int constitution,int intelligance){
        this.name = name;
        this.attack = attack;
        this.health = health;
        this.defense = defense;
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligance;
    }
}
