package factory.product;

public class Sportcar extends Transport {

    public Sportcar() {
        super(4,"sport", "v-engine", "6st");
    }

    @Override
    public void startEngine() {
        System.out.println("Sportcar engine STARTED!");
    }

    @Override
    public void stopEngine() {
        System.out.println("Sportcar engine STOPPED!");
    }

    @Override
    public void ride() {
        System.out.println("Let's ride on Super Sportcar!!!");
    }
}
