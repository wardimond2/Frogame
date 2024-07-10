public class Items {
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
