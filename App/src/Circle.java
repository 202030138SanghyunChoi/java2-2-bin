public class Circle {
    public Circle() {
    }

    public Circle(int r, String n) {
        radius = r;
        name = n;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }

    int radius;
    String name;
    
    public static void main(String[] args) {
        Circle pizza = new Circle(10, "자바피자");
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area + "입니다.");

        Circle donut = new Circle();
        donut.name = "도넛피자";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area + "입니다.");

        Circle pizza2 = new Circle();
        area = pizza2.getArea();
        System.out.println(pizza2.name + "의 면적은 " + area + "입니다.");
    }
}