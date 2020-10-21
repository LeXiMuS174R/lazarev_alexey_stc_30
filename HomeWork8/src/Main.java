public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5, 5, 3);
        Ellipse ellipse = new Ellipse(20, 20, 4, 10);
        Rectangle rectangle = new Rectangle(10, 10, 2.5, 6);
        Square square = new Square(35, 35, 4);

        System.out.println(circle);
        System.out.println();
        System.out.println(ellipse);
        System.out.println();
        System.out.println(rectangle);
        System.out.println();
        System.out.println(square);
        System.out.println();

        System.out.println("Circle Area = " + circle.getArea());
        System.out.println("Circle Perimeter = " + circle.getPerimeter());
        System.out.println("Ellipse Area = " + ellipse.getArea());
        System.out.println("Ellipse Perimeter = " + ellipse.getPerimeter());
        System.out.println("Rectangle Area = " + rectangle.getArea());
        System.out.println("Rectangle Perimeter = " + rectangle.getPerimeter());
        System.out.println("Square Area = " + square.getArea());
        System.out.println("Square Perimeter = " + square.getPerimeter() + "\n");

        Moveable m = new Moveable() {
            @Override
            public void resize(double koeff) {
            }

            @Override
            public void move(double dx, double dy) {
            }
        };

        circle.resize(2);
        ellipse.resize(2);
        rectangle.resize(2);
        square.resize(2);

        System.out.println(circle);
        System.out.println();
        System.out.println(ellipse);
        System.out.println();
        System.out.println(rectangle);
        System.out.println();
        System.out.println(square);

        circle.move(2, 3);
        ellipse.move(2, 3);
        rectangle.move(2, 3);
        square.move(2, 3);

        System.out.println(circle);
        System.out.println();
        System.out.println(ellipse);
        System.out.println();
        System.out.println(rectangle);
        System.out.println();
        System.out.println(square);
    }
}
