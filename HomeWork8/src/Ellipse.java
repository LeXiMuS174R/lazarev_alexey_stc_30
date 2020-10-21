import static java.lang.Math.*;

class Ellipse extends GeometricFigure implements Moveable {
    public double smallAxisLength;
    public double bigAxisLength;

    public Ellipse(double x, double y, double smallAxisLength, double bigAxisLength) {
        super(x, y);
        this.smallAxisLength = smallAxisLength;
        this.bigAxisLength = bigAxisLength;
    }

    @Override
    public double getArea() {
        return PI * bigAxisLength * smallAxisLength;
    }

    @Override
    public double getPerimeter() {
        return 4 * (PI * bigAxisLength * smallAxisLength + (bigAxisLength - smallAxisLength)) / bigAxisLength + smallAxisLength;
    }

    @Override
    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public void resize(double koeff) {
        this.bigAxisLength *= koeff;
        this.smallAxisLength *= koeff;
    }

    @Override
    public String toString() {
        return ("Ellipse" + "\n" + "Center: " + "(" + x + ", " + y + ")" + "\n" + "Big Axis Length: " + bigAxisLength + "\n" + "Small Axis Length: " + smallAxisLength);
    }
}
