package HomeWork22;

public class ThreadService {

    int sum = 0;

    public void submit(Runnable task) {
        Thread newThread = new Thread(task);
        newThread.start();
    }
}