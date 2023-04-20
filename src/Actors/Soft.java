package Actors;
import Enum.Location;
public class Soft extends Actor {
    public Soft(String name) {
        super(name);
    }

    @Override
    public void action() {
        System.out.println(name + " кружит по " + Location.CITY);
    }

    @Override
    public void jacket() {
        System.out.println(name + " идет в тужурке");
    }
    public void moving() {
        System.out.println(name + " прятался за " + Location.HOUSE_ANGLE);
    }
}
