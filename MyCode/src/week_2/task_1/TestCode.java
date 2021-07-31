package week_2.task_1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author shengyi
 * @create 2021/7/31 - 14:49
 */
public class TestCode {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        myThread1.start();

        //MyThread2 runnable = new MyThread2();
        //Thread myThread2 = new Thread(runnable));
        Thread myThread2 = new Thread(() -> {
            for (int i = 1; i < 121; i++) {
                System.out.println("thread_2 ---->" + i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        myThread2.start();

        ExecutorService executorService = Executors.newCachedThreadPool();
        MyThread3 myThread3 = new MyThread3();
        Future<String> result = executorService.submit(myThread3);
        try {
            System.out.println(result.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
