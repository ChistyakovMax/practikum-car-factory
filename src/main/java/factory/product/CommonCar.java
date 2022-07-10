package factory.product;

public class CommonCar extends Transport{

    public CommonCar() {
        super(5, "common","linear", "5st");
    }

    @Override
    public void startEngine() {
        System.out.println("Common car engine started...wow");
    }

    @Override
    public void stopEngine() {
        System.out.println("Common car engine stopped");
    }

    @Override
    public void ride() {
        System.out.println("Let's take a normal speed ride");
    }
}
