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
    }
  }
}; 