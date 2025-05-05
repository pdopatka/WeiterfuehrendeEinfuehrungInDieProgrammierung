package Homework_4_OOP.Task_1;

public class Flour extends PopularGrocery{

    public Flour(int quantity, int discountThreshold, int popularityLevel) {
        super(popularityLevel);
        this.quantity = quantity;
        this.discountThreshold = discountThreshold;
        this.householdLimit = 15;
    }

    @Override
    public int getBulkDiscount() {
        if (quantity >= discountThreshold) {
            return 5;
        }
        return 0;
    }
}
