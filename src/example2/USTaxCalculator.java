package example2;

import java.text.DecimalFormat;

public class USTaxCalculator implements I_TaxCalculator {
    private double govTax = 10;
    private double otherTax = 5.7;

    public USTaxCalculator() {
    }

    public double getPriceAfterTax(double price) {
        System.out.println("Price before US tax: " + price);

        price = ((this.govTax + this.otherTax) / 100.0) * price + price;
        price = Double.parseDouble(new DecimalFormat("##.##").format(price)); // nice formatting for double value
        System.out.println("Price after US tax: " + price);

        return price;
    }
}
