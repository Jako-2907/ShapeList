public class Square extends Shape {
    private double lado = 0;

    public Square(int id, double xCoordinate, double yCoordinate, double lado) {
        super(id, xCoordinate, yCoordinate);
        this.lado = lado;
    }

    @Override
    public double getArea() {
        if (lado > 0) {
            return lado * lado;
        }
        return 0;
    }

    @Override
    public double getPerimeter() {
        if (lado > 0) {
            return 4 * lado;
        }
        return 0;
    }

}