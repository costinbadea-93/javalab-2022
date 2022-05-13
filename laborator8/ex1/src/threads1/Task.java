package threads1;

public class Task {
    public void iterate() {
        synchronized (this){
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
}
