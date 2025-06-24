package Homework_8_OOP.Task1;

import java.util.ArrayList;

public class ShapeStorage<T extends Shape> extends ArrayList<T> {
    private ArrayList<T> shapes;

    public ShapeStorage() {
        this.shapes = new ArrayList<>();
    }

    public boolean add(T shape) {
        return shapes.add(shape);
    }

    public void displayAllShapes() {
        for (T shape : shapes) {
            System.out.println(shape);
        }
    }
    public <U extends T> void importLargeShapes(ShapeStorage<U> other, double minArea) {
        for (T shape : other.shapes) {
            if (shape.getArea() >= minArea) {
                this.add(shape);
            }
        }
    }

    public double getTotalArea() {
        double totalArea = 0.0;
        for (T shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }

}
