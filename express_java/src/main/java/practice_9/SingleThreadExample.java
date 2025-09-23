package practice_9;

public class SingleThreadExample {
    public static void main(String[] args) {
        Runnable task = new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 5; i++) {
                    System.out.println("Привет из потока!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        Thread thread = new Thread(task);
        thread.start();//а я помню, что не через run!
        System.out.println("thread is young! and we are start.....");
    }
}