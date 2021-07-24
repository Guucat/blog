package task_1;

import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Pattern;

/**
 * @author shengyi
 * @create 2021/7/23 - 14:01
 * 缺陷: 无法处理括号不完整的情况
 *      无法处理除数为0的情况
 */

public class Calculator {
    // 数字栈
    private Stack<Long> numberStack = null;
    // 操作符栈
    private Stack<Character> operatorStack = null;

    /**
     *
     * @param expression 算数表达式(只能整数计算且输入合法）
     * @return 计算结果
     */
    public long doCalculate(String expression){
        // 去除表达式空格
        expression = removeExpressionSpace(expression);
        // 检查表达式是否合法
        if (!isStandard(expression)){
            System.out.println("错误:表达式不合法");
            return 0;
        }
        // 算数表达式尾部没有‘=’则自动添加，表示结束符
        if (expression.charAt(expression.length()-1) != '='){
            expression += "=";
        }
        // 初始化栈
        numberStack = new Stack<Long>();
        operatorStack = new Stack<Character>();
        // 缓存数字，处理数字是多位的情况
        StringBuffer strBuffer = new StringBuffer();
        // 逐一处理表达式的每个字符
        for (int i = 0; i < expression.length(); i++){
            char ch = expression.charAt(i);
            // 当前字符是数字，压入缓存数字
            if (isNumber(ch)) {
                strBuffer.append(ch);
            // 当前字符非数字
            } else {
                // 将缓存数字-->字符串-->数字，再压入数字栈
                String strNum = strBuffer.toString();
                if (!strNum.isEmpty()) {
                    long num = Integer.parseInt(strNum);
                    numberStack.push(num);
                    // 重置缓存数字
                    strBuffer.delete(0,strBuffer.length());
                }
                // 判断运算符优先级，当前优先级低于栈顶的优先级，则先把计算前面计算出来
                while (!comparePriority(ch) && !operatorStack.isEmpty()){
                    //出栈，后进先出
                    long b = numberStack.pop();
                    long a = numberStack.pop();
                    //根据运算符进行运算
                    switch ((char)operatorStack.pop()) {
                        case '+':
                            numberStack.push(a + b);
                            break;
                        case '-':
                            numberStack.push(a - b);
                            break;
                        case '*':
                            numberStack.push(a * b);
                            break;
                        case '/':
                            numberStack.push(a/b);
                            break;
                        default:
                            break;
                    }
                }
                if (ch != '=') {
                    operatorStack.push(ch);
                    if (ch == ')') {
                        operatorStack.pop();
                        operatorStack.pop();
                    }
                }
            }
        }
        return numberStack.pop();

    }

    /**
     *
     * @param expression 算术表达式
     * @return 没有空格的表达式
     */
    public String removeExpressionSpace(String expression){
        return expression.replace(" ","");
    }

    /**
     *
     * @param expression 算术表达式
     * @return 当表达式合法返回true
     * 即表达式为整数只含有有操作符'+' '-' '*' '/' '='
     * 且'='只能有1个或0个
     */
    public boolean isStandard(String expression){
        // 表达式不能为空
        if (expression.isEmpty() || expression == null){
            return false;
        }
        //通过正则表达式匹配 匹配成功返回true
        String patter = "[0-9\\(\\)\\+\\-\\*\\/]*=?";
        return Pattern.matches(patter,expression);
    }

    /**
     * @return 返回true 当且仅当字符为数字
     */
    public boolean isNumber(char ch){
        return ch >= '0' && ch <= '9';
    }

    /**
     *
     * @param operator 当前操作符
     * @return 比较优先级：如果当前运算符比栈顶元素运算符优先级高则返回true，否则返回false
     *     符号优先级说明（从高到低）:
     *      第1级: (
     *      第2级: * /
     *      第3级: + -
     *      第4级: )
     */
    public  boolean comparePriority(char operator){
        // 空栈返回true
        if (operatorStack.isEmpty()){
            return true;
        }
        // 查看栈顶元素
        char top = operatorStack.peek();
        if (top == '('){
            return true;
        }
        // 比较优先级
        switch (operator) {
            case '(':
                return true;
            case '*':
            case '/':
                return (top == '+' || top == '-');
            case '+':
            case '-':
            case '=':
            case ')':
                return false;
            default:
                break;
        }
        return true;
    }

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