import Actors.Donut;
import Actors.Soft;

public class Main {
    public static void main(String[] args) {
       Donut donut = new Donut("Ponchik");
       Soft soft = new Soft("M9kish");

       donut.action();
       donut.jacket();
       donut.arrive();
       soft.jacket();
       donut.crowdFinding();
       soft.action();
       soft.moving();

        }
}