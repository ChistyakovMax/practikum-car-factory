package factory.building;

import factory.product.CommonCar;
import factory.product.Sportcar;
import factory.product.Transport;

import java.util.Objects;

public class MainWorkshop implements Workshop{
    @Override
    public Transport[] produce(String[] productionQueue) {
        Transport[] products = new Transport[productionQueue.length];
        for (int i = 0; i < productionQueue.length; i++){
            if(productionQueue[i] == "common"){
                products[i] = new CommonCar();
            } else if (Objects.equals(productionQueue[i], "sport")){
                products[i] = new Sportcar();
            }
        }
        return products;
    }
}
