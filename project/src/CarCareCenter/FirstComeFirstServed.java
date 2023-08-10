package CarCareCenter;

import Passenger.VehicleModel;

import java.util.ArrayList;

public class FirstComeFirstServed extends Selection {

    public VehicleModel Select(ArrayList<VehicleModel> waitinglist) {
        VehicleModel selected = waitinglist.get(0);
        waitinglist.remove(0);
        return selected;
    }


}
