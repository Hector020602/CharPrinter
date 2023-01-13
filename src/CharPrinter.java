public class CharPrinter implements Runnable {

    private char ch;
    private long waitTime;

    public CharPrinter(char ch, long waitTime) {
        this.ch = ch;
        this.waitTime = waitTime;
    }

    @Override
    public void run() {
        int count = 0;
        try {
            while (true) {
                count++;
                System.out.print(ch);
                if (count == 5) {
                    System.out.println();
                    count = 0;
                }
                Thread.sleep(waitTime);

            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
