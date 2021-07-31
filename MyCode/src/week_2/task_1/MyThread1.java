package week_2.task_1;

/**
 * @author shengyi
 * @create 2021/7/31 - 14:37
 */
public class MyThread1 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i < 121; i++) {
            System.out.println("thread_1 ---->" + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
