import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the accident vehicle type: ");
        String vehicleType = scanner.nextLine();

        System.out.print("Enter the city for the vehicle accidents: ");
        String city = scanner.nextLine();

        System.out.print("Enter the total " + vehicleType + " accidents for " + city + ": ");
        int totalAccidents = scanner.nextInt();

        RoadAccidentReport report = new RoadAccidentReport(vehicleType, city, totalAccidents);

        report.printAccidentReport();

    }
}
