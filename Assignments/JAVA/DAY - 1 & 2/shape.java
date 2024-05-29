
class shapes {
    public double area(){
        return 0.0;
    }
}

class circle extends shapes{
    private double radius;
    public circle(double radius){
        this.radius = radius;
    }
    public double area(){
        return Math.PI * radius * radius;
    }
}

class rectangle extends shapes{
    private double width;
    private double height;

    public rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double area(){
        return width * height;
    }
}

public class shape{
    public static void main(String[] args) {
        circle c = new circle(5);
        rectangle r = new rectangle(4,6);

        System.out.println("Area of a circle " +  c.area());
        System.out.println("Area of rectangle " + r.area());
    }
}


