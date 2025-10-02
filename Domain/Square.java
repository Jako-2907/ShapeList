package Domain;
public class Square extends Shape {
    private double side = 0;

    public Square(int id, double xCoordinate, double yCoordinate, double side) {
        super(id, xCoordinate, yCoordinate);
        this.side = side;
    }

    public double getSide(){
        return side;
    }

    @Override
    public double getArea() {
        if (side > 0) {
            return side * side;
        }
        return 0;
    }

    @Override
    public double getPerimeter() {
        if (side > 0) {
            return 4 * side;
        }
        return 0;
    }
}