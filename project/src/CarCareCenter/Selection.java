package CarCareCenter;

import Passenger.VehicleModel;

import java.util.ArrayList;

public abstract class Selection {
    public abstract VehicleModel Select(ArrayList<VehicleModel> WaitingList);
}
