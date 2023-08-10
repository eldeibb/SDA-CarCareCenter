package CarCareCenter;

import Passenger.VehicleModel;

import java.util.ArrayList;

import static Passenger.VehicleModel.PassengerType.SpecialPassengersFit;

public class SpecialPassengerFit extends Selection {

    public VehicleModel Select(ArrayList<VehicleModel> WaitingList) {
        for(int i = 0; i < WaitingList.size()-1;i++){
            if(WaitingList.get(i).getPassengerType() == SpecialPassengersFit){
                VehicleModel selected = WaitingList.get(i);
                WaitingList.remove(i);
                return selected;
            }
        }
        return WaitingList.get(0);
    }
}
