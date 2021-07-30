package week_1.task_4;

import java.util.Arrays;

/**
 * @author shengyi
 * @create 2021/7/25 - 20:34
 */
public class TestCode {
    public static void main(String[] args) {
        String example = "acbdw,1269547,AASIDX,AIUydjs,12sjaA,3819247,ausSHSzio,IUFISsi";
        String[] array = example.split(",");
        System.out.println("分割后的数组:");
        System.out.println(Arrays.toString(array));
        System.out.println("方法1------------------------------------------------------------------");
        System.out.println("以下字符串全是字母:");
        for (String s : array) {
            if (StringTools.isAllLetter(s)) {
                System.out.println(s);
            }
        }
        System.out.println("方法2------------------------------------------------------------------");
        System.out.println("以下字符串全是大写字母:");
        for (String s : array) {
            if (StringTools.isAllUpperLetter(s)) {
                System.out.println(s);
            }
        }
        System.out.println("方法3------------------------------------------------------------------");
        System.out.println("以下字符串全是小写字母:");
        for (String s : array) {
            if (StringTools.isAllLowerLetter(s)) {
                System.out.println(s);
            }
        }
        System.out.println("方法4------------------------------------------------------------------");
        System.out.println("如果字符串全是字母，将其中所有小写字母转换为大写字母:");
        for (String s : array) {
            if (StringTools.isAllLetter(s)) {
                System.out.print(s + "  --->  ");
                System.out.println(StringTools.upperAllLowerLetter(s));
            }
        }
        System.out.println("方法5------------------------------------------------------------------");
        System.out.println("如果字符串全是数字组成，则按照数字大小升序排序并装入整型数组中。最后按升序打印出该数组:");
        for (String s : array) {
            System.out.println(StringTools.sortNumberByAsc(s));
        }
        System.out.println("方法6------------------------------------------------------------------");
        System.out.println("如果字符串全是字母组成，则按照字母排序装入字符数组中，并按字母顺序打印出该该数组:");
        for (String s : array) {
            System.out.println(StringTools.sortCharByAsc(s));
        }
    }
}

