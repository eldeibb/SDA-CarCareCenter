package CarCareCenter;

import Passenger.VehicleModel;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class CarCareController {
    private Selection SelectionAlgo;
    private Workers workerslist;
    private Date ArrivalTime;
    private Date DepartTime;

    private ArrayList<VehicleModel> WaitingList = new ArrayList<VehicleModel>();
    public void CleanIn(VehicleModel passenger){
        ArrivalTime = new Date();
        WaitingList.add(passenger);
    }
    public long CleanOut(){
        DepartTime = new Date();
        long TotalTime = DepartTime.getTime() - ArrivalTime.getTime();
        return TotalTime;
    }
}
