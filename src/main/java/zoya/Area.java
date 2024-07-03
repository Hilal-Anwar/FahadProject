package zoya;

public class Area {
    public double area(int b, int h) {
        double z = b * h;
        return z;
    }
    public double area(double d1,double d2){
        double a=1/2.0*d1*d2;
        return  a;
    }
    public double area(int a,int b,int h){
        double er=1/2.0*(a+b)*h;
        return er;
    }

    public static void main(String[] args) {
        Area a=new Area();
        double x=a.area(3,5);
        double y=a.area(4,7,12);
        double z=a.area(5.4,5.34);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
