package Structural.Decorator;

import java.awt.image.PixelGrabber;

interface Pizza {
    String getDescription();
    double getPrice();
}
public class PlainPizza implements Pizza {
    @Override
    public String getDescription(){
        return "Plain Pizza";
    }

    @Override
    public double getPrice(){
        return 5.0;
    }
}

abstract class PizzaDecorator implements Pizza{
    private Pizza pizza;
    public PizzaDecorator(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription(){
        return pizza.getDescription() + " , " + getAddedDescription();
    }
    @Override
    public double getPrice(){
        return pizza.getPrice() + getAddedPrice();
    }

    abstract String getAddedDescription();
    abstract double getAddedPrice();
}

class CheesePizza extends PizzaDecorator{
    public CheesePizza(Pizza pizza){
        super(pizza);
    }

    @Override
    String getAddedDescription() {
        return "with cheese";
    }

    @Override
    double getAddedPrice() {
        return 1.0;
    }

}

class PepperoniPizza extends PizzaDecorator {
    public PepperoniPizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    String getAddedDescription() {
        return "with pepperoni";
    }

    @Override
    double getAddedPrice() {
        return 2.0;
    }
}

class Client{
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        pizza = new CheesePizza(pizza);
        pizza = new PepperoniPizza(pizza);

        System.out.println(pizza.getDescription() + " for $" + pizza.getPrice());
    }
}

/***
 * How it uses the Decorator pattern:
 * Dynamic Behavior Addition: Adding toppings to a pizza doesn't change its core functionality ("PlainPizza").
 * Instead, you dynamically add new behaviors (adding descriptions and prices) through decorators (CheesePizza,
 * PepperoniPizza). No Modification of Original Class: The PlainPizza class remains untouched, adhering to the
 * Open/Closed Principle. New functionalities are encapsulated in separate decorator classes.
 * Component Interface: All objects (original and decorated) implement the Pizza interface, enabling the client
 * to treat them uniformly. Composition: Each decorator holds a reference to the wrapped object, forming a chain of responsibility.
 ***/