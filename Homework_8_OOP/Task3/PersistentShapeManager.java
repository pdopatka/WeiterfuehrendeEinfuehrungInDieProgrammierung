package Homework_8_OOP.Task3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import Homework_8_OOP.Task1.Shape;

public class PersistentShapeManager {
    public PersistentShapeManager() {
    }

    public static void saveShapesToFile(Collection<? extends Shape> shapes, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Shape shape : shapes) {
                writer.write(shape.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.err.println("Error saving shapes to file: " + e.getMessage());
        }
    }


    public static List<Shape> loadShapesFromFile(String filename) {
        List<Shape> shapes = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    shapes.add(ShapeFactory.fromString(line));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            System.err.println("Error loading shapes from file: " + e.getMessage());
        }
        return shapes;
    }

    public static void clearFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write("");
        } catch (IOException e) {
            System.err.println("Error clearing file: " + e.getMessage());
        }
    }
}
