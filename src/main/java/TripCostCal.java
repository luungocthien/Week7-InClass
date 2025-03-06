import java.util.Scanner;

public class TripCostCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double fuelConsumptionPer100Km = 10;

        System.out.println("Enter the distance to travel (km): ");
        double kilometers = scanner.nextDouble();

        System.out.println("Enter the fuel price: ");
        double fuelPrice = scanner.nextDouble();

        System.out.println("Total trip cost: " +calculateTripCost(kilometers, fuelPrice, fuelConsumptionPer100Km));
    }

    //Methods to calculate trip cost
    public static double calculateTripCost(double kilometers, double fuelPrice, double fuelConsumptionPer100Km) {
        double fuelNeeded = (kilometers/100) * fuelConsumptionPer100Km;
        return fuelNeeded * fuelPrice;
    }
}
