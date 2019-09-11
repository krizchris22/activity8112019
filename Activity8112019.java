
package activity8112019;

import java.util.Scanner;

public class Activity8112019 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        //1st question
        int seconds, SecToMin, MinToHour, MinToSec;
        final int Totalseconds = 3600;
        System.out.println("Enter time in seconds: ");
        seconds = in.nextInt();
        SecToMin = (seconds % Totalseconds) / 60;
        MinToHour = seconds / Totalseconds;
        MinToSec = seconds % 60;
        System.out.println("Time is " + MinToHour + " hour " + SecToMin + " minutes " + MinToSec + " seconds" );
        
      /// second question
       double drivingDistance, miles_per_gallon, priceperGallon, cost;
        System.out.println("Enter the driving distance: ");
        drivingDistance = in.nextDouble();
        System.out.println("Enter miles per gallon: ");
        miles_per_gallon = in.nextDouble();
        System.out.println("Enter the price per gallon: ");
        priceperGallon = in.nextDouble();
        cost = (drivingDistance / miles_per_gallon) * priceperGallon;
        System.out.printf("The cost of driving is $%.2f" ,cost);
        System.out.println("");
        
        
      
        
          
          
          
          
          
                  
          
     
    }
    
}
