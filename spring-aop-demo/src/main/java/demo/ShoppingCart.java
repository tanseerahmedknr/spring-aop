package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {

    public void checkout(String status){

//        logging
//        Authentication & Authorization
//        Sanitize the data

        System.out.println("Checkout Method from Shopping Cart called");
    }

    public int quality(){
        return 2;
    }
}
