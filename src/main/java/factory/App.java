package factory;

import factory.building.MainWorkshop;
import factory.building.Workshop;
import factory.product.Transport;

public class App {
    public static void main(String[] args) {
        String[] productionQueue = new String[4];
        productionQueue[0] = "common";
        productionQueue[1] = "sport";
        productionQueue[2] = "common";
        productionQueue[3] = "sport";
        Workshop workshop = new MainWorkshop();

        Transport[] transport = workshop.produce(productionQueue);

        for( Transport tr: transport){
            tr.startEngine();
            tr.ride();
            tr.stopEngine();
            System.out.println("The car's engine: " + tr.getEngine());
            tr.setTransmission("Test transmission");
            System.out.println("");
        }

    }
}
