package Actors;
import Enum.Location;
public class Donut extends Actor {
    public Donut(String name) {
        super(name);
    }


    @Override
    public void action() {
        System.out.println("\"Вот и хорошо!\" сказал " + name);

    }

    public void talk() {
        System.out.println("\"Увяжусь за этой желтой тужуркой и тоже попаду, куда мне надо. Все очень просто устроилось\" сказал " + name);
    }

    @Override
    public void jacket() {
        System.out.println(name + " решает идти за тужуркой");
    }
    public void arrive() {
        System.out.println(name + " прибыл в " + Location.CITY + " покинув " + Location.CARRIAGE);
    }
    public void crowdFinding() {
        System.out.println(name + " был внимателен в " + Location.CROWD);
    }
}
