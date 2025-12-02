package model.services;
import model.Food;
import model.Discountable;

//Все переменные класса должны быть недоступны извне, если не указано иное.
public class ShoppingCart{
    private final Food[] items;

    //Нужен конструктор с одним параметром — массивом элементов Food. С его помощью создается объект корзины.
    public ShoppingCart(Food[] arrayFood) {
        this.items = arrayFood;
    }

   // public Food[] getItems() {
   //     return items;
   // }

    //получить общую сумму товаров в корзине без скидки,
    public double getTotalSum() {
        double sum = 0;
        for(int i =0; i< items.length; i++){
            sum = sum + items[i].getAmount() * items[i].getPrice();
        }
        return sum;
    }

    //получить общую сумму товаров в корзине со скидкой,
    public double getTotalSumWithDiscount() {
        double sum = 0;
        for (int i = 0; i < items.length; i++) {
            double price = items[i].getAmount() * items[i].getPrice();
            // просто вызываем getDiscount, так как все продукты Discountable
            Discountable productWithDiscount = (Discountable) items[i];
            double discount = productWithDiscount.getDiscount();
            sum += price * (1 - discount / 100);
        }
        return sum;
    }

    public double getVegetarianTotalSum() {
        double sum = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i].isVegetarian()) {
                sum += items[i].getAmount() * items[i].getPrice();
            }
        }
        return sum;
    }
}