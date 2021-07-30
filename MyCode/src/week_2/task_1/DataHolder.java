package week_2.task_1;

/**
 * @author shengyi
 * @create 2021/7/30 - 14:10
 */
public class DataHolder {
    int b,c,d,f,e;
    long count =0;
    volatile int a;
    public void add() {
        a+=1;
        b+=1;
        c+=1;
        d+=1;
        e+=1;
        f+=1;
    }

    public void check(){
        if (f > a) {
            System.out.println("Got it  " + ++count );
        }
    }
}
