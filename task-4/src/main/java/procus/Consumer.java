package procus;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
    private Container container;
    //随机对象
    private static Random r = new Random();

    public Consumer(Container container){
        this.container = container;
    }

    public void run() {
        while(true){
            try {
                //获取数据
                Task task;
                //进行数据处理。休眠0 - 1000毫秒模拟耗时
                Thread.sleep(r.nextInt(1000));
                if ((task = container.getTask()) != null) {
                    System.out.println(Thread.currentThread().getId() + "get task " + task.getId());
                } else {
                    System.out.println(Thread.currentThread().getId() + "failed to get any task");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
