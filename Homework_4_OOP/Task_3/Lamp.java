package Homework_4_OOP.Task_3;

public class Lamp implements Switchable, Dimmable {
    boolean isOn = false;
    int brightnessLevel = 0;

    @Override
    public void turnOn() {
        isOn = true;
    }

    @Override
    public void turnOff() {
        isOn = false;
        brightnessLevel = 0;
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void setBrightness(int level) {
        if (level >= 0 && level <= MAX_BRIGHTNESS && isOn) {
            brightnessLevel = level;
        }
    }

    @Override
    public int getBrightness() {
        return brightnessLevel;
    }

    @Override
    public void dimToHalf() {
        setBrightness(MAX_BRIGHTNESS / 2);
    }
}
