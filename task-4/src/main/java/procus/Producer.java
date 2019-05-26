package procus;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class Producer implements Runnable{
    //Cache
    private Container container;
    //多线程间是否启动变量，有强制从主内存中刷新的功能。即时返回线程的状态
    private volatile boolean isRunning = true;
    //id生成器
    private static AtomicInteger count = new AtomicInteger();
    //随机对象
    private static Random r = new Random();

    public Producer(Container container){
        this.container = container;
    }

    public void run() {
        while(isRunning){
            try {
                //随机休眠0 - 1000 毫秒 表示获取数据(产生数据的耗时)
                Thread.sleep(r.nextInt(1000));
                //获取的数据进行累计
                int id = count.incrementAndGet();
                if (container.addTask(id)) {
                    System.out.println("Thread " + Thread.currentThread().getId() + " adding task " + id);
                }
                else{
                    stop();
                }
            } catch (Exception e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void stop(){
        this.isRunning = false;
    }
}
