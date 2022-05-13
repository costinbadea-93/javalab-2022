package threads0;

public class ThreadTask extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < 10 ; i ++){
            try {
                System.out.println("Printing " + i + " " + Thread.currentThread().getName());
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
