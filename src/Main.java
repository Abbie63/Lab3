import Actors.Donut;
import Actors.Soft;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
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