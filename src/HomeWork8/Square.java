package HomeWork8;

class Square extends GeometricFigure implements Moveable {
    public double side;

    public Square(double x, double y, double side) {
        super(x, y);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }

    @Override
    public void move(double dx, double dy) {
        this.x += dx;
        this.y += dy;
    }

    @Override
    public void resize(double koeff) {
        this.side *= koeff;
    }

    @Override
    public String toString() {
        return ("Square" + "\n" + "Center: " + "(" + (x + side / 2) + ", " + (y + side / 2) + ")" + "\n" + "side: " + side);
    }
}
