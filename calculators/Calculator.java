package calculators;
import java.io.*;

public class Calculator {
  public static void main(String[] args) throws IOException {
   // variable
   int i = 1;
  
    while(i <= 5){
      System.out.println("Add?Sub?Multiple?Divide? Please type A for Add, S for Sub, M for Multiple, or D for Divide");
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      String calcType = br.readLine();

      if(calcType.equals("A")){
        System.out.println("Please type first Number for Add");

        BufferedReader addBr = new BufferedReader(isr);
        String str = addBr.readLine();
        float num = Integer.parseInt(str);
        System.out.println( "first number is " + num );

        System.out.println("Please type second Number for Add");
        BufferedReader addBr2 = new BufferedReader(isr);
        String str2 = addBr2.readLine();
        float num2 = Integer.parseInt(str2);
        System.out.println( "Second number is " + num2 );
        System.out.println("Result is " + (num + num2));
      } else if(calcType.equals("S")){
        System.out.println("Please type first Number for Sub");

        BufferedReader subBr = new BufferedReader(isr);
        String str = subBr.readLine();
        float num = Integer.parseInt(str);
        System.out.println( "first number is " + num );

        System.out.println("Please type second Number for Sub");
        BufferedReader subBr2 = new BufferedReader(isr);
        String str2 = subBr2.readLine();
        float num2 = Integer.parseInt(str2);
        System.out.println( "Second number is " + num2 );
        System.out.println("Result is " + (num - num2));
      } else if(calcType.equals("M")) {
        System.out.println("Please type first Number for Multiple");

        BufferedReader mulBr = new BufferedReader(isr);
        String str = mulBr.readLine();
        float num = Integer.parseInt(str);
        System.out.println( "first number is " + num );

        System.out.println("Please type second Number for Multiple");
        BufferedReader mulBr2 = new BufferedReader(isr);
        String str2 = mulBr2.readLine();
        float num2 = Integer.parseInt(str2);
        System.out.println( "Second number is " + num2 );
        System.out.println("Result is " + (num * num2));
      } else if(calcType.equals("D")){
        try{
          System.out.println("Please type first Number for Divide");
  
          BufferedReader divBr = new BufferedReader(isr);
          String str = divBr.readLine();
          float num = Integer.parseInt(str);
          System.out.println( "first number is " + num );
  
          System.out.println("Please type second Number for Divide");
          BufferedReader divBr2 = new BufferedReader(isr);
          String str2 = divBr2.readLine();
          float num2 = Integer.parseInt(str2);
          System.out.println( "Second number is " + num2 );
          System.out.println("Result is " + (num / num2));
        } catch(ArithmeticException e) {
          System.out.println("Error: Division by zero");
        }

        // if(num2 == 0){
        //   System.out.println("Error: Division by zero");
        // } else {
        //   System.out.println("Result is " + (num / num2));
        // }
      } else {
        System.out.println("Invalid input. Please try again.");
      }
    }
  }
}; 