

public class thex {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Thread th = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 10; i++) {
                    try {
                        Thread.sleep(1000); // 100
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println(i);
                }
            }
        };
        Thread th2 = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <=5; i++) {
                    try {
                        Thread.sleep(1000); // 1200
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println(i * -1);
                }
            }
        };
        th.start();
        // th2.start();
    }
}