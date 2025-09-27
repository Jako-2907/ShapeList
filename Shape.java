public abstract class Shape{
    //Variables
    private int id;
    private double xCoordinate;
    private double yCoordinate;
    //Constructor
    public Shape(int id, double xCoordinate, double yCoordinate){
        setId(id);
        setXCoordinate(xCoordinate);
        setYCoordinate(yCoordinate);
    }
    //Setters
    public void setId(int id){
        if( id > 0){
            this.id = id;
        }
    }
    public void setXCoordinate(double xCoordinate){
        this.xCoordinate = xCoordinate;
    }
    public void setYCoordinate(double yCoordinate){
        this.yCoordinate = yCoordinate;
    }
    //getters
    public int getId(){
        return id;
    }
    public double getXCoordinate(){
        return xCoordinate;
    }
    public double getYCoordinate(){
        return yCoordinate;
    }
    //getters abstractos
    public abstract double getArea();
    public abstract double getPerimeter(); 
}