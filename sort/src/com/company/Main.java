package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Map<Integer, Product> map = new HashMap<>();
        map.put(2, new Product(2, "Banh Ngot", 100000));
        map.put(1, new Product(1, "Banh Su Kem", 10000));
        map.put(4, new Product(4, "Banh Kem", 150000));
        map.put(3, new Product(3, "Banh My", 19000));
//        Set<Integer> set = map.keySet();
//        for (Integer key : set) {
//            System.out.println("Key Set= "+ key +" "+map.get(key));
//    }
//        //khởi tạo mảng chứa keys
//        Integer[] keys = new Integer[map.keySet().size()];
//        //ném keys vào một mảng
//        map.keySet().toArray(keys);
//        System.out.println(Arrays.toString(keys));
//        //sắp xếp keys
//        bubbleSort(keys);
//        System.out.println(Arrays.toString(keys));
//        //tìm kiếm theo index của keys
//        int index = binarySearch(keys, 120);
//        int key = keys[index];
//        Product product = map.get(key);
//        System.out.println(product);
        Integer[] keys = new Integer[map.keySet().size()];
        map.keySet().toArray(keys);
        System.out.println(Arrays.toString(keys));
        bubbleSort(keys);
        System.out.println(Arrays.toString(keys));
        int index = binarySearch(keys, 1);
        int key = keys[index];
        Product product = map.get(key);
        System.out.println(product);
    }
    public static int binarySearch(Object[] keys, int x) {
        int left = 0;
        int right = keys.length;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if ((int) keys[mid] == x)
                return mid;
            if (x > (int) keys[mid])
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }
    public static void bubbleSort(Integer[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    //if (array[j].compareTo(array[j + 1]) < 0) {
                    int x = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = x;
                }
            }
        }
    }


}
