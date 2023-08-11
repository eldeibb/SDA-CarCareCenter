import Admin.AdminModel;
import Admin.AdminView;
import CarCareCenter.CarCareView;
import Passenger.VehicleView;
import Payments.PaymentModel;
import Payments.PaymentView;
import Services.Service;
import Services.ServiceView;

public class Main {
    public static void main(String[] args) {
        AdminView admin = new AdminView();
        VehicleView vehicle = new VehicleView();
        PaymentView payment = new PaymentView();
        CarCareView carCareView = new CarCareView();
        ServiceView service = new ServiceView();

    }
}