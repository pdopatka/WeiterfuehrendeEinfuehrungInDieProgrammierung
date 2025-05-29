package Homework_8_OOP.Task3;

import java.util.ArrayList;
import java.util.List;

import Homework_8_OOP.Task1.Circle;
import Homework_8_OOP.Task1.Rectangle;
import Homework_8_OOP.Task1.Shape;

public class Main3 {
    public static void main(String[] args) {
        String filename = "shapes.txt ";
        // 1. Create shapes
        List<Shape> shapesToSave = new ArrayList<>();
        shapesToSave.add(new Circle(3.5));
        shapesToSave.add(new Rectangle(5.5, 3.3));
        // optional: Clear the file before saving to it
        PersistentShapeManager.clearFile(filename);
        // 2. Save to file
        PersistentShapeManager
                .saveShapesToFile(shapesToSave, filename);
        // 3. Load from file
        List<Shape> loadedShapes = PersistentShapeManager
                .loadShapesFromFile(filename);
        // 4. Display loaded shapes
        System.out.println(" Shapes loaded from file :");
        for (Shape shape : loadedShapes) {
            System.out.println(shape);
        }
    }
}
