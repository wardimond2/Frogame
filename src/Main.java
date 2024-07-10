import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        Scanner playerInput = new Scanner(System.in);
        String heroName;
        String heroClass;
        double heroHealth;
        int heroAC;
        int heroArcana;
        System.out.println("What is your hero's name?");
        heroName = playerInput.nextLine();
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
                    Hero P1 = new Hero(heroName, 19, 20, 10, 19, 15, 2, 3);
                    break;
                }
            }
            else if(Objects.equals(playerclass, "Paladin") || Objects.equals(playerclass, "2"))
            {
                System.out.println("\nPaladin Stats:\nStrength:19\nDexterity: 15\nConstitution: 2\nIntelligence: 3\n\nChoose Paladin? (y/n):");
                if (Objects.equals(playerInput.nextLine(), "y")) {
                    heroClass = "Paladin";
                    System.out.println("Your class is " + heroClass);
                    Hero P1 = new Hero(heroName, 19, 20, 10, 19, 15, 2, 3);
                    break;
                }
            }
            else if(Objects.equals(playerclass, "Wizard") || Objects.equals(playerclass, "3"))
            {
                System.out.println("\nWizard Stats:\nStrength:19\nDexterity: 15\nConstitution: 2\nIntelligence: 3\n\nChoose Wizard? (y/n):");
                if (Objects.equals(playerInput.nextLine(), "y")) {
                    heroClass = "Wizard";
                    System.out.println("Your class is " + heroClass);
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
                    break;
                }
            }
            else if(Objects.equals(playerclass, "Bard") || Objects.equals(playerclass, "5")) {
                System.out.println("\nBard Stats:\nStrength:19\nDexterity: 15\nConstitution: 2\nIntelligence: 3\n\nChoose Bard? (y/n):");
                if (Objects.equals(playerInput.nextLine(), "y")) {
                    heroClass = "Bard";
                    System.out.println("Your class is " + heroClass);
                    break;
                }
            }
        }

    }
}
