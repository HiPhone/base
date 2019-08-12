package org.hiphone.abstruct;

import org.hiphone.abstruct.factory.Farm;
import org.hiphone.abstruct.factory.SGFarm;
import org.hiphone.abstruct.product.Animal;
import org.hiphone.abstruct.product.Plant;

public class AbstractFactoryTest {

    public static void main(String[] args) {
        Farm farm;
        Animal a;
        Plant p;
        farm = new SGFarm();
        a  = farm.newAnimal();
        p = farm.newPlant();
        a.show();
        p.show();
    }
}
