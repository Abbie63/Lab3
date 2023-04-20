package Actors;
import Enum.Location;
public class Donut extends Actor {
    public Donut(String name) {
        super(name);
    }


    @Override
    public void action() {
        System.out.println(name + " сказал что все хорошо");

    }

    @Override
    public void jacket() {
        System.out.println(name + " решает идти за тужуркой");
    }
    public void arrive() {
        System.out.println(name + " прибыл в " + Location.CITY + " и вылез из " + Location.CARRIAGE);
    }
    public void crowdFinding() {
        System.out.println(name + " был внимателен в " + Location.CROWD);
    }
}
