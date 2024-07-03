package zoya;

public class FunctionOverLoading {
    public int add(int a, int b) {
        int s=a+b;
        return  s;
    }

    public void add(int e, int f, int g) {
        System.out.println(e+f+g);
    }
    public void add(double a,int b){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        FunctionOverLoading f=new FunctionOverLoading();
        double z=Math.sqrt(6);
        int x=f.add(4,6);
        System.out.println(x);
    }
}
