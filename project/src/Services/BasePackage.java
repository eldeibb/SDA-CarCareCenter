package Services;

import java.util.ArrayList;

public class BasePackage {
    String Id;
    double Cost;
    ArrayList<Service> IncludedService;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public double getCost() {
        return Cost;
    }

    public void setCost(double cost) {
        Cost = cost;
    }

    public ArrayList<Service> getIncludedService() {
        return IncludedService;
    }

    public void setIncludedService(ArrayList<Service> includedService) {
        IncludedService = includedService;
    }
}
