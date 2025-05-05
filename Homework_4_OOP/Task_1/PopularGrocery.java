package Homework_4_OOP.Task_1;

public abstract class PopularGrocery extends GroceryItem{
    int quantity;
    int popularityLevel;
    public PopularGrocery(int popularityLevel) {
        this.isPopular = true;
        this.popularityLevel = popularityLevel;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    @Override
    public boolean showWarning() {
        if(quantity > householdLimit) {
            System.out.println("Warning: You have exceeded the household limit for this item.");
            return true;
        }
        return false;
    }
    
}
