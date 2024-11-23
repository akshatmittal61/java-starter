package Living;

import utils.Logger;

public class Dog extends LivingBeing {
    public Dog(String name, Integer age) {
        super(name, age);
    }
    public void speak() {
        Logger.info("Woof!" + " " + getName() + " is " + getAge() + " years old.");
    }
    public void sleep() {
        Logger.warn(getName() + " is sleeping.");
    }
}
