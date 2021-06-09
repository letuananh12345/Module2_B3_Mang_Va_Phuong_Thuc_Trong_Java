package B5_TH_Tim_Gia_Tri_Nho_Nhat_Trong_Mang_Dung_PT;

public class Main {
    public static void main(String[] args) {

        int[] arr = {4, 6, 9, 23, 3, 67, 1, 15};
        int index = minValue(arr);
        System.out.println("giá trị nhỏ nhất trong mảng là : " + arr[index]);

    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }

        }
        return index;
    }
}
