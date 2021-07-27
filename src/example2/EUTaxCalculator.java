package example2;

import java.text.DecimalFormat;

public class EUTaxCalculator implements I_TaxCalculator {
    private double govTax = 8.7;

    public EUTaxCalculator() {
    }

    public double getPriceAfterTax(double price) {
        System.out.println("Price before EU tax: " + price);

        price = ((this.govTax) / 100.0) * price + price;
        price = Double.parseDouble(new DecimalFormat("##.##").format(price)); // nice formatting for double value
        System.out.println("Price after EU tax: " + price);

        return price;
    }
}
