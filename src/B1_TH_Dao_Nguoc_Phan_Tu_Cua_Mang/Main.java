package B1_TH_Dao_Nguoc_Phan_Tu_Cua_Mang;

import javafx.scene.chart.ScatterChart;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr;
        int size;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập 1 size :");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Size không được vượt quá 20 : ");
            }
        } while (size > 20);

        int i = 0;
        arr = new int[size];
        while (i < arr.length) {
            System.out.println("Nhập phần tử thứ  " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "phần từ trong mảng là : ", "");
        array(arr);

//        for (int j = 0; j < arr.length; j++) {
//            System.out.print(arr[j] + "\t");
//        }
        for (int j = 0; j < arr.length / 2; j++) {
            int temp = arr[j];
            arr[j] = arr[size - 1 - j];
            arr[size - 1 - j] = temp;
        }
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        array(arr);

    }

    static void array(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
