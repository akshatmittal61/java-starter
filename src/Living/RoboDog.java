package Living;

import utils.Logger;

public class RoboDog extends Robot implements Pet {
    String food;
    public RoboDog(String name, Integer battery, Integer iq, String food) {
        super(name, battery, iq);
        this.food = food;
    }
    public void speak() {
        Logger.info("Woof!" + " " + this.name + " is " + this.battery + "% charged.");
    }
    public void eat() {
        Logger.info(this.name + " is eating " + this.food);
    }
    public void roam() {
        Logger.info(this.name + " is roaming mechanically around.");
    }
}
