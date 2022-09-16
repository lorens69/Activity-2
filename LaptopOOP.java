
public  class oop {

  static class Laptop{
     private String Cpu;
    private int Price;
    public Laptop(){
        
    }
    public Laptop(String Cpu,int Price){
      this.Price =Price;
      this.Cpu =Cpu;
       
    }
    public void Boot(){
        System.out.println("I am booting up.");
    }
    
    public String getCpu(){
        return Cpu;
    }
    public void setCpu(String Cpu){
        this.Cpu = Cpu;
    }
   
    public int getPrice(){
        return Price;
    }
    public void setPrice(int Price){
        this.Price = Price;
    }
 }
 static class Ultrabook extends Laptop{
     String Gpu = "I have discrete graphics card";
     public void Boot(){
         System.out.println("I am booting up much faster.");
     }
 }
 
    public static void main(String[] args) {
         Laptop lt = new Laptop();
         lt.Boot();
         Laptop macbook = new Laptop("M1",60000);
         Ultrabook ut = new Ultrabook();
         ut.Boot();
       
    }
    
}
