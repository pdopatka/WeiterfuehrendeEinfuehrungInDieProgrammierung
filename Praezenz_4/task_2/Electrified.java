package Praezenz_4.task_2;

public interface Electrified {
    double MAX_BATTERY_KWH = 120.0;
    void charge(double kWh);
    double getBatteryLevel();
}
