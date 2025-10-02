package Domain;
public class Oval extends Circle{
    //variables
    private double radio2;

    //constructor
    public Oval(int id, double xCoordinate, double yCoordinate, double radio, double radio2){
        super(id,xCoordinate,yCoordinate,radio);
        this.radio2 = radio2;
    }
    //setters
    public void setRadio2(double radio2){
        if (radio2 < 0){
            this.radio2 = 0;
        }else{
            this.radio2 = radio2;
        }

    }
    //getters
    public double getRadio2(){
        return radio2;
    }
    //getters abstractos
    @Override
    public double getArea(){
        return (Math.PI * getRadio2()* getRadio());

    }
    @Override
    public double getPerimeter(){
        return (Math.PI*(3*(getRadio() + getRadio2())-Math.sqrt((3*getRadio()+getRadio2())*(getRadio()+3*getRadio2()))));
        //π [ 3(a + b) - √((3a + b)(a + 3b)) ]
    }
}