package behavioral.strategy;

abstract public class Duck {

    private final DisplayStrategy displayStrategy;
    private final FlyStrategy flyStrategy;
    private final QuackStrategy quackStrategy;

    public Duck(DisplayStrategy displayStrategy, FlyStrategy flyStrategy, QuackStrategy quackStrategy) {
        this.displayStrategy = displayStrategy;
        this.flyStrategy = flyStrategy;
        this.quackStrategy = quackStrategy;
    }


    public void display() {
        this.displayStrategy.display();
    }

    public void fly() {
        this.flyStrategy.fly();
    }

    public void quack() {
        this.quackStrategy.quack();
    }
}

class WildDuck extends Duck {

    public WildDuck() {
        super(new NormalDisplayStrategy(),
                new FlyWithWingsStrategy(),
                new LoudQuackStrategy());
    }
}

class CityDuck extends Duck {

    public CityDuck() {
        super(new NormalDisplayStrategy(),
                new FlyWithWingsStrategy(),
                new LowQuackStrategy());
    }
}

class RubberDuck extends Duck {

    public RubberDuck() {
        super(new NormalDisplayStrategy(),
                new NoFlyStrategy(),
                new NoQuackStrategy());
    }
}

class SuperHeroDuck extends Duck {

    public SuperHeroDuck() {
        super(new NormalDisplayStrategy(),
                new FlyWithJetEngineStrategy(),
                new LoudQuackStrategy());
    }
}