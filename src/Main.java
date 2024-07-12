import jdk.jfr.consumer.RecordedFrame;
import java.io.Console;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) throws InterruptedException{
        Random generator = new Random();
        // defining areas
        Scanner playerInput = new Scanner(System.in);
        String heroName;
        String heroClass;
        String[] npcDialouge = {"Go fight some bad guys.\n", "An Elephant attacked me help!\n", "Hi!\n", "IM DIEING SAVE ME\n", "\'MERICA\n"};
        double heroHealth;
        int heroAC;
        int heroArcana;
        Weapons useWeapon = Items.Stick;
        // game start - init
        SlowText.run("What is your hero's name?\n", 1);
        heroName = playerInput.nextLine();
        Hero P1 = new Hero(heroName, 3, 20, 15, 19, 15, 2, 3, 20);
        SlowText.run("\nWelcome, " + heroName + "!\n", 1);
        while (true) {
            SlowText.run("What class are you?\n1: Warrior\n2: Paladin\n3: Wizard\n4: Hunter\n5: Bard\n(They dont do anything, it just looks cool.)\n", 1);
            String playerclass = playerInput.nextLine();
            if(Objects.equals(playerclass, "Warrior") || Objects.equals(playerclass, "1"))
            {
                SlowText.run("\nWarrior Stats:\nStrength:19\nDexterity: 15\nConstitution: 2\nIntelligence: 3\n\nChoose Warrior? (y/n):\n", 1);
                if (Objects.equals(playerInput.nextLine(), "y")) {
                    heroClass = "Warrior";
                    SlowText.run("Your class is " + heroClass+"\n",1);
                    P1.classChange(heroName, 2, 20, 15, 19, 15, 2, 3);
                    break;
                }
            }
            else if(Objects.equals(playerclass, "Paladin") || Objects.equals(playerclass, "2"))
            {
                SlowText.run("\nPaladin Stats:\nStrength:19\nDexterity: 15\nConstitution: 2\nIntelligence: 3\n\nChoose Paladin? (y/n):\n", 1);
                if (Objects.equals(playerInput.nextLine(), "y")) {
                    heroClass = "Paladin";
                    SlowText.run("Your class is " + heroClass+" ", 1);
                    P1.classChange(heroName, 3, 20, 15, 19, 15, 2, 3);
                    break;
                }
            }
            else if(Objects.equals(playerclass, "Wizard") || Objects.equals(playerclass, "3"))
            {
                SlowText.run("\nWizard Stats:\nStrength:19\nDexterity: 15\nConstitution: 2\nIntelligence: 3\n\nChoose Wizard? (y/n):\n", 1);
                if (Objects.equals(playerInput.nextLine(), "y")) {
                    heroClass = "Wizard";
                    SlowText.run("Your class is " + heroClass+"\n", 1);
                    P1.classChange(heroName, 2, 20, 15, 19, 15, 2, 3);
                    break;
                }
            }
            else if(Objects.equals(playerclass, "Hunter") || Objects.equals(playerclass, "4"))
            {
                SlowText.run("\nHunter Stats:\nStrength:19\nDexterity: 15\nConstitution: 2\nIntelligence: 3\n\nChoose Hunter? (y/n):\n", 1);
                if (Objects.equals(playerInput.nextLine(), "y")) {
                    heroClass = "Hunter";
                    //heroClass = "Hunter";
                    SlowText.run("Your class is " + heroClass+"\n", 1);
                    P1.classChange(heroName, 1, 20, 15, 19, 15, 2, 3);
                    break;
                }
            }
            else if(Objects.equals(playerclass, "Bard") || Objects.equals(playerclass, "5")) {
                SlowText.run("\nBard Stats:\nStrength:19\nDexterity: 15\nConstitution: 2\nIntelligence: 3\n\nChoose Bard? (y/n):\n", 1);
                if (Objects.equals(playerInput.nextLine(), "y")) {
                    heroClass = "Bard";
                    SlowText.run("Your class is " + heroClass+"\n", 1);
                    P1.classChange(heroName, 4, 20, 15, 19, 15, 2, 3);
                    break;
                }
            }
        }

        // game start true game
        P1.inventory[1] = Items.Stick;
        String[][] swampl;
        swampl = new String[10][10];
        Monster[] place = Monster.swamp;
        String land = "";
        Scanner walk = new Scanner(System.in);
        boolean run = true;
        // GAME fOR REAL THIS TIME
        while(run == true){
            SlowText.run("1: Travel | 2: Battle | 3: Talk | 4: Inventory| 5 Rest\n",1);
            String menue = playerInput.nextLine();
            menue.toLowerCase();
            switch(menue){
                case "1","Walk", "walk", "w":
                    place = walking();
                    break;
                case "2","Battle","battle","b":
                    Battle(rdmonster(place, 'm', 1), P1);
                    break;
                case"3","Talk", "talk", "t":
                    Random rander = new Random();
                    int louge = rander.nextInt(3);
                    SlowText.run(npcDialouge[louge], 1);
                    break;
                case "5","Rest","rest","r":
                    P1.rest();
                    break;
                case "4","Inventory", "inventory", "i", "inv":
                    for( Items i: P1.inventory){
                        System.out.println(i.Iname);

                    }
            }
        }
        Battle(rdmonster(place, 'm', 1), P1);
    }
    public static Monster[] walking()throws InterruptedException{
        Scanner walk = new Scanner(System.in);
        String area = "";
        SlowText.run("Where would you like to go?\n1: Swamp | 2: Forest | 3: Jungle | 4: Castle | 5: Cave\n", 1);
        area = walk.nextLine();
        Monster[] place = Monster.swamp;
        switch (area){
            case "swamp", "1", "s":
                place = Monster.swamp;
                SlowText.run("You have reached the swamp.\n",1);
                break;
            case "forest", "2", "f":
                SlowText.run("You have reached the forest.\n",1);
                place = Monster.Forest;
                break;
            case "jungle", "3", "j":
                place = Monster.jungle;
                SlowText.run("You have reached the jungle.\n",1);
                break;
            case "castle", "4", "cas":
                SlowText.run("You have reached the castle.\n",1);
                place = Monster.castle;
                break;
            case "cave", "5", "cav":
                SlowText.run("You have reached the cave.\n",1);
                place = Monster.Cave;
                break;
        }
        return place;
    }
    public static Items Battle(Monster enemy, Hero player) throws InterruptedException {// change void later to Items i dont wanna code loot tables
        Random generator = new Random();
        Scanner action2 = new Scanner(System.in);
        for (Items i : player.inventory) {
            System.out.println(i.Iname);

        }
        SlowText.run("Which weapon would you like to attack with?\n",1);
        Weapons useWeapon = Items.Stick;
        String weapon42 = action2.nextLine();
        weapon42.toLowerCase();
        switch(weapon42) {
            case "iron sword":
                useWeapon = Items.bSword;
                break;
            case "javalin":
                useWeapon = Items.Javelin;
                break;
            case "dagger":
                useWeapon = Items.Dagger;
                break;
            case "stick":
                useWeapon = Items.Stick;
                break;
            case "bBat":
                useWeapon = Items.bBat;
                break;
            case "spear":
                useWeapon = Items.Spear;
                break;
            case "rock":
                useWeapon = Items.Rock;
                break;
            case "pfrog":
                useWeapon = Items.pFrog;
                break;
        }
                while (enemy.health >= 0 && player.health >= 0) {
            Scanner action = new Scanner(System.in);
            System.out.println("1: Attack | 2: Inventory");
            String Caction = action.nextLine();
            switch (Caction) {
                case "inventory", "i", "inv", "2":
                    for (Items i : player.inventory) {
                        System.out.println(i.Iname);

                    }
                    String items45 = action.nextLine();
                    player.UseItem(items45);
                    break;
                case "attack", "a", "1":

                    int damage;
                    if (enemy.defense <= player.hero_attack(useWeapon) + generator.nextInt(20)) {
                        damage = generator.nextInt(useWeapon.dmg) + 1;
                        enemy.takeDamage(damage);
                        SlowText.run("You did " + damage + " damage!\n", 1);
                    }
                    else{
                        SlowText.run("You missed!\n",1);
                    }
                    if (player.defense <= enemy.attack + generator.nextInt(20)) {
                        damage = generator.nextInt(enemy.dmg) + 1;
                        player.takeDamage(damage);
                        SlowText.run(enemy.name + " did " + damage + " damage!\n", 1);
                    } else {
                        SlowText.run(enemy.name + " missed!\n", 1);
                    }
                    SlowText.run("your hero has " + player.health + " hp left.\n", 1);
                    SlowText.run(enemy.name+" has " + enemy.health + " hp left.\n", 1);
                    if (enemy.health <= 0) {
                        System.out.println("You have defeated " + enemy.name + "!\n");
                        player.grabItem(enemy.loot);
                        break;
                    }
                    if (player.health <= 0) {
                        System.out.println("You have fallen to " + enemy.name + "...\n");
                        break;
                    }
                    break;
            }
        }
        return null;
    }
    public static Monster rdmonster(Monster[] monsters, char difficulty, int level) {
        int encounter = 0;
        Random generator = new Random();
        encounter = generator.nextInt(monsters.length);
        Monster enemy = monsters[encounter];
        System.out.println(enemy.name+" attacks!\n");
        return enemy;
    }
}