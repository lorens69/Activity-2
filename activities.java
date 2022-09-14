public class FirstGroup {
    public static int Subtraction (int a, int b)
    {
        int result = a-b;
        return result;
    }
    public static void main(String args[]) {
    System.out.println("Rob Wilson Caldosa");
	System.out.println("Allan Divino");
    System.out.println("John Laurence Castillo");

    }
}

// HELLO TEAMMATES YOU SHOULD PUT YOUR CODES HERE
public class Operators {
    static Addition(int a ,int b) {
        return a + b;
    }   
}


class Coffees {
    
    String brand = "Coffee Blanca"; // In this part i added some attribute for my main class Coffees
    public void sound() { // In this part i added one method
        System.outprintln("Slurp slurp");
    }
}

class Variants extends Coffees { // In this part i inherited the main class
    String benefits = "This coffee is good for your health."; 
    public static void main(String[] args) {
        
        Variants newCoffee = new Variants(); // here is the setter or instantation

        newCoffee.sound(); // here is the getter as the instructions says
        // and lastly, here is the final part where i print the objects 
        System.out.println(newCoffee.brand + "is good for your health and if you " + newCoffee.benefits +"it, the coffee boost your confidence and makes you stay awake!"); 
    }
} 


