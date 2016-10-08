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
public class SarBuzzCoffee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription());
        System.out.println("Coast: " + beverage.cost());
        
        System.out.println("");
        
        Beverage beverage1 = new Espresso();    // Создаём Espresso
        beverage1 = new Mocha(beverage1);       // Заворачиваем в Mocha, (который расширяет декоратор)
        beverage1 = new Mocha(beverage1);       // Ещё раз
        System.out.println(beverage1.getDescription());
        System.out.println(beverage1.cost());
    }
    
}
