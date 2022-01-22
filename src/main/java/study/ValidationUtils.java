package study;

public class ValidationUtils {
    private static final int MIN_NUM = 0;
    private static final int MAX_NUM = 9;

    public static boolean validNo(int num) {
        if(num > MIN_NUM && num <= MAX_NUM) {
            return true;
        }
        return false;
    }
}
