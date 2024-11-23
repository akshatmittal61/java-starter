package Living;

public abstract class LivingBeing {
    String name;
    Integer age;

    public LivingBeing(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }
    public abstract void speak();
}
