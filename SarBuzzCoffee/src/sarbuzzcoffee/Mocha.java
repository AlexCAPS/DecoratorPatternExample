/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sarbuzzcoffee;

/**
 *
 * @author alex
 */

//Реализация декоратора. Кофе "Мокко"
public class Mocha extends CondimentDecorator{
    
    // Переменная для хранения ссылки
    Beverage beverage;
    
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        // В описании должно содержаться название напитка и дополнения.
        // Сначала получаем описание декорируемого объекта.
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        // Точно так же, как и с названием
        return beverage.cost() + .20;
    }
    
}
