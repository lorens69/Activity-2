class Coffee {
    
    private String brandname;
    int price = 12;
    
    public void sound() {
        System.out.println("Slurp slurp");
    }
    
    
    public String Getter() {
        return brandname;
    }
    
    public void Setter (String CofeeBrand){
        this.brandname = CofeeBrand;
    }
    
    }
    
    class Bens extends Coffee{
        
        private final String benefit = "this coffee has a lot of benefits and shall make you happy";
        
        public static void main(String[] args) {
        
           System.out.println("John Laurence Castillo" + ""); 
           
           Bens mih = new Bens();
           mih.sound();
           mih.Setter("Kopiko");
           System.out.println(mih.Getter() + "," + mih.benefit + ", and it only costs " + mih.price + " pesos.");
        }
    } 