package threads1;

public class TaskExecutor extends Thread {

    private final Task task;

    public TaskExecutor(Task task) {
       this.task = task;
    }

    @Override
    public void run() {
        task.iterate();
    }
}
