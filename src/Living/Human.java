package Living;

import utils.Logger;

public class Human extends LivingBeing {
    Intelligence intelligence;
    public Human(String name, Integer age, Integer iq) {
        super(name, age);
        this.intelligence = new Intelligence(iq);
    }
    public void speak() {
        Logger.info("Hey I'm " + this.name + " and I'm " + this.age + " years old.");
    }
    public String decode(String message) {
        return this.intelligence.parse(message);
    }
}
