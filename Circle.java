public class Circle extends Shape{
    //variables
    private double radio;

    //constructor
    public Circle(int id, double xCoordinate, double yCoordinate, double radio){
        super(id,xCoordinate,yCoordinate);
        this.radio = radio;
    }
    //setters
    public void setRadio(double radio){
        if (radio < 0){
            this.radio = 0;
        }else{
            this.radio = radio;
        }

    }
    //getters
    public double getRadio(){
        return radio;   
    }
    //getters abstractos
    @Override
    public double getArea(){
        return (Math.PI *Math.pow(getRadio(),2));
    }
    @Override
    public double getPerimeter(){
        return (2*Math.PI*getRadio());

    }
}