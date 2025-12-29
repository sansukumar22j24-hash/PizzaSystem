package PizzaSystem;

public class PremiumPizza  extends Pizza implements PremiumPizzaInterface{


//method overriding because here i modify the actual implementation/instruction by adding the  flavour
    public void orderPizza(int size,String flavour){
        int price= size * 200;
        this.setPrice(price);
        System.out.print("Price: ");
        System.out.println(this.getPrice());
        System.out.print("Flavour ");
        System.out.println(flavour);

    }

   public  void addGourmetCrust(){
       System.out.println("Gourmet Crust Added");
   }
}
