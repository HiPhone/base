package org.hiphone.abstruct.factory;

import org.hiphone.abstruct.product.Animal;
import org.hiphone.abstruct.product.Fruit;
import org.hiphone.abstruct.product.Horse;
import org.hiphone.abstruct.product.Plant;

public class SRFarm implements Farm {

    @Override
    public Animal newAnimal() {
        System.out.println("new horse born");
        return new Horse();
    }

    @Override
    public Plant newPlant() {
        System.out.println("fruit grow");
        return new Fruit();
    }
}
