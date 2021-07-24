import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author shengyi
 * @create 2021/7/23 - 15:42
 */
public class RegexMatches {

    public static void main(String args[]) {
        String str = "1+2*2/5+21)=";
        String pattern = "[1-9\\(\\)\\+\\-\\*\\/]*=?";
        
        System.out.println(Pattern.matches(pattern,str));
    }

}
