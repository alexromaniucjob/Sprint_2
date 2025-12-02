package model;
//Все классы, реализующие этот интерфейс, возвращают значение 0 в методе getDiscount, если в задании не указано иное.

public interface Discountable {
//метод getDiscount возвращает размер скидки — вещественное число.
double getDiscount();
}
