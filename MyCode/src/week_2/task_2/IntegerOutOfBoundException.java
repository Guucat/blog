package week_2.task_2;

/**
 * @author shengyi
 * @create 2021/7/31 - 16:52
 */
public class IntegerOutOfBoundException extends RuntimeException {
    public IntegerOutOfBoundException() {};

    public IntegerOutOfBoundException(String s) {
        super(s);
    };
}
