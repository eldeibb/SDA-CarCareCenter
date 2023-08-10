package Admin;

import Payments.*;
import Services.BasePackage;
import Services.Service;
import Services.ServiceProvider;

import java.util.ArrayList;

public class AdminController {
    ArrayList<Service> ListOfServices = new ArrayList<Service>();

    Discount discount;
    Service service;
    PaymentController PaymentCtrl;

    public AdminController(Discount discount, Service service, PaymentController paymentCtrl) {
        this.discount = discount;
        this.service = service;
        PaymentCtrl = paymentCtrl;
    }

    public double CalculateTotalIncome(){
        return PaymentCtrl.getCumulativeIncome();
    }

    public void AddService(String serviceName, ArrayList<ServiceProvider> sp){
        Service newService = new Service(serviceName, sp);
        ListOfServices.add(newService);
    }

    public void AddServicePackage(double cost, ArrayList<Service> S){
        BasePackage newBasePackage = new BasePackage(cost, S);
    }

    public void AddDiscount(String name, double rate, String promocode, String type){
        if(type.equals("MembershipDiscount")){
            discount = new MembershipDiscount(name, rate);
        }
        else{
            discount = new PromocodeDiscount(name, rate);

        }
    }

    public void ListServices(){
        for (int i=0; i<ListOfServices.size(); i++){
            System.out.println(ListOfServices.get(i).getName());
            System.out.println(ListOfServices.get(i).getId());
            for (int j=0; j<ListOfServices.get(i).getServiceProviders().size(); j++){
                System.out.println(ListOfServices.get(i).getServiceProviders().get(j).getName());
                System.out.println(ListOfServices.get(i).getServiceProviders().get(j).getCost());
            }
        }
    }

}
