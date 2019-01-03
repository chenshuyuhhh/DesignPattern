package FactoryMethod;

import FactoryMethod.framework.Factory;
import FactoryMethod.framework.Product;
import FactoryMethod.idcard.IDCard;
import FactoryMethod.idcard.IDCardFactory;

import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("11");
        Product card2 = factory.create("22");
        Product card3 = factory.create("33");
        card1.use();
        card2.use();
        card3.use();
        Map<Product,Integer> map = ((IDCardFactory) factory).getTable();
        for (Map.Entry<Product, Integer> entry : map.entrySet()) {
            System.out.println("The owner is " + ((IDCard)entry.getKey()).getOwner() + " and the number is " + entry.getValue());
        }
    }
}
