package Tourist;
import Locations.*;

public class Kevin implements Tourist {

    static int budget = 1000;

    public void visit() {
        System.out.print("Enjoying my stay");
    }

    public void visit(Boracay boracay) {

        int airFare = 100;

        System.out.println("Boracay's fare is" + " " + airFare);

        if (budget > airFare) {
            System.out.println("Enjoying the white beaches and cheerful locals!");
            budget = budget - airFare;
        } else {
            System.out.println("You have now exceeded your" + budget + "budget allowance.");
        }
        checkBudget();
    } 

    public void visit(Cebu cebu) {
        
        int airFare = 150;

        System.out.println("Cebu's Fare is" + " " + airFare);
        if (budget > airFare) {
            System.out.println("Maayong buntag here in Cebu City!");
            budget = budget - airFare;
        } else {
            System.out.println("You have now exceeded your" + budget + "budget allowance.");
        }
        checkBudget();
        
    }

    public void visit(Palawan palawan) {
        int airFare = 200;

        System.out.println("Palawan's Fare is" + " " + airFare);
        if (budget > airFare) {
            System.out.println("Enjoying the crystal clear seas of Palawan!");            
            budget = budget - airFare;
            
        } else {
            System.out.println("You have now exceeded your" + budget + "budget allowance.");
        }
        checkBudget();
        
    }

    public  void visit(Vigan vigan) {
        int airFare = 100;

        System.out.println("Vigan's Fare is" + " " + airFare);
        if (budget > airFare) {
            System.out.println("Enjoying the Spanish-era structures!");            
            budget = budget - airFare;
            
        } else {
            System.out.println("You have now exceeded your" + budget + "budget allowance.");
        }
        checkBudget();
    }

    public void visit(Zamboanga zamboanga) {
        int airFare = 300;

        System.out.println("Zamboanga's Fare is" + " " + airFare);
        if (budget > airFare) {
            System.out.println("Bienvenidos aqui en Zamboanga! Que tal tu?");            
            budget = budget - airFare;
            
        } else {
            System.out.println("You have now exceeded your" + budget + "budget allowance.");
        }
        checkBudget();
        
    }

    public void visit(Marawi marawi) {
        
        int airFare = 400;

        System.out.println("Marawi's Fare is" + " " + airFare);
        if (budget > airFare) {
            System.out.println("MagCOD na tayo sa Marawi!");
            budget = budget - airFare;
        } else {
            System.out.println("You have now exceeded your" + " " + budget + " " + "budget allowance.");
        }
        checkBudget();
        
    }
    public void checkBudget() {
        System.out.println("my budget is " + budget);
    }

}
