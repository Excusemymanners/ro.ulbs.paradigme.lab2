public class Circle extends Form {
    float radius;

    Circle(){
        super();
        radius = 1;
    }
    Circle(float radius, String color){
        super();
        this.radius = radius;
    }
    @Override
    public float getArea(){
        float area;
        area = (float) ((radius * radius)*Math.PI);
        return area;
    }


    @Override
    public String toString() {
        return "Circle";
    }
}