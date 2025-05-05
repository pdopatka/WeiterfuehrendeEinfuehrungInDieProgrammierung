package Homework_4_OOP.Task_1;

public class Main {
    public static void main(String[] args) {
        // Erstelle Instanzen von Flour und Milk
        Flour flour = new Flour(20, 10, 5);
        Milk milk = new Milk(25, 15, 8);

        // Teste die Methoden von Flour
        System.out.println("Testing Flour:");
        System.out.println("Bulk Discount: " + flour.getBulkDiscount());
        flour.showWarning();

        // Teste die Methoden von Milk
        System.out.println("\nTesting Milk:");
        System.out.println("Bulk Discount: " + milk.getBulkDiscount());
        milk.showWarning();

        // Teste die PopularGrocery-Attribute
        System.out.println("\nTesting PopularGrocery Attributes:");
        System.out.println("Flour Popularity Level: " + flour.popularityLevel);
        System.out.println("Milk Popularity Level: " + milk.popularityLevel);
    }
}