package typeOfDuck;

import behavior.IManMade;
import typeOfDuck.Duck;

public class RubberDuck extends Duck implements IManMade {

    public RubberDuck(String name){
        super(name);
    }
    @Override
    public void notAlive() {
        System.out.println("не крякает и не летает. вообще не живая");
    }

}
