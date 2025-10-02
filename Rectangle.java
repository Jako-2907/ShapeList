public class Rectangle extends Square {
    private double side2 = 0;

    public Rectangle(int id, double xCoordinate, double yCoordinate, double side, double side2) {
        super(id, xCoordinate, yCoordinate, side);
        this.side2 = side2;
    }

    public double getSide(){
        return side2;
    }

    @Override
    public double getArea() {
        if (getSide() > 0 && side2 > 0) {
            return getSide()*side2;
        }
        return 0;
    }

    @Override
    public double getPerimeter() {
        if (getSide() > 0 && side2 > 0) {
            return (2*(getSide()+side2));
        }
        return 0;
    }
}