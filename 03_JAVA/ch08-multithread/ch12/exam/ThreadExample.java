package advanced.ch12.exam;

public class ThreadExample {
    public static void main(String[] args) {
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 3; i++) {
                    System.out.println("동영상을 재생합니다.");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        };
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 6; i++) {
                    System.out.println("음악을 재생합니다.");

                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
