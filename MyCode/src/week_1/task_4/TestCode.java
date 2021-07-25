package week_1.task_4;

import java.util.Arrays;

/**
 * @author shengyi
 * @create 2021/7/25 - 20:34
 */
public class TestCode {
    public void change(int[] is){
        int i = is[0];
        is[0] = is[1];
        is[1] = i;
    }

    public static void main(String[] args) {
//        String example = "acbdw,1269547,AASIDX,AIUydjs,12sjaA,3819247,ausSHSzio,IUFISsi";
//        String[] exampleArray = example.split(",");
//        for (String s : exampleArray) {
//
//            System.out.println(s);
//        }
        TestCode testCode = new TestCode();
        int[] a = new int[] {1,2};
        testCode.change(a);
        for (int i :
                a) {
            System.out.println(i);
        }
    }
}
