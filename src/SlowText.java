import java.lang.Thread;
import java.util.concurrent.TimeUnit;

public class SlowText {
    public static void run(String prompt, int style) throws InterruptedException{
        if (style == 1) {
            for (int i = 0; i < prompt.length(); i++) {
                System.out.print(prompt.charAt(i));
                TimeUnit.MILLISECONDS.sleep(0);
            }
        }
        if (style == 2) {
            for (int i = 0; i < prompt.length(); i++) {
                System.out.print(prompt.charAt(i));
                TimeUnit.MILLISECONDS.sleep(50);
            }
        }
    }
}