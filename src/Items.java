public class Items {
    public static Weapons bSword = new Weapons("Broad Sword",10, 99, 99, 20);
    public static Weapons Javelin = new Weapons("Exploding Javelin",999999999, 99, 99, 999999999);
    public static Weapons Dagger = new Weapons("Dagger",6, 99, 99, 14);
    public static Weapons Stick = new Weapons("Stick",2, 99, 99, 999999999);
    public static Weapons bBat = new Weapons("Baseball Bat",11, 99, 99, 999999999);
    public static Weapons Spear = new Weapons("Spear",9, 99, 99, 999999999);
    public static Weapons Rock = new Weapons("Rock",4, 99, 99, 999999999);
    public static Weapons pFrog = new Weapons("Poison Dart Frog",15, 99, 99, 999999999);
    public static Weapons Fang = new Weapons("Fang",12, 99, 99, 999999999);
    public String Iname;
    public int power;
    public int prob;
    public int prob2;
    public int dmg;
    public Items(String Iname, int power, int prob, int prob2, int dmg){
        this.Iname = Iname;
        this.power = power;
        this.prob = prob;
        this.prob2 = prob2;
        this.dmg = dmg;
    }
public String getInfo(){
    return Iname+" "+power;
}
}
