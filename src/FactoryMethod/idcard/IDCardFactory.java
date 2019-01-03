package FactoryMethod.idcard;

import FactoryMethod.framework.Factory;
import FactoryMethod.framework.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IDCardFactory extends Factory {
    private List<String> owners = new ArrayList();
    private Map<Product,Integer> table = new HashMap<>();
    private int number = 2000;

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
        table.put(product,number++);
    }

    public List<String> getOwners() {
        return owners;
    }

    public Map<Product,Integer> getTable(){
        return table;
    }
}
