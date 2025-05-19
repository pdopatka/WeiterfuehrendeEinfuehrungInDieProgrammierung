package Homework_6_OOP.TASK1;

public class DotProductThread extends Thread{
    private int v1;
    private int v2;
    private int dot;

    public DotProductThread(int v1, int v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    @Override
    public void run() {
        dot = v1 * v2;
    }

    public int getDot() {
        return dot;
    }
}
