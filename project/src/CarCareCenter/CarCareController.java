package CarCareCenter;

import Passenger.VehicleModel;

import java.util.ArrayList;
import java.util.Date;

public abstract class CarCareController {
    private Selection SelectionAlgo;
    private ArrayList<Workers> workerslist;
    private Date ArrivalTime;
    private Date DepartTime;



    private ArrayList<VehicleModel> WaitingList = new ArrayList<VehicleModel>();

    public CarCareController(ArrayList<VehicleModel> waitingList) {
        WaitingList = waitingList;
    }

    public void CleanIn(VehicleModel passenger){
        ArrivalTime = new Date();
        WaitingList.add(passenger);
    }
    public long CleanOut(){
        DepartTime = new Date();
        long TotalTime = DepartTime.getTime() - ArrivalTime.getTime();
        return TotalTime;
    }
    public abstract Selection SelectFromWaitingList(ArrayList<VehicleModel> waitingList);
}
