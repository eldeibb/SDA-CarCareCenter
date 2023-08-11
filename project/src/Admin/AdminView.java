package Admin;

import Payments.Discount;
import Payments.MembershipDiscount;
import Payments.PaymentController;
import Services.Service;
import Services.ServiceProvider;

import java.util.ArrayList;

public class AdminView {
    public AdminView() {
        Discount discount = new MembershipDiscount("Subscription", 2.5);
        ArrayList<ServiceProvider> arr = new ArrayList<ServiceProvider>();
        Service s = new Service("Service1", arr);
        PaymentController p = new PaymentController();
        AdminController admin_controller = new AdminController(discount, s, p);
        AdminModel admin_model = new AdminModel(admin_controller);
    }
}
