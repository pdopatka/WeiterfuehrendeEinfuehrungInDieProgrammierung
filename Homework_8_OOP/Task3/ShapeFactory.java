package Homework_8_OOP.Task3;

import Homework_8_OOP.Task1.Circle;
import Homework_8_OOP.Task1.Rectangle;
import Homework_8_OOP.Task1.Shape;

public class ShapeFactory {
    public ShapeFactory() {}

    public static Shape fromString(String input){
        String[] parts = input.split(" ");
        String shapeType = parts[0].trim();
        Shape shape = null;

        switch (shapeType.toLowerCase()) {
            case "circle":
                parts[3] = parts[3].replace(",", "");
                double radius = Double.parseDouble(parts[3].trim());
                shape = new Circle(radius);
                break;
            case "rectangle":
                parts[3] = parts[3].replace(",", "");
                parts[5] = parts[5].replace(",", "");
                double width = Double.parseDouble(parts[3].trim());
                double height = Double.parseDouble(parts[5].trim());
                shape = new Rectangle(width, height);
                break;
            default:
                throw new IllegalArgumentException("Unknown shape type: " + shapeType);
        }

        return shape;
    }
}
