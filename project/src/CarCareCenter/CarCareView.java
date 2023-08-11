package CarCareCenter;

import Passenger.VehicleModel;

import java.util.ArrayList;

public class CarCareView {
    ArrayList<VehicleModel> waitingList = new ArrayList<VehicleModel>();
    CarCareController car_care_controller = new SpecialPassengersFitFactory(waitingList);
}
