package Dz.Shop;

import java.util.Comparator;

public class ListIdComparator implements Comparator<Product> {
    @Override
    public int compare(Product prod1, Product prod2) {
        return Integer.compare(prod1.getId(), prod2.getId());
    }
}
