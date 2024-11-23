import utils.Logger;

public class LearningMath {
    public static void main(String[] args) {
        Logger.info(Math.PI);
        Logger.info(Math.E);
        Logger.info(Math.max(1, 2));
        Logger.info(Math.min(1, 2));
        Logger.info(Math.abs(-5));
        Logger.info(Math.sqrt(25));
        Logger.info(Math.pow(2, 3));
        Logger.info(Math.round(2.5));
        int x = 5;
        float y = 2.5f;
        Logger.debug(x + y);
    }
}
