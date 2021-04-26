public class MyThread implements Runnable{
    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "- " + i * i);
        }
            try {
               // Thread.sleep(100);
                Thread.currentThread().sleep(50);
            } catch ( e) {
                System.out.println(e);
            }
        }
    public static void main(String args[]){
        new Thread(new MyThread(),"First").start();
        new Thread(new MyThread(),"Second").start();
        new Thread(new MyThread(),"Third").start();

    }
}
