package procus;

import java.util.NoSuchElementException;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;

public class Container {
    private LinkedBlockingDeque<Task> queues = new LinkedBlockingDeque<Task>(5);
    private AtomicInteger nums = new AtomicInteger(0);
    private long timeout = 10000;
    int maxNum = 5;
    int less = 3;

    //Check timeout
    private void checkValid() {
        while (true) {
            try {
                Task task = this.queues.getFirst();
                //If the time that a item is staying in the container is longer than timeout
                if (System.currentTimeMillis() - task.getTime() > timeout) {
                    System.out.println("Remove " + task.getId());
                    this.queues.removeFirst();
                } else {
                    break;
                }
            } catch (NoSuchElementException e) {
                break;
            }
        }
    }

    //Add task
    public boolean addTask(int ID) {
        checkValid();
        //The request is up to max
        if (nums.get() > maxNum) {
            System.out.println("Failed to add " + ID);
            return false;
        }
        nums.incrementAndGet();
        queues.addLast(new Task(ID, System.currentTimeMillis()));
        System.out.println("Add task " + ID);
        return true;
    }

    //Get task
    public Task getTask() {
        checkValid();

        //If the number of items in the container is less then queue
        if (nums.get() < less) {
            nums.decrementAndGet();
            Task task = queues.pollFirst();
            System.out.println("Get queue " + task.getId());
            return task;
        }
        //Else stack
        else {
            nums.decrementAndGet();
            Task task = queues.pollLast();
            System.out.println("Get stack " + task.getId());
            return task;
        }
    }
}


