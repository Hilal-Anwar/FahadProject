package class11th;

public class Table {
    static void table(int n,int i){
        if (i<=10) {
            System.out.println(n + " X " + i + " = " + (n * i));
            table(n,i+1);
        }

    }

    public static void main(String[] args) {
        table(17,1);
    }
}
