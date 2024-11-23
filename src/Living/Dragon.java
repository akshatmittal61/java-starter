package Living;

import utils.Logger;

public class Dragon extends LivingBeing{
    public Dragon(String name, Integer age) {
        super(name, age);
    }
    public void speak() {
        Logger.info("Roar! I would've told you a lot, but I'm too busy breathing fire.");
    }
    public void fly() {
        Logger.info("I'm flying!");
    }
}
