package factory.building;

import factory.product.Transport;

public interface Workshop {

    Transport[] produce(String[] productionQueue);
}
