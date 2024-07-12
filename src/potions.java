public class potions extends Items {
    public String Iname;
    public int power;
    public static potions smhpotion = new potions("Small Health Potion", 10);
    public static potions sshpotion = new potions("Super Small Health Potion", 5);
    public static potions tbhpotion = new potions("Large Health Potion", 20);
    public potions(String Iname, int power) {
        super(Iname, power,9,19,0);
    }
}
