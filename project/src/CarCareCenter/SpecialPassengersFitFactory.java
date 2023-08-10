package CarCareCenter;

import Passenger.VehicleModel;

import java.util.ArrayList;

public class SpecialPassengersFitFactory extends CarCareController{
    public SpecialPassengersFitFactory(ArrayList<VehicleModel> waitingList) {
        super(waitingList);
    }

    @Override
    public Selection SelectFromWaitingList(ArrayList<VehicleModel> waitingList) {
        return new SpecialPassengerFit(waitingList);
    }
}
