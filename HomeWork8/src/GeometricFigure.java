public abstract class GeometricFigure {
    public double x;
    public double y;

    public GeometricFigure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    abstract double getArea();

    abstract double getPerimeter();
}
