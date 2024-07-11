import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        // defining all enemies and they're stats
        Monster snakes = new Monster("snake", 10, 10, 10);
        Monster tiger = new Monster("tiger", 10, 10, 10);
        Monster buffafalo = new Monster("buffalo", 10,10,10);
        Monster elefalant = new Monster("elephant", 10, 10, 10);
        Monster chicken = new Monster("chicken", 10, 10, 10);
        Monster ents = new Monster("ent", 10, 10, 10);
        Monster crocodile = new Monster("crocodile", 10,10,10);
        Monster panther = new Monster("panther", 10,10,10);
        Monster gorrila = new Monster("gorrila",10,10,10);
        Monster slimes = new Monster("slimes",10,10,10);
        Monster rats = new Monster("rats",10,10,10);
        Monster bats = new Monster("bats",10,10,10);
        Monster ants = new Monster("ants",10,10,10);
        Monster cats = new Monster("cats",10,10,10);
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
        System.out.println("What is your hero's name?");
        heroName = playerInput.nextLine();
        Hero P1 = new Hero(heroName, 19, 20, 10, 19, 15, 2, 3);
        System.out.println("\nWelcome, " + heroName + "!");
        while (true) {
            System.out.println("What class are you?\n1: Warrior\n2: Paladin\n3: Wizard\n4: Hunter\n5: Bard");
            String playerclass = playerInput.nextLine();
            if(Objects.equals(playerclass, "Warrior") || Objects.equals(playerclass, "1"))
            {
                System.out.println("\nWarrior Stats:\nStrength:19\nDexterity: 15\nConstitution: 2\nIntelligence: 3\n\nChoose Warrior? (y/n):");
                if (Objects.equals(playerInput.nextLine(), "y")) {
                    heroClass = "Warrior";
                    System.out.println("Your class is " + heroClass);
                    P1.classChange(heroName, 19, 20, 10, 19, 15, 2, 3);
                    break;
                }
            }
            else if(Objects.equals(playerclass, "Paladin") || Objects.equals(playerclass, "2"))
            {
                System.out.println("\nPaladin Stats:\nStrength:19\nDexterity: 15\nConstitution: 2\nIntelligence: 3\n\nChoose Paladin? (y/n):");
                if (Objects.equals(playerInput.nextLine(), "y")) {
                    heroClass = "Paladin";
                    System.out.println("Your class is " + heroClass);
                    P1.classChange(heroName, 19, 20, 10, 19, 15, 2, 3);
                    break;
                }
            }
            else if(Objects.equals(playerclass, "Wizard") || Objects.equals(playerclass, "3"))
            {
                System.out.println("\nWizard Stats:\nStrength:19\nDexterity: 15\nConstitution: 2\nIntelligence: 3\n\nChoose Wizard? (y/n):");
                if (Objects.equals(playerInput.nextLine(), "y")) {
                    heroClass = "Wizard";
                    System.out.println("Your class is " + heroClass);
                    P1.classChange(heroName, 19, 20, 10, 19, 15, 2, 3);
                    break;
                }
            }
            else if(Objects.equals(playerclass, "Hunter") || Objects.equals(playerclass, "4"))
            {
                System.out.println("\nHunter Stats:\nStrength:19\nDexterity: 15\nConstitution: 2\nIntelligence: 3\n\nChoose Hunter? (y/n):");
                if (Objects.equals(playerInput.nextLine(), "y")) {
                    heroClass = "Hunter";
                    //heroClass = "Hunter";
                    System.out.println("Your class is " + heroClass);
                    P1.classChange(heroName, 19, 20, 10, 19, 15, 2, 3);
                    break;
                }
            }
            else if(Objects.equals(playerclass, "Bard") || Objects.equals(playerclass, "5")) {
                System.out.println("\nBard Stats:\nStrength:19\nDexterity: 15\nConstitution: 2\nIntelligence: 3\n\nChoose Bard? (y/n):");
                if (Objects.equals(playerInput.nextLine(), "y")) {
                    heroClass = "Bard";
                    System.out.println("Your class is " + heroClass);
                    P1.classChange(heroName, 19, 20, 10, 19, 15, 2, 3);
                    break;
                }
            }
        }

        // game start true game
        P1.grabItem();
    Battle(rdmonster(safari, 'm', 1), P1);
    }
    public static void Battle(Monster enemy, Hero player){// change void later to Items i dont wanna code loot tables
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



