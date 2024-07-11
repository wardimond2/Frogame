public class Items {
    public static Weapons iSword = new Weapons("Iron Sword",10, 1);
    public static Weapons Javelin = new Weapons("Exploding Javelin",999999999, 1);
    public static Weapons Dagger = new Weapons("Dagger",10, 1);
    public static Weapons Stick = new Weapons("Stick",10, 1);
    public static Weapons bBat = new Weapons("Baseball Bat",10, 1);
    public static Weapons Spear = new Weapons("Spear",10, 1);
    public static Weapons Rock = new Weapons("Rock",10, 1);
    public static Weapons pFrog = new Weapons("Poison Dart Frog",10, 1);
    public String Iname;
    public int power;
    public int prob;
    public Items(String Iname, int power, int prob){
        this.Iname = Iname;
        this.power = power;
        this.prob = prob;
    }
public String getInfo(){
    return Iname+" "+power;
}
}
