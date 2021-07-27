package example1;

import java.text.DecimalFormat;

public class TaxCalculator {
    // very fictional taxes
    private double euTax = 10;
    private double usTax = 10.5;
    private double asiaTax = 9.7;

    public TaxCalculator() {
    }

    public double getPriceEUTax(double price) {
        System.out.println("Price before tax: " + price);

        price = (this.euTax / 100.0) * price + price;
        System.out.println("Price after tax: " + price);

        return Double.parseDouble(new DecimalFormat("##.##").format(price));
    }

    public double getPriceUSTax(double price) {
        System.out.println("Price before tax: " + price);

        price = (this.usTax / 100.0) * price + price;
        System.out.println("Price after tax: " + price);

        return Double.parseDouble(new DecimalFormat("##.##").format(price));
    }

    public double getPriceAsiaTax(double price) {
        System.out.println("Price before tax: " + price);

        price = (this.asiaTax / 100.0) * price + price;
        System.out.println("Price after tax: " + price);

        return Double.parseDouble(new DecimalFormat("##.##").format(price));
    }
}
