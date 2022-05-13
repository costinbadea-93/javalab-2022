package producerconsumer;

import java.util.ArrayList;
import java.util.List;

public class ProducerConsumerTask {

    private List<Integer> integerList = new ArrayList<>();
    int capacity = 5;

    public void produce() throws InterruptedException{
        int value = 0;
        while (true){
            synchronized (this){
                while (integerList.size() == capacity){
                    wait();
                }
                integerList.add(value ++);
                System.out.println("We produced a new value - " + value);
                notify();
                Thread.sleep(500);
            }
        }
    }

    public void consume()  throws  InterruptedException{
        while (true){
            synchronized (this){
                while (integerList.size() == 0){
                    wait();
                }
                int removed = integerList.remove(0);
                System.out.println("We consumed a new value " + removed);
                notify();
                Thread.sleep(500);
            }
        }
    }
}
