package Homework_8_OOP.Task2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Homework_8_OOP.Task1.Shape;

public class ShapeAnalyzer {
    public ShapeAnalyzer() {
    }

    public static List<Shape> filterByMinArea(Collection<? extends Shape> shapes, double minArea) {
        List<Shape> filteredShapes = new ArrayList<>();
        for (Shape shape : shapes) {
            if (shape.getArea() >= minArea) {
                filteredShapes.add(shape);
            }
        }
        return filteredShapes;
    }
    public static Shape findShapeWithMaxArea(Collection<? extends Shape> shapes) {
        if (shapes.isEmpty()) {
            return null; // or throw an exception
        }
        Shape largestShape = null;
        double maxArea = Double.NEGATIVE_INFINITY;
        for (Shape shape : shapes) {
            if (shape.getArea() > maxArea) {
                maxArea = shape.getArea();
                largestShape = shape;
            }
        }
        return largestShape;
    }
    public static <T extends Shape> Map<String, List <T>> groupByType(Collection<T> shapes) {
        Map<String, List<T>> groupedShapes = new HashMap<>();
        for (T shape : shapes) {
            String typeName = shape.getClass().getSimpleName();
            groupedShapes.putIfAbsent(typeName, new ArrayList<>());
            groupedShapes.get(typeName).add(shape);
        }
        return groupedShapes;
    }

}
