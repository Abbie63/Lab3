import Actors.Donut;
import Actors.Soft;

public class Main {
    public static void main(String[] args) {
       Donut donut = new Donut("Пончик");
       Soft soft = new Soft("Мякиш");

       donut.action();
       donut.talk();
       donut.jacket();
       donut.arrive();
       soft.jacket();
       donut.crowdFinding();
       soft.action();
       soft.moving();

        }
}