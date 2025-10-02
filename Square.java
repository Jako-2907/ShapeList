public class Square extends Shape{

    private double lado=0;
    public Square(int id, double xCoordinate, double yCoordinate, double lado){
        super(id, xCoordinate, yCoordinate);
        this.lado= lado;
    }

    @Override
    public double getArea(){
        return lado*lado;
    }

    @Override
    public double getPerimeter(){
        return 4*lado;
    }

}