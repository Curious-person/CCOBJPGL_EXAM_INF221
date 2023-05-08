package Locations;

import Tourist.Tourist;


public class Marawi implements Locations {
    
    int airFare = 400;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}
