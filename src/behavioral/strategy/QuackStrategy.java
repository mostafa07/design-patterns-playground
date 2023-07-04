package behavioral.strategy;

public interface QuackStrategy {

    void quack();
}


class LoudQuackStrategy implements QuackStrategy {

    @Override
    public void quack() {
        System.out.println("QUAAAACKing...");
    }
}

class LowQuackStrategy implements QuackStrategy {

    @Override
    public void quack() {
        System.out.println("Quacking...");
    }
}

class NoQuackStrategy implements QuackStrategy {

    @Override
    public void quack() {
        System.out.println("Can NOT quack... :(");
    }
}
