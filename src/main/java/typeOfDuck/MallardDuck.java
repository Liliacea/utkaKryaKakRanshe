package typeOfDuck;

import behavior.IFly;
import behavior.IQuack;

public class MallardDuck extends Duck implements IFly, IQuack {
    public MallardDuck(String name){
        super(name);
    }
    @Override
    public void fly() {
        System.out.println("летает");

    }

    @Override
    public void quack() {
        System.out.println("крякает");
    }


}
