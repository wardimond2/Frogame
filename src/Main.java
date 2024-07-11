import jdk.jfr.consumer.RecordedFrame;

import java.io.Console;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) throws InterruptedException{
        // defining loot tables
        Items[] Snakel = {Items.iSword};
        // defining all enemies and they're stats
        Monster snakes = new Monster("snake", 10, 10, 10, Snakel);
        Monster tiger = new Monster("tiger", 10, 10, 10, Snakel);
        Monster buffafalo = new Monster("buffalo", 10,10,10, Snakel);
        Monster elefalant = new Monster("elephant", 10, 10, 10, Snakel);
        Monster chicken = new Monster("chicken", 10, 10, 10 ,Snakel);
        Monster ents = new Monster("ent", 10, 10, 10 ,Snakel);
        Monster crocodile = new Monster("crocodile", 10,10,10, Snakel);
        Monster panther = new Monster("panther", 10,10,10, Snakel);
        Monster gorrila = new Monster("gorrila",10,10,10, Snakel);
        Monster slimes = new Monster("slimes",10,10,10, Snakel);
        Monster rats = new Monster("rats",10,10,10, Snakel);
        Monster bats = new Monster("bats",10,10,10,Snakel);
        Monster ants = new Monster("ants",10,10,10, Snakel);
        Monster cats = new Monster("cats",10,10,10, Snakel);
        // defining areas
        Monster[] safari ={tiger, buffafalo, elefalant, chicken};
        Monster[] Forest ={snakes, ents, crocodile};
        Monster[] jungle ={snakes, panther, gorrila};
        Monster[] castle ={slimes, rats, snakes, chicken};
        Monster[] Cave = {bats, rats, ants, cats};
        Scanner playerInput = new Scanner(System.in);
        String heroName;
        String heroClass;
        double heroHealth;
        int heroAC;
        int heroArcana;
        // game start - init
        SlowText.run("What is your hero's name?\n");
        heroName = playerInput.nextLine();
        Hero P1 = new Hero(heroName, 19, 20, 10, 19, 15, 2, 3);
        SlowText.run("\nWelcome, " + heroName + "!\n");
        while (true) {
            SlowText.run("What class are you?\n1: Warrior\n2: Paladin\n3: Wizard\n4: Hunter\n5: Bard\n");
            String playerclass = playerInput.nextLine();
            if(Objects.equals(playerclass, "Warrior") || Objects.equals(playerclass, "1"))
            {
                SlowText.run("\nWarrior Stats:\nStrength:19\nDexterity: 15\nConstitution: 2\nIntelligence: 3\n\nChoose Warrior? (y/n):\n");
                if (Objects.equals(playerInput.nextLine(), "y")) {
                    heroClass = "Warrior";
                    System.out.println("Your class is " + heroClass);
                    P1.classChange(heroName, 19, 20, 10, 19, 15, 2, 3);
                    break;
                }
            }
            else if(Objects.equals(playerclass, "Paladin") || Objects.equals(playerclass, "2"))
            {
                SlowText.run("\nPaladin Stats:\nStrength:19\nDexterity: 15\nConstitution: 2\nIntelligence: 3\n\nChoose Warrior? (y/n):\n");
                if (Objects.equals(playerInput.nextLine(), "y")) {
                    heroClass = "Paladin";
                    System.out.println("Your class is " + heroClass);
                    P1.classChange(heroName, 19, 20, 10, 19, 15, 2, 3);
                    break;
                }
            }
            else if(Objects.equals(playerclass, "Wizard") || Objects.equals(playerclass, "3"))
            {
                SlowText.run("\nWizard Stats:\nStrength:19\nDexterity: 15\nConstitution: 2\nIntelligence: 3\n\nChoose Warrior? (y/n):\n");
                if (Objects.equals(playerInput.nextLine(), "y")) {
                    heroClass = "Wizard";
                    SlowText.run("Your class is " + heroClass+"\n");
                    P1.classChange(heroName, 19, 20, 10, 19, 15, 2, 3);
                    break;
                }
            }
            else if(Objects.equals(playerclass, "Hunter") || Objects.equals(playerclass, "4"))
            {
                SlowText.run("\nHunter Stats:\nStrength:19\nDexterity: 15\nConstitution: 2\nIntelligence: 3\n\nChoose Warrior? (y/n):\n");
                if (Objects.equals(playerInput.nextLine(), "y")) {
                    heroClass = "Hunter";
                    //heroClass = "Hunter";
                    SlowText.run("Your class is " + heroClass+"\n");
                    P1.classChange(heroName, 19, 20, 10, 19, 15, 2, 3);
                    break;
                }
            }
            else if(Objects.equals(playerclass, "Bard") || Objects.equals(playerclass, "5")) {
                SlowText.run("\nBard Stats:\nStrength:19\nDexterity: 15\nConstitution: 2\nIntelligence: 3\n\nChoose Warrior? (y/n):\n");
                if (Objects.equals(playerInput.nextLine(), "y")) {
                    heroClass = "Bard";
                    SlowText.run("Your class is " + heroClass+"\n");
                    P1.classChange(heroName, 19, 20, 10, 19, 15, 2, 3);
                    break;
                }
            }
        }

        // game start true game
        P1.grabItem();
    Battle(rdmonster(safari, 'm', 1), P1);
    }
    public static void Battle(Monster enemy, Hero player) throws InterruptedException {// change void later to Items i dont wanna code loot tables
        while(enemy.health >= 0 && player.health >= 0){
            Scanner action = new Scanner(System.in);
            String Caction = action.nextLine();
            switch(Caction){
                case "inventory":
                    for( Items i: player.inventory){
                        System.out.println(i.Iname);

                    }
                case "attack":
                    enemy.takeDamage(player.hero_attack());
                    SlowText.run(Integer.toString(enemy.name+""+enemy.health));

            }
            player.takeDamage(enemy.eAttack());
            System.out.println("your hero has "+player.health+" hp left.");
            if(enemy.health <= 0){
                System.out.println("you've defeated the enemy");
            }
            if(player.health <= 0){
                System.out.println("you've failed your mission");
            }

        }
        System.out.println(enemy.health);
    }
    public static Monster rdmonster(Monster[] monsters, char difficulty, int level) {
        int encounter = 0;
        Random generator = new Random();
        encounter = generator.nextInt(monsters.length);
        Monster enemy = monsters[encounter];
        System.out.println("you've encountered a " + enemy.name + " how will you respond");
        return enemy;
    }
}



