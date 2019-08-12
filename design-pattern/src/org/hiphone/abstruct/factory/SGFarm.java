package org.hiphone.abstruct.factory;

import org.hiphone.abstruct.product.Animal;
import org.hiphone.abstruct.product.Cattle;
import org.hiphone.abstruct.product.Plant;
import org.hiphone.abstruct.product.Vegetables;

public class SGFarm implements Farm {

    public Animal newAnimal() {
        System.out.println("new cattle born!");
        return new Cattle();
    }

    public Plant newPlant() {
        System.out.println("new vegetable!");
        return new Vegetables();
    }
}
