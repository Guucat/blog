package week_1.task_1;

import java.util.Scanner;

/**
 * @author shengyi
 * @create 2021/7/24 - 16:04
 */
public class TestCode {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("请输入一个算术表达式，例：1+2*(3+4)\n输入T退出");
            String expression = scan.nextLine();
            if (expression.equals("T")) {
                break;
            }
            System.out.println(calculator.doCalculate(expression));
        }
        System.out.println("已退出，欢迎使用！");
    }
}
