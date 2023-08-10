package CarCareCenter;

import Passenger.VehicleModel;

import java.util.ArrayList;

public class FirstComeFirstServedFactory extends CarCareController {


    public FirstComeFirstServedFactory(ArrayList<VehicleModel> waitingList) {
        super(waitingList);
    }

    public FirstComeFirstServed SelectFromWaitingList(ArrayList<VehicleModel> waitingList) {
        return new FirstComeFirstServed(waitingList);
    }
}
