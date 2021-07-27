import java.util.ArrayList;
import java.util.List;

import example1.Product;
import example1.ShoppingCart;
import example2.BetterShoppingCart;
import example2.EUTaxCalculator;
import example3.BearCarer;
import example3.CrazyPerson;

public class App {
    public static List<Product> products = new ArrayList<>();
    public static ShoppingCart shoppingCart = new ShoppingCart();
    
    public static void singleResponsabilityPrinciple() {
        products.add(new Product(12.9));
        products.add(new Product(5.6));

        shoppingCart.setContents(products);

        shoppingCart.computeTotalPrice();
    }

    public static void liskovSubstitution() {
        shoppingCart.computeTotalEUPrice();
        shoppingCart.computeTotalUSPrice();
    }

    public static void interfaceSegregation() {
        BearCarer bearCarer = new BearCarer();
        bearCarer.feedTheBear();
        bearCarer.washTheBear();

        CrazyPerson crazyPerson = new CrazyPerson();
        crazyPerson.petTheBear();
    }

    public static void dependencyInversion() {
        EUTaxCalculator taxCalculator = new EUTaxCalculator();
        BetterShoppingCart betterShoppingCart = new BetterShoppingCart(products, taxCalculator);

        betterShoppingCart.computeTotalPrice();
    }

    public static void main(String[] args) throws Exception {
        System.out.println("\nExample of Single Responsability Principle \n");
        singleResponsabilityPrinciple();
        System.out.println("\n ********************************************************* \n");

        System.out.println("Example of Liskov Substitution \n");
        liskovSubstitution();
        System.out.println("\n ********************************************************* \n");

        System.out.println("Example of Interface Segregation \n");
        interfaceSegregation();
        System.out.println("\n ********************************************************* \n");

        System.out.println("Example of Dependency Inversion \n");
        dependencyInversion();
        System.out.println("\n ********************************************************* \n");
    }
}
