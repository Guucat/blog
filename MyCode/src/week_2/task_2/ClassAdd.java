package week_2.task_2;

/**
 * @author shengyi
 * @create 2021/7/31 - 17:44
 */
public class ClassAdd {
    public void add() {
        int i = 2147483640;
        while (true) {
            if (i == 2147483647) throw new IntegerOutOfBoundException("Integer can not > 2147483647");
            System.out.println(i++);
        }
    }

    public static void main(String[] args) {
        ClassAdd classAdd = new ClassAdd();
        try {
            classAdd.add();
        } catch (IntegerOutOfBoundException e) {
            e.printStackTrace();
        }
//        Thread thread = new Thread(() -> {
//            int i = 2147483640;
//            while (true) {
//
//                System.out.println(++i);
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        });
//           thread.start();
    }
}

