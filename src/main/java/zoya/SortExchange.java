package zoya;

import java.util.Scanner;

public class SortExchange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[11];
        System.out.println("Enter the 11 elements in the array");
        for (int i = 0; i < 11; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                 if (arr[j] > arr[i]) {
                     int smallerNumber = arr[i];
                     arr[i] = arr[j];
                     arr[j] = smallerNumber;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}