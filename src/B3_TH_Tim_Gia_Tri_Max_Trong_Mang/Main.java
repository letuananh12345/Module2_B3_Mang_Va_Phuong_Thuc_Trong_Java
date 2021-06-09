package B3_TH_Tim_Gia_Tri_Max_Trong_Mang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(" nhập 1 size");
            size = sc.nextInt();
        }while (size>20);
        int i =0;
        arr = new int[size];
        while (i< arr.length){
            System.out.println("Nhập phần tử thứ " +(i+1));
            arr[i]=sc.nextInt();
            i++;
        }
        System.out.println("mảng gồm các phần tử : " );
        array(arr);
        System.out.println();
        int index =1;
        int max = arr[0];
        for (i=0;i<arr.length;i++){
          if (arr[i]>max){
              max = arr[i];
              index = i+1;
          }
        }
        System.out.println("giá trị lớn nhất trong mảng là:  " + max + " ở vị trí thứ: "+ index);
    }

     static void array(int[] arr) {
        for (int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
