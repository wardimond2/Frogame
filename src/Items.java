public class Items {
    public static Weapons iSword = new Weapons("Iron Sword",10);
    public static Weapons Javelin = new Weapons("Exploding Javelin",999999999);
    public static Weapons Dagger = new Weapons("Dagger",10);
    public static Weapons Stick = new Weapons("Stick",10);
    public static Weapons bBat = new Weapons("Baseball Bat",10);
    public static Weapons Spear = new Weapons("Spear",10);
    public static Weapons Rock = new Weapons("Rock",10);
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
