package com.company;

public class Main {

    public static void main(String[] args) {
        int arr[] = {10, 80, 30, 90, 40, 50, 70};
        int index = arr.length;

        System.out.println("Mảng ban đầu:");
        printArray(arr);

        Main ob = new Main();
        ob.quickSort(arr, 0, index - 1);

        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr);
    }

    int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    static void printArray(int arr[]) {
        int index = arr.length;
        for (int i = 0; i < index; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
