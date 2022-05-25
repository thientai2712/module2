package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(findAvg());
    }
    public static Double findAvg() {
        Double[] arr = new Double[]{1.0, 3.0, 5.0, 7.0, 20.0};
        Double sum = 0d;
        Double avg = 0d;
        for(int i=0;i<arr.length;i++){
            sum+=i;
        }
        avg = sum/arr.length;
        return avg;
    }

}
