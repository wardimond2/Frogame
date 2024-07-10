import java.util.Scanner;
import java.lang.Thread;
public class IntChecker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int yahoo = 0;
        while (!scan.hasNextInt()) {
            System.out.println("not an int");
            String junk = scan.nextLine();
        }
        System.out.println(yahoo);
    }
}
