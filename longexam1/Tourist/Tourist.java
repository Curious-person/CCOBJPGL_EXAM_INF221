package Tourist;

import Locations.Locations;
import Locations.Boracay;
import Locations.Cebu;
import Locations.Palawan;
import Locations.Vigan;
import Locations.Zamboanga;
import Locations.Marawi;

public interface Tourist {

    int budget = 1000;

    void visit();

    void visit(Boracay boracay);

    void visit(Cebu cebu);

    void visit(Palawan palawan);

    void visit(Vigan vigan);

    void visit(Zamboanga zamboanga);

    void visit(Marawi marawi);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}