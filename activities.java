public class activities {
  
    //ADDITION FUNCTION
    static int plusMethodInt(int x, int y) {
        return x + y;
      }
      
      static double plusMethodDouble(double x, double y) {
        return x + y;
      }

      //SUBSTRACTION FUNCTION
      static int minusMethodInt(int x, int y) {
        return x - y;
      }
      
      static double minusMethodDouble(double x, double y) {
        return x - y;
      }

      //DIVISION FUNCTION
      static int divideMethodInt(int x, int y) {
        return x / y;
      }
      
      static double divideMethodDouble(double x, double y) {
        return x / y;
      }

      //MULTIPLICATION FUNCTION
      static int multiplyMethodInt(int x, int y) {
        return x * y;
      }
      
      static double multiplyMethodDouble(double x, double y) {
        return x * y;
      }

      

    public static void main(String args[]) {
        System.out.println("Rob Wilson Caldosa");
	    System.out.println("Allan Divino");
        System.out.println("John Laurence Castillo");

    int plus1 = plusMethodInt(10,1005);
    double plus2 = plusMethodDouble(10, 100);
    
    int minus1 = minusMethodInt(10, 100);
    double minus2 = minusMethodDouble(10, 100);
    
    int times1 = multiplyMethodInt(10, 100);
    double times2 = multiplyMethodDouble(10, 100);
    
    int div1 = divideMethodInt(10, 100);
    double div2 = divideMethodDouble(10, 100);
    
    System.out.println("int: " + plus1);
    System.out.println("double: " + plus2);
    
    System.out.println("int: " + minus1);
    System.out.println("double: " + minus2);
    
    System.out.println("int: " + times1);
    System.out.println("double: " + times2);
    
    System.out.println("int: " + div1);
    System.out.println("double: " + div2);

    }
}


