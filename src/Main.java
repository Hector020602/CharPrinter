import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Runnable> list = new ArrayList<>();

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            long wait = 3000 + (long) (Math.random() * 3001);
            list.add(new CharPrinter(ch, wait));
        }
        LaunchThread(list);
    }
    public static void LaunchThread(List<Runnable> list) {
        for (Runnable r : list) {
            new Thread(r).start();
        }
    }
}

