package behavioral.strategy;

abstract public class Duck {

    abstract public void display();

    abstract public void fly();

    abstract public void quack();

    abstract public void eat();
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

    @Override
    public void eat() {
        System.out.println("WildDuck eating");
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

    @Override
    public void eat() {
        System.out.println("CityDuck eating");
    }
}

class RubberDuck extends Duck {

    @Override
    public void display() {
        System.out.println("Displaying RubberDuck");
    }

    @Override
    public void fly() {
        // No fly behavior for Rubber Duck
    }

    @Override
    public void quack() {
        System.out.println("RubberDuck quacking");
    }

    @Override
    public void eat() {
        // No eat behavior for Rubber Duck
    }
}
