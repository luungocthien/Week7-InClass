import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TripCostCalTest {

    @Test
    void calculateTripCost() {
        double kilometers = 150;
        double fuelPrice = 1.5;
        double fuelConsumptionPer100Km = 10;

        double expectedCost = (kilometers / 100) * fuelConsumptionPer100Km * fuelPrice;
        double actualCost = TripCostCal.calculateTripCost(kilometers, fuelPrice, fuelConsumptionPer100Km);

        assertEquals(expectedCost, actualCost, 0.001);
    }
}