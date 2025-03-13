public abstract class  Form {
    private String color;
    static Integer counter=0;


    Form() {
        color = "white";
        counter++;


    }



    Form(String color) {
        this.color = color;
        counter++;  // Adăugat și aici
    }
    public float getArea(){
        float area =0;
        return area;


    }
    public static int getCounter(){
        return counter;
    }

    @Override
    public String toString() {
        System.out.println("This form has color  " + color);
        return color;
    }

}
