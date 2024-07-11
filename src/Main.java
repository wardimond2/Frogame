import jdk.jfr.consumer.RecordedFrame;

import java.io.Console;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) throws InterruptedException{
        // defining areas
        Scanner playerInput = new Scanner(System.in);
        String heroName;
        String heroClass;
        String[] npcDialouge = {"help us hero", "save us from (insert big bad enemy here)", "quickly hero power up to save us all", "IM DIEING SAVE ME"};
        double heroHealth;
        int heroAC;
        int heroArcana;
        // game start - init
        SlowText.run("What is your hero's name?\n");
        heroName = playerInput.nextLine();
        Hero P1 = new Hero(heroName, 19, 20, 15, 19, 15, 2, 3);
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
                    P1.classChange(heroName, 19, 20, 15, 19, 15, 2, 3);
                    break;
                }
            }
            else if(Objects.equals(playerclass, "Paladin") || Objects.equals(playerclass, "2"))
            {
                SlowText.run("\nPaladin Stats:\nStrength:19\nDexterity: 15\nConstitution: 2\nIntelligence: 3\n\nChoose Warrior? (y/n):\n");
                if (Objects.equals(playerInput.nextLine(), "y")) {
                    heroClass = "Paladin";
                    SlowText.run("Your class is " + heroClass+" ");
                    P1.classChange(heroName, 19, 20, 15, 19, 15, 2, 3);
                    break;
                }
            }
            else if(Objects.equals(playerclass, "Wizard") || Objects.equals(playerclass, "3"))
            {
                SlowText.run("\nWizard Stats:\nStrength:19\nDexterity: 15\nConstitution: 2\nIntelligence: 3\n\nChoose Warrior? (y/n):\n");
                if (Objects.equals(playerInput.nextLine(), "y")) {
                    heroClass = "Wizard";
                    SlowText.run("Your class is " + heroClass+"\n");
                    P1.classChange(heroName, 19, 20, 15, 19, 15, 2, 3);
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
                    P1.classChange(heroName, 19, 20, 15, 19, 15, 2, 3);
                    break;
                }
            }
            else if(Objects.equals(playerclass, "Bard") || Objects.equals(playerclass, "5")) {
                SlowText.run("\nBard Stats:\nStrength:19\nDexterity: 15\nConstitution: 2\nIntelligence: 3\n\nChoose Warrior? (y/n):\n");
                if (Objects.equals(playerInput.nextLine(), "y")) {
                    heroClass = "Bard";
                    SlowText.run("Your class is " + heroClass+"\n");
                    P1.classChange(heroName, 19, 20, 15, 19, 15, 2, 3);
                    break;
                }
            }
        }

        // game start true game
        P1.grabItem();
        Monster[] place = Monster.swamp;
        String land = "";
        Scanner walk = new Scanner(System.in);
        boolean run = true;
        // GAME fOR REAL THIS TIME
        while(run == true){
            playerInput.nextLine();
            String menue = playerInput.nextLine();
            switch(menue){
                case "walk":
                    place = walking();
                case "battle":
                    Battle(rdmonster(place, 'm', 1), P1);
                case"talk":

            }
            place = walking();
        }
        Battle(rdmonster(place, 'm', 1), P1);
    }
    public static Monster[] walking()throws InterruptedException{
        Scanner walk = new Scanner(System.in);
        String area = "";
        SlowText.run("where would you like to go\n");
        area = walk.nextLine();
        Monster[] place = {Monster.snakes};
        switch (area){
            case "savanna":
                place = Monster.swamp;
                break;
            case "forest":
                place = Monster.Forest;
                break;
            case "jungle":
                place = Monster.jungle;
                break;
            case "castle":
                place = Monster.castle;
                break;
            case "cave":
                place = Monster.Cave;
                break;

        }
        return place;
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
                    SlowText.run(enemy.name+" has "+Integer.toString(enemy.health)+" hp ");

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



