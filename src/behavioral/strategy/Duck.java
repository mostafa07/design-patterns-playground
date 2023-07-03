package behavioral.strategy;

abstract public class Duck {

    abstract public void display();

    abstract public void fly();

    abstract public void quack();
}

class WildDuck extends Duck {

    @Override
    public void display() {
        System.out.println("Displaying WildDuck");
    }

    @Override
    public void fly() {
        System.out.println("WildDuck flying");
    }

    @Override
    public void quack() {
        System.out.println("WildDuck quacking");
    }
}

class CityDuck extends Duck {

    @Override
    public void display() {
        System.out.println("Displaying CityDuck");
    }

    @Override
    public void fly() {
        System.out.println("CityDuck flying");
    }

    @Override
    public void quack() {
        System.out.println("CityDuck quacking");
    }
}
