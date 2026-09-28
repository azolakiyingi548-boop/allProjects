//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner scanner = new Scanner(System.in);


    String[] city = {"Cape Town", "Johannesburg", "Port Elizabeth"};
    String[] vehicleTypes = {"CAR", "MOTOR BIKE"};


    int[][] accidentData = new int[city.length][vehicleTypes.length];
    for (int i = 0; i < city.length; i++) {
        System.out.print("Enter the number of car accidents for " + city[i] + ": ");
        accidentData[i][0] = scanner.nextInt();

        System.out.print("Enter the number of motor bike accidents for " + city[i] + ": ");
        accidentData[i][1] = scanner.nextInt();
    }
    System.out.println("\n--------------------------------------------------");
    System.out.println("ROAD ACCIDENT REPORT");
    System.out.println("--------------------------------------------------");
    System.out.printf("%-20s %-12s %-12s%n", "", vehicleTypes[0], vehicleTypes[1]);
    for (int i = 0; i < city.length; i++) {
        System.out.printf("%-20s %-12d %-12d%n", city[i], accidentData[i][0], accidentData[i][1]);
    }

    System.out.println("--------------------------------------------------");
    System.out.println("\nROAD ACCIDENT TOTALS FOR EACH CITY");
    System.out.println("--------------------------------------------------");

    int maxTotal = -1;
    String cityWithMostAccidents = "";

    for (int i = 0; i < city.length; i++) {
        int cityTotal = accidentData[i][0] + accidentData[i][1];
        System.out.printf("%-20s %-10d%n", city[i], cityTotal);
        if (cityTotal > maxTotal) {
            maxTotal = cityTotal;
            cityWithMostAccidents = city[i];
        }
    }

    System.out.println("\n--------------------------------------------------");
    System.out.println("CITY WITH THE MOST VEHICLE ACCIDENTS: " + cityWithMostAccidents);
    System.out.println("--------------------------------------------------");
}

