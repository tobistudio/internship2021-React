package example2;

import java.util.List;

import example1.Product;

public class BetterShoppingCart {
    private List<Product> contents;
    private I_TaxCalculator taxCalculator;

    public BetterShoppingCart(List<Product> _contents, I_TaxCalculator _taxCalculator) {
        this.contents = _contents;
        this.taxCalculator = _taxCalculator;
    }

    public double computeTotalPrice() {
        double total = 0.0;

        for (int i = 0; i < contents.size(); i++)
            total += contents.get(i).getPrice();

        return taxCalculator.getPriceAfterTax(total);
    }
}