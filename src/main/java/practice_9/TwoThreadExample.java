package practice_9;

public class TwoThreadExample {
    public static void main(String[] args) {
        Runnable taskA = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("A");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
            }
        };

        Runnable taskB = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("B");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }

            }
        };

        Thread threadA = new Thread(taskA);
        Thread threadB = new Thread(taskB);

        threadA.start();
        threadB.start();

        System.out.println("thread is young! and we are start.....");

    }
}



