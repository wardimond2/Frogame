import java.lang.Thread;
import java.util.concurrent.TimeUnit;

public class SlowText {
    public static void run(String prompt) throws InterruptedException{
        for (int i = 0; i < prompt.length(); i++) {
            System.out.print(prompt.charAt(i));
            TimeUnit.MILLISECONDS.sleep(20);
        }
    }
}