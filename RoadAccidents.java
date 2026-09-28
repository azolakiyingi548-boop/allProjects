public abstract class RoadAccidents implements iRoadAccidents {
    private String vehicleType;
    private String city;
    private int totalAccidents;

    public RoadAccidents(String vehicleType, String city, int totalAccidents) {
        this.vehicleType = vehicleType;
        this.city = city;
        this.totalAccidents = totalAccidents;
    }

    @Override
    public String getAccidentVehicleType() {
        return vehicleType;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public int getAccidentTotal() {
        return totalAccidents;
    }
}
