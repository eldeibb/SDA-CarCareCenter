package Passenger;

public class VehicleModel {
    int ModelYear;
    double length, width;
    String ModelName, Id;

    public enum PassengerType {
        RegularPassengers,
        SpecialPassengersFit
    }

    PassengerType passengerType;

    public int getModelYear() {
        return ModelYear;
    }

    public void setModelYear(int modelYear) {
        ModelYear = modelYear;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getModelName() {
        return ModelName;
    }

    public void setModelName(String modelName) {
        ModelName = modelName;
    }

    public String getId() {
        return Id;
    }

    public PassengerType getPassengerType() {
        return passengerType;
    }

    public void setPassengerType(PassengerType passengerType) {
        this.passengerType = passengerType;
    }

    public void setId(String id) {
        Id = id;
    }
}
