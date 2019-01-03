package FactoryMethod.idcard;

import FactoryMethod.framework.Product;

public class IDCard extends Product {
    private String owner;

    IDCard(String owner) {
        System.out.println("Creat the owner " + owner + "'s card");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("Use the owner " + owner + "'s card");
    }

    public String getOwner() {
        return owner;
    }
}
