public class Items {
    public static Weapons bSword = new Weapons("BroadSword",10);
    public static Weapons Javelin = new Weapons("Exploding Javelin",999999999);
    public static Weapons Dagger = new Weapons("Dagger",6);
    public static Weapons Stick = new Weapons("Stick",2);
    public static Weapons bBat = new Weapons("Baseball Bat",11);
    public static Weapons Spear = new Weapons("Spear",9);
    public static Weapons Rock = new Weapons("Rock",4);
    public static Weapons pFrog = new Weapons("Poison Dart Frog",15);
    public static Weapons Fang = new Weapons("Fang",12);
    public String Iname;
    public int power;
    public Items(String Iname, int power){
        this.Iname = Iname;
        this.power = power;
    }
public String getInfo(){
    return Iname+" "+power;
}
}
