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

// Абстрактный декоратор для напитка.
// Объекты должны быть взаимозаменяемыми с в Beverage, поэтому расширяется
// класс Beverage
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
