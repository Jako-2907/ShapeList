package Domain;
import java.util.ArrayList;
import java.util.List;

public class ListShape {
    //Variable List
    private List<Shape> shapes;
    //Constructors
    public ListShape(){
        shapes = new ArrayList<>();
    }
    public ListShape(List<Shape> shapes){
        setShapes(shapes);
    }
    //getters
    public List<Shape> getShapes(){
        return shapes;
    }
    //setters
    public void setShapes(List<Shape> shapes){
        if(shapes != null){
            this.shapes = shapes;
        }else{
            this.shapes = new ArrayList<>();
        }
    }
    /*Methods
    Añadir una figura a la lista
    Consultar y mostrar la información de una figura específica a partir de su id.
    Calcular y mostrar el área total y el perímetro total de todas las figuras almacenadas en la lista.
    Salir del programa.
    */
    public void addShape(Shape shapes){
        if(shapes != null){
            this.shapes.add(shapes);
        }
    }
    public Shape getShapeById(int id){
        for(Shape shape:shapes){
            if(shape.getId() == id){
                return shape;
            }
        }
        return null;
    }
    public double getTotalArea(){
        double total = 0;
        for(Shape shape : shapes){
            total += shape.getArea();
        }
        return total;

    }
    public double getTotalPerimeter(){
        double total = 0;
        for(Shape shape:shapes){
            total += shape.getPerimeter();
        }
        return total;
    }
}
    

