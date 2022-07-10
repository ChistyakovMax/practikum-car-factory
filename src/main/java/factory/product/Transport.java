package factory.product;

public abstract class Transport implements Vehicle {
    private final int wheelsCount;
    protected final String type;

    protected String engine;
    protected String transmission;

    public Transport(int wheelsCount, String type, String engine, String transmission){
        this.wheelsCount = wheelsCount;
        this.type = type;
        this.engine = engine;
        this.transmission = transmission;
    }

    public String getEngine(){
        return this.engine;
    }

    public void setTransmission(String transmission){

        this.transmission = transmission;
        System.out.println("Transmission \"" + transmission + "\" has been planted");
    }
}
