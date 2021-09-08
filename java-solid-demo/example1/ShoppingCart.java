package example1;

import java.util.List;

import example2.EUTaxCalculator;
import example2.USTaxCalculator;

public class ShoppingCart {
    private List<Product> contents;
    private TaxCalculator taxCalculator = new TaxCalculator();
    private EUTaxCalculator euTaxCalculator = new EUTaxCalculator();
    private USTaxCalculator usTaxCalculator = new USTaxCalculator();

    public ShoppingCart() {
    }

    public void setContents(List<Product> _contents) {
        this.contents = _contents;
    }

    public double computeTotalPrice() {
    double total = 0.0;

    for (int i = 0; i < contents.size(); i++)
    total += contents.get(i).getPrice();

    return taxCalculator.getPriceEUTax(total);
    }

    public double computeTotalEUPrice() {
        double total = 0.0;

        for (int i = 0; i < contents.size(); i++)
            total += contents.get(i).getPrice();

        return euTaxCalculator.getPriceAfterTax(total);
    }

    public double computeTotalUSPrice() {
        double total = 0.0;

        for (int i = 0; i < contents.size(); i++)
            total += contents.get(i).getPrice();

        return usTaxCalculator.getPriceAfterTax(total);
    }

}