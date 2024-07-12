import java.util.Random;

public class Monster {
    static Items[] snakeL = {Items.bSword, Items.Rock, Items.Fang};
    static Items[] tigerL = {Items.bSword, Items.Rock, Items.Fang};
    static Items[] buffafaloL = {Items.bSword, Items.Rock};
    static Items[] elefalantL = {Items.bSword, Items.Rock};
    static Items[] chickenL = {Items.bSword, Items.Rock};
    static Items[] entsL = {Items.bSword, Items.Stick, Items.Spear, Items.Javelin};
    static Items[] crocodileL = {Items.Rock, Items.Stick, Items.pFrog, Items.Fang};
    static Items[] pantherL = {Items.bSword, Items.Rock, Items.Fang};
    static Items[] gorrilaL = {Items.bSword, Items.Rock};
    static Items[] slimesL = {Items.bSword, Items.Rock, Items.pFrog};
    static Items[] ratsL = {Items.Stick, Items.Rock};
    static Items[] batsL = {Items.bBat, Items.Rock};
    static Items[] antsL = {Items.bSword, Items.Rock};
    static Items[] catsL = {Items.bSword, Items.Rock};
    static Monster snake = new Monster("Snake", 10, 5, 6,  10, snakeL);
    static Monster tiger = new Monster("Tiger", 10, 6, 6,  10, tigerL);
    static Monster buffafalo = new Monster("Buffalo", 10,5, 6, 10, buffafaloL);
    static Monster elefalant = new Monster("Elephant", 10, 5, 6,  10, elefalantL);
    static Monster chicken = new Monster("Swamp Chicken", 10, 3, 6,  10 ,chickenL);
    static Monster ents = new Monster("Ent", 10, 10, 6 , 6, entsL);
    static Monster crocodile = new Monster("Crocodile", 10,5, 6, 10, crocodileL);
    static Monster panther = new Monster("Panther", 22,15, 6, 10, pantherL);
    static Monster gorrila = new Monster("Gorilla",22,15, 6, 10, gorrilaL);
    static Monster slimes = new Monster("Slimes",24,4, 6, 10, slimesL);
    static Monster rats = new Monster("Rats",8,4, 6, 10, ratsL);
    static Monster bats = new Monster("Bats",14,5, 6, 10,batsL);
    static Monster ants = new Monster("Ants",7,4, 2, 10, antsL);
    static Monster cats = new Monster("Cats",10,6, 3, 10, catsL);
    // defining areas
   public static  Monster[] swamp ={tiger, buffafalo, elefalant, chicken};
   public static Monster[] Forest ={snake, ents, crocodile};
    public static Monster[] jungle ={snake, panther, gorrila};
    public static Monster[] castle ={slimes, rats, snake, chicken};
    public static Monster[] Cave = {bats, rats, ants, cats};

    // contructor
    public Monster(String name, int health, int attack, int dmg, int defense, Items[] loot){
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.dmg = dmg;
        this.loot = loot;
    }
    // class adjectives
    public String name;
    public int health;
    public int attack;
    public int dmg;
    public int defense;
    public Items[] loot;
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
        if(health<0) {
            health = 0;
        }
    }
}
