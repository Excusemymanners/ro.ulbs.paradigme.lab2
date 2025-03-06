public class Square extends Form{
    float side;

    Square(){
        super();
        side = 1;
    }



    Square(float side, String color){
        super();
        this.side = side;
    }
    @Override
    public float getArea(){
        float area;
        area = (side * side);
        return area;

    }
    @Override
    public String toString(){
        return "Square";
    }
}
