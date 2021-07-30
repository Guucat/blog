package week_2.task_1;

/**
 * @author shengyi
 * @create 2021/7/30 - 14:18
 */
public class VolatileTest {
    public static void main(String[] args) {
        DataHolder dataHolder = new DataHolder();
        Thread thread1 = new Thread(() -> {
            while (true) {
                dataHolder.add();
            }
        });
        Thread thread2 = new Thread(() -> {
            while (true) {
                dataHolder.check();
            }
        });
        thread1.start();
        thread2.start();
    }
}
