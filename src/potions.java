public class potions extends Items {
    public String Iname;
    public int power;
    potions smhpotion = new potions("small health potion", 10);
    potions sshpotion = new potions("small health potion", 5);
    potions tbhpotion = new potions("large health potion", 20);
    public potions(String Iname, int power) {
        super(Iname, power,9,19,0);
    }
}
