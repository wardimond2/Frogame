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
        String[] npcDialouge = {"Go fight some bad guys.\n", "An Elephant attacked me help!\n", "Hullo!\n", "IM DIEING SAVE ME\n", "\'MERICA\n"};
        double heroHealth;
        int heroAC;
        int heroArcana;
        // game start - init
        SlowText.run("What is your hero's name?\n", 1);
        heroName = playerInput.nextLine();
        Hero P1 = new Hero(heroName, 19, 20, 15, 19, 15, 2, 3, 20);
        SlowText.run("\nWelcome, " + heroName + "!\n", 1);
        while (true) {
            SlowText.run("What class are you?\n1: Warrior\n2: Paladin\n3: Wizard\n4: Hunter\n5: Bard\n", 1);
            String playerclass = playerInput.nextLine();
            if(Objects.equals(playerclass, "Warrior") || Objects.equals(playerclass, "1"))
            {
                SlowText.run("\nWarrior Stats:\nStrength:19\nDexterity: 15\nConstitution: 2\nIntelligence: 3\n\nChoose Warrior? (y/n):\n", 1);
                if (Objects.equals(playerInput.nextLine(), "y")) {
                    heroClass = "Warrior";
                    System.out.println("Your class is " + heroClass);
                    P1.classChange(heroName, 19, 20, 15, 19, 15, 2, 3);
                    break;
                }
            }
            else if(Objects.equals(playerclass, "Paladin") || Objects.equals(playerclass, "2"))
            {
                SlowText.run("\nPaladin Stats:\nStrength:19\nDexterity: 15\nConstitution: 2\nIntelligence: 3\n\nChoose Paladin? (y/n):\n", 1);
                if (Objects.equals(playerInput.nextLine(), "y")) {
                    heroClass = "Paladin";
                    SlowText.run("Your class is " + heroClass+" ", 1);
                    P1.classChange(heroName, 19, 20, 15, 19, 15, 2, 3);
                    break;
                }
            }
            else if(Objects.equals(playerclass, "Wizard") || Objects.equals(playerclass, "3"))
            {
                SlowText.run("\nWizard Stats:\nStrength:19\nDexterity: 15\nConstitution: 2\nIntelligence: 3\n\nChoose Wizard? (y/n):\n", 1);
                if (Objects.equals(playerInput.nextLine(), "y")) {
                    heroClass = "Wizard";
                    SlowText.run("Your class is " + heroClass+"\n", 1);
                    P1.classChange(heroName, 19, 20, 15, 19, 15, 2, 3);
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
                    P1.classChange(heroName, 19, 20, 15, 19, 15, 2, 3);
                    break;
                }
            }
            else if(Objects.equals(playerclass, "Bard") || Objects.equals(playerclass, "5")) {
                SlowText.run("\nBard Stats:\nStrength:19\nDexterity: 15\nConstitution: 2\nIntelligence: 3\n\nChoose Bard? (y/n):\n", 1);
                if (Objects.equals(playerInput.nextLine(), "y")) {
                    heroClass = "Bard";
                    SlowText.run("Your class is " + heroClass+"\n", 1);
                    P1.classChange(heroName, 19, 20, 15, 19, 15, 2, 3);
                    break;
                }
            }
        }

        // game start true game
        String[][] swampl;
        swampl = new String[10][10];
        Monster[] place = Monster.swamp;
        String land = "";
        Scanner walk = new Scanner(System.in);
        P1.hero_upgrade(Items.Stick.power);
        boolean run = true;
        // GAME fOR REAL THIS TIME
        while(run == true){
            SlowText.run("Walk | Battle | Talk | Rest| Inventory\n",1);
            String menue = playerInput.nextLine();
            menue.toLowerCase();
            switch(menue){
                case "walk":
                    place = walking();
                    break;
                case "battle":
                    Battle(rdmonster(place, 'm', 1), P1);
                    break;
                case"talk":
                    Random rander = new Random();
                    int louge = rander.nextInt(3);
                    SlowText.run(npcDialouge[louge], 1);
                    break;
                case "Rest","rest","r":
                    P1.rest();
                    break;
                case "Inventory", "inventory", "i", "inv":
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
        SlowText.run("Where would you like to go?\n", 1);
        area = walk.nextLine();
        Monster[] place = Monster.swamp;
        switch (area){
            case "swamp":
                place = Monster.swamp;
                SlowText.run("You have reached the swamp.\n",1);
                break;
            case "forest":
                SlowText.run("You have reached the forest.\n",1);
                place = Monster.Forest;
                break;
            case "jungle":
                place = Monster.jungle;
                SlowText.run("You have reached the jungle.\n",1);
                break;
            case "castle":
                SlowText.run("You have reached the castle.\n",1);
                place = Monster.castle;
                break;
            case "cave":
                SlowText.run("You have reached the cave.\n",1);
                place = Monster.Cave;
                break;

        }
        return place;
    }
    public static Items Battle(Monster enemy, Hero player) throws InterruptedException {// change void later to Items i dont wanna code loot tables
        Random generator = new Random();
        while (enemy.health >= 0 && player.health >= 0) {
            Scanner action = new Scanner(System.in);
            String Caction = action.nextLine();
            switch (Caction) {
                case "inventory", "i", "inv":
                    for (Items i : player.inventory) {
                        System.out.println(i.Iname);

                    }
                    String items45 = action.nextLine();
                    player.UseItem(items45);
                    break;
                case "attack":

                    int damage;
                    if (enemy.defense <= player.attack + generator.nextInt(20)) {
                        damage = generator.nextInt(player.attack) + 1;
                        enemy.takeDamage(damage);
                        SlowText.run("You did " + damage + " damage!\n", 1);

                    }
                    if (player.defense <= enemy.attack + generator.nextInt(20)) {
                        damage = generator.nextInt(enemy.dmg) + 1;
                        player.takeDamage(damage);
                        SlowText.run(enemy.name + " did " + damage + " damage!\n", 1);
                    } else {
                        SlowText.run(enemy.name + " missed!\n", 1);
                    }
                    SlowText.run("your hero has " + player.health + " hp left.\n", 1);
                    if (enemy.health <= 0) {
                        System.out.println("You have defeated " + enemy.name + "!");
                        player.grabItem(enemy.loot);
                        break;
                    }
                    if (player.health <= 0) {
                        System.out.println("You have fallen to " + enemy.name + "...");
                        break;
                    }

            }
            System.out.println(enemy.health);
        }
        return null;
    }
    public static Monster rdmonster(Monster[] monsters, char difficulty, int level) {
        int encounter = 0;
        Random generator = new Random();
        encounter = generator.nextInt(monsters.length);
        Monster enemy = monsters[encounter];
        System.out.println(enemy.name+" attacks!");
        return enemy;
    }
}