package model;
//Все переменные класса должны быть недоступны извне, если не указано иное.
public class Meat extends Food implements Discountable{
    public Meat(int amount, double price) {
           super(amount, price, false);
    }

    //В классах-наследниках нужно обязательно реализовать все абстрактные методы класса-родителя.
    @Override
    public double getDiscount() {

        return 0;
    }
}
