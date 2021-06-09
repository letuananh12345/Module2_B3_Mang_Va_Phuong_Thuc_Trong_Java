package B4_TH_Chuyen_Doi_Nhiet_Do;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int choice ;
        do {
            System.out.println("Menu : ");
            System.out.println("1. Độ F sang Độ C : ");
            System.out.println("2. Độ C sang Độ F : ");
            System.out.println("0. Exit");
            System.out.println("Nhập lựa chọn : ");
            choice = input.nextInt();
            double a;
            double b;
            switch (choice){
                case 1:
                    System.out.println("Nhập độ F : ");
                     a = input.nextDouble();
                    System.out.println(" Độ C là :" + doFSangDoC(a));

                    break;
                case 2:
                    System.out.println("Nhập độ C :");
                     b = input.nextDouble();
                    System.out.println(" Độ F là : " + doCSangDoF(b));
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }
        }while (true);
    }
    public static double doCSangDoF(double doC){
        double dof =  doC / ((5.0/9) + 32);
        return  dof;
    }
    public static double doFSangDoC(double doF){
        double doC= ((5.0/9)*(doF - 32));
        return  doC;
    }

}
