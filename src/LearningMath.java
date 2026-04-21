import java.util.ArrayList;
import utils.Logger;

public class LearningMath {
    private static int count(int a) {
        double b = Math.sqrt(a - 0.5);
        Logger.info(a + " is " + b);
        return (int) Math.floor(b);
    }
    public static void main(String[] args) {
//        Logger.info(Math.PI);
//        Logger.info(Math.E);
//        Logger.info(Math.max(1, 2));
//        Logger.info(Math.min(1, 2));
//        Logger.info(Math.abs(-5));
        Logger.info(Math.sqrt(729));
//        Logger.info(Math.pow(2, 3));
//        Logger.info(Math.round(2.5));
//        int x = 5;
//        float y = 2.5f;
//        Logger.debug(x + y);

//        Logger.debug(14 % 3);
        if (n == 1) {
            System.out.println(1);
            return;
        }
        if (isPrime(n)) {
            System.out.println(1);
            System.out.println(" ");
            System.out.println(n);
            return;
        }
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 2; i <= Math.sqrt(n); ++i) {
            if (n % i == 0) {
                a.add(i);
                if (i != Math.sqrt(n)) {
                    b.add(i);
                }
            }
        }
        int an = a.size(), bn = b.size();
        for (Integer integer : a) {
            System.out.print(integer);
            System.out.println(" ");
        }
        for (int i = bn - 1; i >= 0; --i) {
            System.out.println(a.get(i));
            System.out.println(" ");
        }
    }
}
