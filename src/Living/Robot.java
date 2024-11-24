package Living;

public abstract class Robot extends Intelligence {
    Integer battery;
    String name;
    public Robot(String name, Integer battery, Integer iq) {
        super(iq);
        this.name = name;
        this.battery = battery;
    }
    public void charge() {
        this.battery = 100;
    }
    public void discharge() {
        this.battery = 0;
    }
}
