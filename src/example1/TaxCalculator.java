package example1;

import java.text.DecimalFormat;

public class TaxCalculator {
    // very fictional taxes
    private double eu_tax = 10;
    private double us_tax = 10.5;
    private double asia_tax = 9.7;

    public TaxCalculator() {
    }

    public double getPriceEUTax(double price) {
        System.out.println("Price before tax: " + price);

        price = (this.eu_tax / 100.0) * price + price;
        System.out.println("Price after tax: " + price);

        return Double.parseDouble(new DecimalFormat("##.##").format(price));
    }

    public double getPriceUSTax(double price) {
        System.out.println("Price before tax: " + price);

        price = (this.us_tax / 100.0) * price + price;
        System.out.println("Price after tax: " + price);

        return Double.parseDouble(new DecimalFormat("##.##").format(price));
    }

    public double getPriceAsiaTax(double price) {
        System.out.println("Price before tax: " + price);

        price = (this.asia_tax / 100.0) * price + price;
        System.out.println("Price after tax: " + price);

        return Double.parseDouble(new DecimalFormat("##.##").format(price));
    }
}
