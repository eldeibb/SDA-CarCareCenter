package Services;

import java.util.ArrayList;

public class ServiceView {
    ServiceProvider service_provider = new ServiceProvider();
    ArrayList <ServiceProvider> arr = new ArrayList <ServiceProvider>();
    Service service = new Service("Clean service", arr);
    ArrayList <Service> arr_of_services = new ArrayList <Service>();
    BasePackage base_package = new BasePackage(0.0, arr_of_services);
}