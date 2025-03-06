public abstract class  Form {
    private String color;

    Form() {
        color = "white";
    }

    Form(String color) {
        this.color = color;
    }
    public float getArea(){
        float area =0;
        return area;
    }

    @Override
    public String toString() {
        System.out.println("This form has color  " + color);
        return color;
    }

}
