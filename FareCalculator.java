
import java.util.*;

public class FareCalculator {
  
  int price;
  public static int ageRider(Scanner console) {
    System.out.println("Enter the age of the rider: ");
    System.out.println("1) seniors (65 and older): ");
    System.out.println("2) students (12-18): ");
    System.out.println("3) children (0-11): ");
    System.out.println("4) others: ");
    int ageRider = console.nextInt();
    return ageRider;
  }
  
  public static int typeRide(Scanner console) 
    
  {
    
    System.out.print("Welcome to the MBTA Fare Calculator!");
    System.out.println("Ride types:");
    System.out.println("1) Bus");
    System.out.println("2) Subway");
    System.out.println("3) Boat");
    {
      
      System.out.print("Enter the type of ride (1-3): ");
      int typeRide = console.nextInt();
      return typeRide;
      
      
    }   
    
  }
  
  public static int destination(Scanner console) {
    
    System.out.println("Enter where you are going: ");
    System.out.println("1) Inner harbor ferry");
    System.out.println("2) Btw South Shore and Boston");
    System.out.println("3) Btw Boston and Logan");
    System.out.println("4) Btw South Shore and Logan");
    int destination = console.nextInt();
    return destination;
  }
  public static String charlieBus(Scanner console) { 
    System.out.print("Are you using a Charlies Card (y or n): ");
    
    String charlieBus = console.next();
    return charlieBus;
  }
  public static String charlieSubway(Scanner console) {
    System.out.print("Are you using a Charlies Card (y or n): ");
    String charlieSubway = console.next();
    return charlieSubway;
  }
  
  public static void main (String[] args) {
    Scanner console = new Scanner (System.in);
    
    double price = 0.0;
    
    int typeRide = typeRide(console);
    if (typeRide == 1) {
      int ageRider = ageRider(console);
      {
        if (ageRider == 4) {
          {
            String charlieBus = charlieBus(console);
            if (charlieBus.equals("n")) {
              price = 160;
            } else {
              price = 210;
            }
          }
        }
        else if (ageRider == 3) {
          price = 0;
        }
        else if (ageRider == 2) {
          price = 80;
        }
        else {
          price = 80;
        }
      }
    }
    else if (typeRide == 2) {
      int ageRider = ageRider(console);
      {
        if (ageRider == 4) { 
          
          String charlieSubway = charlieSubway(console);
          
          if (charlieSubway.equals("n")) {
            price = 265;
          } else {
            price = 210;
          }
        }
        else if (ageRider == 3) {
          price = 0;
        }
        else if (ageRider == 2) {
          price = 105;
        }
        else {
          price = 105;
        }   
      }   
    }
    else if (typeRide == 3) 
    {
      int destination = destination(console);    
      {
        if (destination == 1) {
          price = 325;
        } else if (destination == 2) {
          price = 850;
        } else if (destination == 3) {
          price = 1375;
        } else {
          price = 1700;
        }
      }
      int ageRider = ageRider(console);
      
      if (ageRider == 1 || ageRider == 2) {
        price *= 50;
        
      } else if (ageRider == 3) {
        price = 0;
      }
    }   

    System.out.print("Your MBTA fare will be "+"$");
    System.out.println(price/100);
    System.out.println("Thank you for choosing MBTA.");
    System.out.println("We hope to see you again soon!");
  }
}



