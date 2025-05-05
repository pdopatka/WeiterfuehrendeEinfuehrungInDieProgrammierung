package Homework_4_OOP.Task_3;

public interface Dimmable {
    int MAX_BRIGHTNESS = 100;
    void setBrightness(int level);
    int getBrightness();
    void dimToHalf();    
}
