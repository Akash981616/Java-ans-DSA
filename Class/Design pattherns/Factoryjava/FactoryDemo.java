package Factoryjava;

public class FactoryDemo {
    public static void main(String[] args) {
        shapeFactory shapeFactory = new shapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");

        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");

        shape3.draw();
    }
   
}
