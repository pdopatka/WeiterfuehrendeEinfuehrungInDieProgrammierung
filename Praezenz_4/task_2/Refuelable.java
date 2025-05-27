package Praezenz_4.task_2;

public interface Refuelable {
    void refuel(double liters);
    double getFuelLevel();
    /**
    * Default helper: can the vehicle travel 'distance ' km with
    * current fuel?
    * Works for any Refuelable that also extends Vehicle.
    */
    default boolean canReach(double distance) {
    if (this instanceof Vehicle v) {
    return v.getRange() >= distance;
    }
    return false;
    }
    }
