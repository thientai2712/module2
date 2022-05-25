package bai1.maxArray.src.com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Gia tri lon nhat la: "+ checkNumber() );
    }

    public static int checkNumber(){
        int [] array = {1,6,7,9,0,7,4,11};
        int max = Integer.MIN_VALUE;
        for (int item : array){
            if (item > max){
                max = item;
            }
        }
        return max;
    }
}
