package bai1.minArray.src.com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Gia tri nho nhat la: "+ checkNumber() );
    }

    public static int checkNumber(){
        int[] arr = {10, 3, 2, 20, 7, 9, 6};
        int min = Integer.MAX_VALUE;
        for (int item : arr) {
            if (item < min) {
                min = item;
            }
        }
        return min;
    }
}
