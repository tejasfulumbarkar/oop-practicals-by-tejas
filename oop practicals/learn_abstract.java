abstract class Vehicle{
   abstract void accelerate();
   // concreate method 
   void start(){
    System.out.println("vehicle is startng  ");
   }

}

class Car extends Vehicle{
    void accelerate(){
 System.out.println("car is accersl");
    
}
}

public class learn_abstract {
    
public static void main(String[] args) {
    
    Car c = new Car();
    c.start();
    c.accelerate();
}


}
