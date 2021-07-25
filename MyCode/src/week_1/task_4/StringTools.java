package week_1.task_4;

/**
 * @author shengyi
 * @create 2021/7/25 - 19:00
 */

import java.util.Random;

/**
 * 字符串工具类，静态调用
 */
public class StringTools {
    /**
     *
     * @return true 仅当字符串全为数字
     */
    public static boolean isALLNumber(String parameter){
        for (int i = 0; i < parameter.length(); i++) {
            if (parameter.charAt(i) < '0' || parameter.charAt(i) > '0') {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @return true 仅当字符串全为大写字母
     */
    public static boolean isAllUpperLetter(String parameter){
        for (int i = 0; i < parameter.length(); i++) {
            if (parameter.charAt(i) < 'A' || parameter.charAt(i) > 'Z'){
                return false;
            }
        }
        return true;
    }
    /**
     *
     * @return true 仅当字符串全为小写字母
     */
    public static boolean isAllLowerLetter(String parameter){
        for (int i = 0; i < parameter.length(); i++) {
            if (parameter.charAt(i) < 'a' || parameter.charAt(i) > 'z') {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @return  true 仅当字符串全为字母
     */
    private static boolean isAllLetter(String parameter){
        for (int i = 0; i < parameter.length(); i++) {
            if (parameter.charAt(i) < 'A' || parameter.charAt(i) > 'z') {
                return false;
            }
        }
        return true;
    }

    /**
     *
     * @return 字符串，将小写字母转化为大写字母，当且仅当字符串全为字母，否则返回原字符串
     */
    public  static String upperAllLowerLetter(String parameter){
        if (StringTools.isAllLetter(parameter)) {
            for (int i = 0; i < parameter.length(); i++) {
                if (parameter.charAt(i) > 'a' && parameter.charAt(i) < 'z') {
                    //parameter = parameter.replace(parameter.charAt(i),Character.toUpperCase(parameter.charAt(i)));
                    parameter = parameter.replace(parameter.charAt(i), (char)((int)parameter.charAt(i) - 32));
                }
            }
            return parameter;
        }
        return parameter;
    }

    public class QuickSort{
        public static void sort(char[] chars){
            Random random = new Random();
            //消除对输入的依赖
            random.nextInt(chars.length - 1);

        }

        private static void sort(char[] chars, int low, int high){
            if (high <= low) {
                //切分
                int j = partition(chars, low, high);
                // 排序位置‘j’的左半部分
                sort(chars, low, j - 1);
                // 排序位置‘j’的右半部分
                sort(chars, j + 1, high);
            }
        }

        /**
         *
         * @return i 将数组切分为chars[low,i], chars[i], chars[i+1,high]
         */
        private static int partition(char[] chars, int low, int high){
            //左扫描指针
            int i = low;
            //右扫描指针
            int j = high;
            //切分元素
            char ch = chars[low];
            while (true) {
                //左右扫描，检查扫描是否结束并交换元素

            }

        }
    }

    public static String sortNumberByAsc(String parameter){
        if (StringTools.isAllLetter(parameter)){

        }
        return null;
    }
}
