package design_pattern;

public class AdaptorDP {

    public  static void main(String args[]){
        Paint paint = new Paint();
        Circle circle= new Circle();
        Square square = new Square();
        paint.drawShape(circle);
        paint.drawShape(square);

        Diamond diamond = new Diamond();
        DiamondAdapter diamondAdapter = new DiamondAdapter(diamond);
        paint.drawShape(diamondAdapter);
    }
}

class Paint{
    public void drawShape(Shape shape){
        shape.draw();
    }
}
interface Shape{
    void draw();
}

class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}

class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Square");

    }
}

// another class
class Diamond{
    public void drawMe(){
        System.out.println("Diamond");
    }
}

class DiamondAdapter implements Shape{
    Diamond diamond;
    public DiamondAdapter(Diamond diamond){
        this.diamond = diamond;
    }
    @Override
    public void draw() {
//        Diamond diamond = new Diamond();
//        diamond.drawMe();

        this.diamond.drawMe();
    }
}