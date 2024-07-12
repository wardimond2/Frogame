import java.util.Locale;
import java.util.Random;
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
    public static Items empty = new Items("empty", 5, 0, 0, 2);
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

    inventory = new Items[8];

    for (int i = 0; i < inventory.length; i++)
    {
        inventory[i] = empty;
    }
    inventory[3] = potions.tbhpotion;

    }
    public void takeDamage(int eWeapon){
        health -= eWeapon;
    }
    public int hero_attack(Weapons weapon){

        Random generator = new Random();
        int weaponA = generator.nextInt(weapon.dmg);
        return attack + weaponA;
    }
    public String getInfo(){
        return name+" "+health+" hp "+attack+" attack "+defense+" defense";
    }
    public void grabItem(Items[] item) throws InterruptedException{
        SlowText.run("what item would you like to grab\n", 2);
        Random generator = new Random();
        Items[] items52={Hero.empty,Hero.empty,Hero.empty,Hero.empty, Hero.empty};
        int a = 0;
        for(Items i : item){
            int prob3 = generator.nextInt(100);
            if (i.prob >= prob3){
                items52[a] = i;
                a++;
            }
        }
        for(Items i : items52){
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
            case "broad sword":
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
            case "small health potion":
                cItem = potions.sshpotion;
                break;
            case "super small health potion":
                cItem = potions.smhpotion;
                break;
            case "large health potion":
                cItem = potions.tbhpotion;
                break;
        }
            Scanner hands2 = new Scanner(System.in);
            System.out.println("What slot would you like to put it in? (Slot 1 is what weapon you are holding.)");
            int slot = hands2.nextInt();
            slot--;
            inventory[slot] = cItem;
    
        }
        public void rest(){
        health = Maxhealth;
        }
    public void UseItem(String item) {
        System.out.println("test_0");

        boolean exists = false;
        for (Items i : inventory) {
            System.out.println("test_1");
            if (i.Iname == item) {
                System.out.println("test_2");
                i = new Items("empty", 1,0,0, 2);
                exists = true;
            }
        }
        if (exists == true) {
            System.out.println("test1");
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
