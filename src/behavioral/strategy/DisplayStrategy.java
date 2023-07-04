package behavioral.strategy;

public interface DisplayStrategy {

    void display();
}


class NormalDisplayStrategy implements DisplayStrategy {

    @Override
    public void display() {
        System.out.println("Displaying normally...");
    }
}
