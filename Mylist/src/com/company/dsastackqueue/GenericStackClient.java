package com.company.dsastackqueue;

import static com.company.dsastackqueue.MyGenericStack.stackOfIStrings;
import static com.company.dsastackqueue.MyGenericStack.stackOfIntegers;

public class GenericStackClient {
    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        stackOfIStrings();
    }
}
