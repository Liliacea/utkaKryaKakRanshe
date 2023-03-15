import behavior.IFly;
import behavior.IManMade;
import behavior.IQuack;
import typeOfDuck.Duck;
import typeOfDuck.MallardDuck;
import typeOfDuck.RubberDuck;

import java.util.ArrayList;

public class DuckSim {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck("кряква");
        Duck rubberDuck = new RubberDuck("резиновая утка");

        ArrayList<Duck> ducks = new ArrayList<>();
        ducks.add(mallardDuck);
        ducks.add(rubberDuck);
        for (Duck duck:ducks) {
            System.out.println(duck.getName());
            if (duck instanceof IFly) {
                ((IFly) duck).fly();
            }
            if (duck instanceof IQuack) {
                ((IQuack) duck).quack();
            }
            if (duck instanceof IManMade) {
                ((IManMade) duck).notAlive();
            }

        }
    }
}
