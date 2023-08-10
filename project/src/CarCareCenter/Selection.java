package CarCareCenter;

import Passenger.VehicleModel;

import java.util.ArrayList;

public abstract class Selection {
    ArrayList<VehicleModel> waitingList;

    public Selection(ArrayList<VehicleModel> waitingList) {
        this.waitingList = waitingList;
    }

    public abstract VehicleModel Select(ArrayList<VehicleModel> WaitingList);
}
