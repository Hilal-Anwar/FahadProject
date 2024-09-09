package zoya;

public class SelectionSort {
    public static void main(String[] args) {
        int zoya[] = {-5, 8, 12, 14, -19, 25, -89, 56};
        for (int i = 0; i < zoya.length; i++) {
            int min=i;
            for (int j = i+1; j < zoya.length; j++)
            {
                if (zoya[j]>zoya[min]) {
                    min=j;
                }
            }
            int temp=zoya[i];
            zoya[i]=zoya[min];
            zoya[min]=temp;
        }
        System.out.print("[");
        for (int i = 0; i < zoya.length; i++) {
            System.out.print(zoya[i]+",");
        }
        System.out.println("]");
    }
}
