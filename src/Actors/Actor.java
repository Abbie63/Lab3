package Actors;


import Impl.Actionable;
import Impl.JacketActionable;

public abstract class Actor implements Actionable, JacketActionable {
    String name;
    public Actor(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                '}';
    }
}
