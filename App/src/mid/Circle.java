package mid;
public class Circle {
    public Circle() {

    }
    public Circle(int radius, String name){
        this.radius = radius;
        this.name = name;
    }    

    final static double PI = 3.14;
    
    int radius;
    String name;

    public void circleInfom(int r, String n) {
        radius = r;
        name = n;
    }

    public double getArea() {
        return radius * radius * PI;
    }
    
    public static void main(String[] args) {
        Circle pizza = new Circle(10, "자바피자");
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area + "입니다.");

        Circle pizza2 = new Circle();
        pizza2.radius = 20; 
        area = pizza2.getArea();
        System.out.println(pizza2.name + "의 면적은 " + area + "입니다.");
        
        Circle donut = new Circle();
        donut.name = "자바도넛";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area + "입니다.");
    }
}
