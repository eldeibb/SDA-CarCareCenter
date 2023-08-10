package Services;

public class CarMaintenanceService extends Service{
    public CarMaintenanceService(Process process1) {
        super(process1);
    }

    public double CalcCost(){
        return process1.CalcCost()+500;
    }
}
