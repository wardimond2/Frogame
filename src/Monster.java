public class Monster {
    static Items[] snakeL = {Items.iSword, Items.Rock};
    static Items[] tigerL = {Items.iSword, Items.Rock};
    static Items[] buffafaloL = {Items.iSword, Items.Rock};
    static Items[] elefalantL = {Items.iSword, Items.Rock};
    static Items[] chickenL = {Items.iSword, Items.Rock};
    static Items[] entsL = {Items.iSword, Items.Rock};
    static Items[] crocodileL = {Items.iSword, Items.Rock};
    static Items[] pantherL = {Items.iSword, Items.Rock};
    static Items[] gorrilaL = {Items.iSword, Items.Rock};
    static Items[] slimesL = {Items.iSword, Items.Rock};
    static Items[] ratsL = {Items.iSword, Items.Rock};
    static Items[] batsL = {Items.iSword, Items.Rock};
    static Items[] antsL = {Items.iSword, Items.Rock};
    static Items[] catsL = {Items.iSword, Items.Rock};
    static Monster snake = new Monster("Snake", 10, 15, 10, snakeL);
    static Monster tiger = new Monster("Tiger", 10, 15, 10, tigerL);
    static Monster buffafalo = new Monster("Buffalo", 10,15,10, buffafaloL);
    static Monster elefalant = new Monster("Elephant", 10, 15, 10, elefalantL);
    static Monster chicken = new Monster("Swamp Chicken", 10, 15, 10 ,chickenL);
    static Monster ents = new Monster("Ent", 10, 10, 15 ,entsL);
    static Monster crocodile = new Monster("Crocodile", 10,15,10, crocodileL);
    static Monster panther = new Monster("Panther", 10,15,10, pantherL);
    static Monster gorrila = new Monster("Gorrila",10,15,10, gorrilaL);
    static Monster slimes = new Monster("Slimes",10,15,10, slimesL);
    static Monster rats = new Monster("Rats",10,15,10, ratsL);
    static Monster bats = new Monster("Bats",10,15,10,batsL);
    static Monster ants = new Monster("Ants",10,15,10, antsL);
    static Monster cats = new Monster("Cats",10,15,10, catsL);
    // defining areas
   public static  Monster[] swamp ={tiger, buffafalo, elefalant, chicken};
   public static Monster[] Forest ={snake, ents, crocodile};
    public static Monster[] jungle ={snake, panther, gorrila};
    public static Monster[] castle ={slimes, rats, snake, chicken};
    public static Monster[] Cave = {bats, rats, ants, cats};
    // contructor
    public Monster(String name, int health, int attack, int defense, Items[] loot){
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;


    }
    // class adjectives
    public String name;
    public int health;
    private int attack;
    public int defense;
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
    }
}
