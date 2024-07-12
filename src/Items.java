public class Items {
    public static Weapons bSword = new Weapons("Broad Sword",5, 13, 0, 9);
    public static Weapons Javelin = new Weapons("Exploding Javelin",999999999, 1, 99, 999999999);
    public static Weapons Dagger = new Weapons("Dagger",6, 16, 89, 6);
    public static Weapons Stick = new Weapons("Stick",2, 17, 78, 3);
    public static Weapons bBat = new Weapons("Baseball Bat",8, 12, 63, 12);
    public static Weapons Spear = new Weapons("Spear",11, 9, 43, 10);
    public static Weapons Rock = new Weapons("Rock",4, 16, 33, 4);
    public static Weapons pFrog = new Weapons("Poison Dart Frog",12, 11, 23, 15);
    public static Weapons Fang = new Weapons("Fang",9, 10, 99, 10);
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
