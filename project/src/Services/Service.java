package Services;

import java.util.ArrayList;

public  class Service{
    String Name, Id;

    ArrayList<ServiceProvider> ServiceProviders;

    public Service(String name, ArrayList<ServiceProvider> serviceProviders) {
        Name = name;
        ServiceProviders = serviceProviders;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public ArrayList<ServiceProvider> getServiceProviders() {
        return ServiceProviders;
    }

    public void setServiceProviders(ArrayList<ServiceProvider> serviceProviders) {
        ServiceProviders = serviceProviders;
    }
}
