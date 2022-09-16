class Icecream {
    
    private String icecreambrand;
    int price = 120;
    
    public void feeling() {
        System.out.println("Cold Delicious");
    }
    
    
    public String Getter() {
        return icecreambrand;
    }
    
    public void Setter (String Icecream){
        this.icecreambrand = Icecream;
    }
    
    }
    
    class Flavor extends Icecream{
        
        private final String taste = "this icecream is so yummy delecious";
        
        public static void main(String[] args) {
        
           System.out.println("Allan Celestial Divino" + ""); 
           
           Flavor f = new Flavor();
           f.feeling();
           f.Setter("Selecta");
           System.out.println(f.Getter() + "," + f.taste + ", for the price of " + f.price + " pesos.");
        }
    } 