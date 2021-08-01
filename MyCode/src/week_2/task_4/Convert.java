package week_2.task_4;

import java.util.Arrays;

/**
 * @author shengyi
 * @create 2021/8/1 - 15:17
 */
public class Convert {
    public static String DecimalToBinary(int num) {
        Stack stack = new Stack();
        while (num != 0) {
            stack.push(num % 2);
            num = num / 2;
        }
        StringBuilder s = new StringBuilder();
        while (!stack.isEmpty()) {
            s.append(stack.pop());
        }
        return s.toString().toString();
    }

    public static String DecimalToOctal(int num) {
        Stack stack = new Stack();
        while (num != 0) {
            stack.push(num % 8);
            num = num / 8;
        }
        StringBuilder s = new StringBuilder();
        while (!stack.isEmpty()) {
            s.append(stack.pop());
        }
        return s.toString();
    }

    public static String DecimalToHexadecimal(int num) {
        Stack stack = new Stack();
        while (num != 0) {
            stack.push(num % 16);
            num = num / 16;
        }
        StringBuilder s = new StringBuilder();
        while (!stack.isEmpty()) {
            int i = stack.pop();
            switch (i) {
                case 10 -> s.append('A');
                case 11 -> s.append('B');
                case 12 -> s.append('C');
                case 13 -> s.append('D');
                case 14 -> s.append('E');
                case 15 -> s.append('F');
                default -> s.append(i);
            }
        }
        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(Convert.DecimalToBinary(9999));
        System.out.println(Convert.DecimalToOctal(9999));
        System.out.println(Convert.DecimalToHexadecimal(9999));

        //System.out.println(Integer.parseInt(Character.toString('4')));
    }
}
