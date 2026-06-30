public class Threading implements Runnable {


        public void run() {
            System.out.println("Thread is running: " + Thread.currentThread().getName());
        }

        public static void main(String[] args) {
            Threading example = new Threading();
            Thread thread = new Thread(example);
            thread.start();
        }
    }
    