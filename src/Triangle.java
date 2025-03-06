public class Triangle extends Form{
    float height;
    float base;

    Triangle(){
        height = 1;
        base = 1;
    }
    Triangle(float base, float height, String color){
        this.base = base;
        this.height = height;
    }

    @Override
    public float getArea() {
        float area = (height * base);
        return area;

    }
    @Override
    public String toString(){
        return"Triangle";
    }

    public boolean equals(Triangle triangle){
        if(this.base == triangle.base){
            if(this.height == triangle.height){
                return true;

            }else {
                return false;
            }
        }else  {
            return false;
        }
    }


}
