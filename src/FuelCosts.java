import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double gallonsInTank;
        double fuelEfficiency;
        double pricePerGallon;


           do {
            System.out.print("Gallons of gas in tank: ");
            gallonsInTank = scanner.nextDouble();
        } while (gallonsInTank <= 0);


        do {
                System.out.print("Fuel efficiency (miles per gallon): ");
                fuelEfficiency = scanner.nextDouble();
        } while (fuelEfficiency <= 0);


        do {
            System.out.print("Price of gas per gallon: ");
            pricePerGallon = scanner.nextDouble();
        } while (pricePerGallon <= 0);


            System.out.println("Cost to drive 100 miles: $" + (100 / fuelEfficiency) * pricePerGallon);
            System.out.println("Distance car can go with full tank: " + (gallonsInTank * fuelEfficiency) + " miles");


    }
}
