package function;

public class Area {
    public Area() {
        System.out.println("Hello i am from the constructor");
    }

    public double area(int l, int b) {
        double a = l * b;
        return a;
    }

    public double area(double r) {
        return Math.PI * r * r;
    }

    public double area(int s) {
        return s * s;
    }

    public static void main(String[] args) {
        Area rayy = new Area();

        double z = rayy.area(5, 6);
        System.out.println(rayy.area(2.3));
        System.out.println(rayy.area(25));
        System.out.println(z);
    }

}
