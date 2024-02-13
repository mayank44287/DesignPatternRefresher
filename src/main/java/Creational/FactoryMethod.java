package Creational;

/***
 * Factory Method
 * Define an interface for creating an object, but let subclasses decide which class to instantiate.
 */

interface Product{
    void operations();
}
class FactoryMethod implements Product {
    public void operations(){
        System.out.println();
    }
}

class ConcreteProduct1 implements Product {
    public void operations() {
        System.out.println("Operation from ConcreteProduct1");
    }
}

class ConcreteProduct2 implements Product {
    public void operations() {
        System.out.println("Operation from ConcreteProduct2");
    }
}

interface Creator {
    Product factoryMethod();
}

class ConcreteCreator1 implements Creator {
    public Product factoryMethod() {
        return new ConcreteProduct1();
    }
}

class ConcreteCreator2 implements Creator {
    public Product factoryMethod() {
        return new ConcreteProduct2();
    }
}
