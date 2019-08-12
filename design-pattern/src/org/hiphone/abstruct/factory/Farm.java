package org.hiphone.abstruct.factory;

import org.hiphone.abstruct.product.Animal;
import org.hiphone.abstruct.product.Plant;

public interface Farm {

    Animal newAnimal();

    Plant newPlant();
}
