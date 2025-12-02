package model;
//Все переменные класса должны быть недоступны извне, если не указано иное.
public abstract class Food {

    private final int amount; //количество продукта в килограммах (целое число)
    private final double price; //цена за единицу (вещественное число)
    private final boolean isVegetarian;

    public Food(int amount, double price, boolean isVegetarian){
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

   public int getAmount() {
        return amount;
     }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
     return isVegetarian;
     }
}
