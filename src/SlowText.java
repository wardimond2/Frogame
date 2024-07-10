import java.lang.Thread;
import java.util.concurrent.TimeUnit;

public class SlowText {
    public static void main(String[] args) throws InterruptedException{
        String text = "cheese is good";
        slowtext(text);
    }
    public static void slowtext(String prompt) throws InterruptedException{
        for (int i = prompt.length(); i <= prompt.length(); i--)
            System.out.print(prompt.charAt(i));
        TimeUnit.MILLISECONDS.sleep(100);
    }
}