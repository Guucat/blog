package week_1.task_3;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

/**
 * @author shengyi
 * @create 2021/7/31 - 21:55
 */
public class MyClock {
    public void setTimeByHand(int year, int month, int day) {
        while (true) {
            LocalDate localDate = LocalDate.of(year, month, day);
            System.out.println(localDate);
        }
    }
    public  void setTimeAutomatically() {
        while (true) {
            LocalDate localDate = LocalDate.now();
            System.out.println(localDate);
        }

    }
}
