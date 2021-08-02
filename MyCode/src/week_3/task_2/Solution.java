package week_3.task_2;

/**
 * @author shengyi
 * @create 2021/8/2 - 21:52
 */
public class Solution {
    public char firstUniqChar(String s) {
        Queue<Character> queue = new Queue<>();
        for (int i = 0; i < s.length(); i++) {
            queue.enqueue(s.charAt(i));
        }
        while (!queue.isEmpty()) {
            int n = 0;
            char ch = queue.dequeue();
            for (int i = 0; i < s.length(); i++) {
                if (ch == s.charAt(i)) {
                    n++;
                }
            }
            if (n == 1) {
                return ch;
            }
        }
        return ' ';
    }

    public static void main(String[] args) {
        String s = "bbddbaaccff";
        Solution solution = new Solution();
        char ch = solution.firstUniqChar(s);
        System.out.println(ch);
    }
}
