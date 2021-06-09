package B2_TH_Tim_Gia_Tri_Trong_Mang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String [] sinhVien = {"nam","quan","tam","hieu","nam","truong"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên cần tìm : ");
        String timTen = sc.nextLine();
        boolean isExitst = false;
        for(int i =0;i<sinhVien.length;i++){
            if(sinhVien[i].equals(timTen)){
                System.out.println(timTen + " ở vị trí thứ "+ i);
                isExitst = true;
//                break;
            }
        }
        if(!isExitst){
            System.out.println(timTen + " không có trong mảng ");
        }
    }
}
