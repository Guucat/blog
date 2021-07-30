package week_2.task_1;

/**
 * @author shengyi
 * @create 2021/7/29 - 13:54
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Runnable r1 = () -> {
            String text = "123456789";
            for (char ch :
                    text.toCharArray()) {
                System.out.println(ch);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Runnable r2 = () -> {
            String text = "abcdefghi";
            for (char ch :
                    text.toCharArray()) {
                System.out.println(ch);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        Thread thread1 = new Thread(r1);

        Thread thread2 = new Thread(r2);
        System.out.println(thread1.getName());
        thread1.start();

        thread2.start();

    }
}
