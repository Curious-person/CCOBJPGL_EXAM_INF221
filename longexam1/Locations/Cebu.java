package Locations;

import Tourist.Tourist;


public class Cebu implements Locations {
    
    int airFare = 150;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }

}
