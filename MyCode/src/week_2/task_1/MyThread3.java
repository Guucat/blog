package week_2.task_1;

import java.util.concurrent.Callable;

/**
 * @author shengyi
 * @create 2021/7/31 - 14:37
 */
public class MyThread3 implements Callable<String> {

    @Override
    public String call() throws Exception {
        for (int i = 1; i < 121; i++) {
            System.out.println("thread_3 ---->" + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return "thread3 had been done";
    }
}
