package week_2.task_5;

import com.sun.source.tree.NewArrayTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author shengyi
 * @create 2021/7/31 - 14:22
 */
public class Solution {
    public ArrayList<String> doSolute(String s1, String s2) {
        String[] args1 = s1.split(" ");
        String[] args2 = s2.split(" ");
        ArrayList<String> result = new ArrayList<>();
        ArrayList<String> r = new ArrayList<>();
        for (int i = 0; i < args1.length; i++) {
            boolean flag = true;
            for (int j = 0; j < args2.length; j++) {
                if (args1[i].equals(args2[j])) flag = false;
            }
            if (flag) result.add(args1[i]);
        }
        for (int i = 0; i < args2.length; i++) {
            boolean flag = true;
            for (int j = 0; j < args1.length; j++) {
                if (args2[i].equals(args1[j])) flag = false;
            }
            if (flag) result.add(args2[i]);
        }
        for (int i = 0; i < result.size(); i++) {
            boolean flag = true;
            for (int j = 0; j < result.size(); j++) {
                if (result.get(i).equals(result.get(j)) && i != j) {
                    flag = false;
                    break;
                }
            }
            if (flag) r.add(result.get(i));
        }
        return r;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s1 = "mqk g g";
        String s2 = "uuz rk uuz";
        ArrayList<String> arrayList = solution.doSolute(s1, s2);
        System.out.println(arrayList);
        //ArrayList<String> 转 String[]
        //String[] s =  arrayList.toArray(new String[0]);
        //System.out.println(Arrays.toString(s));
    }
}
