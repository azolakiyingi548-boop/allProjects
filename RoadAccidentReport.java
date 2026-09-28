public class RoadAccidentReport extends RoadAccidents{
    public RoadAccidentReport(String vehicleType, String city, int totalAccidents) {
        super(vehicleType, city, totalAccidents);
    }
    public void printAccidentReport() {
        System.out.println("\nVEHICLE ACCIDENT REPORT");
        System.out.println("**************************************************");
        System.out.println("VEHICLE TYPE: " + getAccidentVehicleType());
        System.out.println("CITY: " + getCity());
        System.out.println("ACCIDENT TOTAL: " + getAccidentTotal());
        System.out.println("**************************************************");
    }
}
