package advanced.ch12.exam;

public class MovieThread {
    public static void main(String[] args) {
        Thread thread = new Thread() {
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
        thread.start();
    }
}
