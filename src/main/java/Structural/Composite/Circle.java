package Structural.Composite;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

interface Shape {
    void draw();
}
class Circle implements Shape {
    @Override
    public void draw(){
        System.out.println("Drawing a Circle");
    }
}

class Square implements Shape{
    @Override
    public void draw(){
        System.out.println("Drawing a square");
    }
}

class Group implements Shape{
    private List<Shape> children;
    public Group(){
        this.children = new ArrayList<>();
    }
    public void add(Shape shape){
        children.add(shape);
    }
    @Override
    public void draw(){
        for (Shape child: children){
            child.draw();
        }
    }
}

class Client{
    public static void main(String[] args) {
        Circle circle = new Circle();
        Square square = new Square();
        Group group = new Group();

        group.add(circle);
        group.add(square);

        group.draw();
    }
}