import java.util.Scanner;     // use Scanner class for console input 
//********************************************************************  
//  TempConverter.java       
//  Java Foundations 
//  Demonstrates the use of primitive data types and arithmetic  expressions. 
//******************************************************************** 

public class TempConverter {    
//-----------------------------------------------------------------    
//  Computes the Fahrenheit equivalent of a specific Celsius    
//  value using the formula F = (9/5)C + 32.    
//-----------------------------------------------------------------    
  
  public static void main (String[] args)    
  {       
    final int BASE = 32;       
    
    final double CONVERSION_FACTOR = 9.0 / 5.0; 
    
    @SuppressWarnings("resource")
	Scanner scan = new Scanner (System.in);   // attach to System.in   
    
    double celsiusValue = 0.0;    // hold Celcius degree value provided by a user    
 
    System.out.print   ("Enter current temperature in Celsius: ");
    celsiusValue = scan.nextDouble();        // get gallons from user
  
      double fahrenheitTemp;
      
      fahrenheitTemp = /*celsiusTemp*/celsiusValue * CONVERSION_FACTOR + BASE;
      
      System.out.println ("\nCelsius Temperature: " + String.format("%.3f", celsiusValue));       
      System.out.println ("\nFahrenheit Equivalent: " + String.format("%.3f", fahrenheitTemp));
      System.out.println ( "\nThe app has closed.");
  } // End of main()
} // End of class