import java.util.ArrayList;
import java.util.List;

import example1.Product;
import example1.ShoppingCart;
import example3.BearCarer;
import example3.CrazyPerson;

public class App {
    public static void main(String[] args) throws Exception {
        //Single responsability principle
        List<Product> list_of_products = new ArrayList<>();
        list_of_products.add(new Product(12.9));
        list_of_products.add(new Product(5.6));

        ShoppingCart cart = new ShoppingCart();
        cart.setContents(list_of_products);
        
        cart.computeTotalPrice();

        //Liskov substitution 
        cart.computeTotalEUPrice();
        cart.computeTotalUSPrice();

        //Interface Segregation
        BearCarer bearCarer = new BearCarer();
        bearCarer.feedTheBear();
        bearCarer.washTheBear();

        CrazyPerson crazyPerson = new CrazyPerson();
        crazyPerson.petTheBear();
    }
}
