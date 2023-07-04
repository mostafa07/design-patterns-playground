package behavioral.strategy;

public interface FlyStrategy {

    void fly();
}


class FlyWithWingsStrategy implements FlyStrategy {

    @Override
    public void fly() {
        System.out.println("Flying with wings...");
    }
}

class FlyWithJetEngineStrategy implements FlyStrategy {

    @Override
    public void fly() {
        System.out.println("Flying with jet engine vooooo...");
    }
}

class NoFlyStrategy implements FlyStrategy {

    @Override
    public void fly() {
        System.out.println("Can NOT fly... :(");
    }
}