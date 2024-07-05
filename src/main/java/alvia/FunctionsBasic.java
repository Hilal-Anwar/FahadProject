package alvia;

public class FunctionsBasic
{
    public static void main(String[] args)
    {
        FunctionsBasic fb=new FunctionsBasic();
        fb.range();
        fb.range();
        fb.range();
        fb.print_num(0,12);
        fb.print_num(11,30);
        fb.print_num(45,73);
    }
    void range()
    {
        System.out.println("this function prints the range");
    }
    void print_num(int a,int b){
        for (int i = a; i <=b ; i++) {
            System.out.println(i);
        }
        System.out.println("Done");
    }
}
