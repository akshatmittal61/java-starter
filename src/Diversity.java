import Living.Dog;
import Living.Dragon;
import Living.Human;
import Living.RoboDog;
import utils.Logger;

public class Diversity {
    public static void main(String[] args) {
        Human haymitch = new Human("Haymitch", 25, 200);
        haymitch.speak();
        Human katniss = new Human("Katniss", 20, 35);
        katniss.speak();
        Dog fido = new Dog("Fido", 5);
        fido.speak();
        fido.sleep();
        Dragon draco = new Dragon("Draco", 10);
        draco.speak();
        draco.fly();
        String message = "Itosfq ht idsd";
        Logger.info("Haymitch says", haymitch.decode(message));
        Logger.info("Katniss says", katniss.decode(message));
        RoboDog carina = new RoboDog("Carina", 54, 100, "Carbon-dated nickel bits");
        carina.speak();
        Logger.info("Carina says", carina.parse(message));
        carina.roam();
    }
}
