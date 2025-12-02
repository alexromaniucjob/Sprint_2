package model;

//Есть строковое поле colour — цвет яблок.
//Конструктор принимает три параметра: количество, цену и цвет яблок — и устанавливает флаг isVegetarian.
//Для красных яблок (colour равно "red") скидка должна быть равна 60%: соответствующий метод возвращает значение 60.
//Все переменные класса должны быть недоступны извне, если не указано иное.

import model.constants.Discount;

import static model.constants.Discount.GREEN_APPLE;
import static model.constants.Discount.RED_APPLE;

public class Apple extends Food implements Discountable{
    private final String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if(colour.equals("red")){
            return Discount.RED_APPLE; //60
        }else{
            return Discount.GREEN_APPLE; //0
        }
    }

   // public String getColour() {
   // return colour;
   // }
}


