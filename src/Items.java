public class Items {
    public static Weapons bSword = new Weapons("Broad Sword",5, 90, 0, 9);
    public static Weapons Javelin = new Weapons("Exploding Javelin",999999999, 1, 99, 999999999);
    public static Weapons Dagger = new Weapons("Dagger",6, 10, 89, 6);
    public static Weapons Stick = new Weapons("Stick",2, 15, 78, 3);
    public static Weapons bBat = new Weapons("Baseball Bat",8, 54, 63, 12);
    public static Weapons Spear = new Weapons("Spear",11, 8, 43, 10);
    public static Weapons Rock = new Weapons("Rock",4, 24, 33, 4);
    public static Weapons pFrog = new Weapons("Poison Dart Frog",12, 19, 23, 15);
    public static Weapons Fang = new Weapons("Fang",9, 99, 99, 10);
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
