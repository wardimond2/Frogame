public class Monster {
    static Items[] Snakel = {Items.iSword};
    static Monster snakes = new Monster("snake", 10, 15, 10, Snakel);
    static Monster tiger = new Monster("tiger", 10, 15, 10, Snakel);
    static Monster buffafalo = new Monster("buffalo", 10,15,10, Snakel);
    static Monster elefalant = new Monster("elephant", 10, 15, 10, Snakel);
    static Monster chicken = new Monster("chicken", 10, 15, 10 ,Snakel);
    static Monster ents = new Monster("ent", 10, 10, 15 ,Snakel);
    static Monster crocodile = new Monster("crocodile", 10,15,10, Snakel);
    static Monster panther = new Monster("panther", 10,15,10, Snakel);
    static Monster gorrila = new Monster("gorrila",10,15,10, Snakel);
    static Monster slimes = new Monster("slimes",10,15,10, Snakel);
    static Monster rats = new Monster("rats",10,15,10, Snakel);
    static Monster bats = new Monster("bats",10,15,10,Snakel);
    static Monster ants = new Monster("ants",10,15,10, Snakel);
    static Monster cats = new Monster("cats",10,15,10, Snakel);
    // defining areas
   public static  Monster[] safari ={tiger, buffafalo, elefalant, chicken};
   public static Monster[] Forest ={snakes, ents, crocodile};
    public static Monster[] jungle ={snakes, panther, gorrila};
    public static Monster[] castle ={slimes, rats, snakes, chicken};
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
