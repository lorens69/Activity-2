public class Icecream {
  
	private String icecreambrand;
	int icecreamprice = 120;

public String Getter() {
    return icecreambrand;
    
}

public void Setter (String brand){
    this.icecreambrand = brand;
}

public void feeling() {   
        System.out.println("Cold Delicious");
    }

    public static void main(String args[]) {
      
      

    }
}

 class Flavor extends Icecream{
        
        private final String taste = "icecream is so yummy and delicious";
        
        public static void main(String[] args) {
        
           System.out.println("Allan Divino" + ""); 
           
           Flavor f  = new Flavor();
           f.feeling();
           f.Setter("Selecta");
           System.out.println(f.Getter() + "," + f.taste + ", for only  " + f.icecreamprice+ " pesos.");
        }
    } 