package app;

import model.*;
import model.constants.Colour;
import model.services.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        // Создаём объекты класса Food
        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, Colour.RED);
        Apple greenApple = new Apple(8, 60, Colour.GREEN);

        // Создаём массив продуктов
        Food[] products = { meat, redApple, greenApple };

        // Создаём корзину
        ShoppingCart cart = new ShoppingCart(products);

        // Суммы
        double total = cart.getTotalSum();
        double totalWithDiscount = cart.getTotalSumWithDiscount();
        double vegetarianTotal = cart.getVegetarianTotalSum();

        // Вывод
        System.out.println("Общая сумма без скидки: " + total);
        System.out.println("Общая сумма со скидкой: " + totalWithDiscount);
        System.out.println("Сумма всех вегетарианских продуктов: " + vegetarianTotal);
    }
}
///////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////пше