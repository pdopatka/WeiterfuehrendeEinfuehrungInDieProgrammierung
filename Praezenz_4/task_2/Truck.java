package Praezenz_4.task_2;

public class Truck extends Vehicle implements Refuelable {
    double fuelLevel;
    double tankCapacity;
    public Truck(String id, double maxLoad, double tankCapacity) {
        super(id, maxLoad);
        this.fuelLevel = tankCapacity;
        this.tankCapacity = tankCapacity;
    }
    // TODO: implement Vehicle + Refuelable methods
        @Override
        public double getRange(){
            return fuelLevel/0.3;
        }
        @Override 
        public double fuelNeeded(double distance){
            return distance * 0.3;
        }
        @Override 
        public void refuel(double liters){
            fuelLevel = Math.max(tankCapacity, fuelLevel + liters);
        }

    @Override
    public double getFuelLevel() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    }
