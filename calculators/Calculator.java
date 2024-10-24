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

      if(calcType.equals("A") || calcType.equals("a")){
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
        System.out.println(num + " + " + num2 + " = " + (num + num2));
      } else if(calcType.equals("S") || calcType.equals("s")){
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
        System.out.println(num + " - " + num2 + " = " + (num - num2));
      } else if(calcType.equals("M") || calcType.equals("m")) {
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
        System.out.println(num + " * " + num2 + " = "  + (num * num2));
      } else if(calcType.equals("D") || calcType.equals("d")){
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
        // System.out.println(num + " / " + num2 + " = " + (num / num2));

        if(num2 == 0){
          System.out.println("Error: Division by zero");
        } else {
          System.out.println(num + " / " + num2 + " = " + (num / num2));
        }
      } else {
        System.out.println("Invalid input. Please try again.");
      }
      String again = "";
      while(i <= 2){
        System.out.println("Do you want to continue? (Y/N)");
        BufferedReader againBr = new BufferedReader(isr);
        again = againBr.readLine();
        if(again.equals("Y") || again.equals("y")){
          break;
        } else if(again.equals("N") || again.equals("n")){
          // System.out.println("Exiting...");
          break;
        } else {
          System.out.println("Invalid input. Please try again.");
        }
      }
      if(again.equals("N")){
        break;
      }
    }
    System.out.println("done");
  }
}; 