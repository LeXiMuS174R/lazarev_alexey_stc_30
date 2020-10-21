import static java.lang.Math.*;

class Circle extends GeometricFigure implements Moveable {
    public double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (double) (PI * sqrt(radius));
    }

    @Override
    public double getPerimeter() {
        return (double) (2 * PI * radius);
    }

    @Override
    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public void resize(double koeff) {
        this.radius *= koeff;
    }

    @Override
    public String toString() {
        return ("Circle" + "\n" + "Center: " + "(" + x + ", " + y + ")" + "\n" + "Radius: " + radius);
    }
}

