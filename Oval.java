public class Oval extends Shape{
    //variables
    private double radio;
    private double radio2;

    //constructor
    public Oval(int id, double xCoordinate, double yCoordinate, double radio, double radio2){
        super(id,xCoordinate,yCoordinate);
        this.radio = radio;
        this.radio2 = radio2;
    }
    //setters
    public void setArea(){

    }
    public void setPerimeter(){

    }
    //getters
    @Override
    public double getArea(){
        return 0;

    }
    @Override
    public double getPerimeter(){
        return 0;

    }


}
