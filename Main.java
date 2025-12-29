package PizzaSystem;

public class Main {
    public static void main(String[] args) {
/*
________This is Pizza Oradering app_______
1. create the Main Class inside it has main method() .
2. create the essential 3 class files were used in this program Customer,RegularPizza,premiumPizza
3. create the objects for respectiove the class files and the reference variables  orderId, price, pizzaType, size and their methods
4. create the getter and setter for the respectivoe  to the variable;
5. then come to main and set the Customer details usingthe setter method();
6. create  the Objects Customer,RegularPizza,PremiumPizza
7. set the customer details.and if the customer type is matches the PizzaType the it performs the inside if statement and then it redirect to the respective
object for performing the operation given inside it.
8. set the details in the constructor;
* */
        //Creating the classObject for costumer
        Customer customer = new Customer();
        //Datatype variable = for creating object , Constructor created by default in memeory Model
        customer.setOrderId(7);
        //object_has_addressof_this.setorderMethod
        customer.setPizzaType("REGULAR");
        customer.setSize(2);
        RegularPizza regularPizza = new RegularPizza();
        regularPizza.setOrderId(customer.getOrderId());

        {
        if (customer.getPizzaType() == "REGULAR") {
            System.out.println("===== CUSTOMER 1: REGULAR =====");
            System.out.println("Pizza Ordered");
            //
            regularPizza.orderPizza(customer.getSize());
            regularPizza.addExtraToppings();
        }
        else {
            // if the condition is not satisfied then cancel
            regularPizza.cancelPizza();
        }
        }
        System.out.println();



// here i defined my user definded cunstructor and just passed my values to the cunstuctor to initialize those valuse
        Customer customer2 = new Customer(7,"PREMIUM",2);
//        customer2.setOrderId(7);
//        customer2.setPizzaType("PREMIUM");
//        customer2.setSize(2);
        PremiumPizza premiumPizza = new PremiumPizza();
        premiumPizza.setOrderId(customer2.getOrderId());

        {
            if (customer2.getPizzaType() == "PREMIUM") {
                System.out.println("====== CUSTOMER 2: PREMIUM =====");
                System.out.println("Pizza Ordered");
                premiumPizza.orderPizza(customer.getSize());
                System.out.println("Operator overloading");
                premiumPizza.orderPizza(customer.getSize(),"Cheese");
                premiumPizza.addGourmetCrust();
            }
            else {
                regularPizza.cancelPizza();
            }

        }


    }
}
