package com.sachintests;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Hello world!");

        // Array Initialization Test
        int[] myArray = new int[10];
        CommonFunctions.performArrayIteration(myArray);

        // Incorrect API Usage
        String fileName = "";
        CommonFunctions.performIncorrectAPIUsage(fileName);

        // Incorrect Equality Check
        int[] myArray1 = {1,2,3,4,5};
        int[] myArray2 = {6,7,8,9};
        System.out.println("Are Equal Response is " + CommonFunctions.areEqual(myArray1, myArray2));

        // Serialization without default constructor
        FileOutputStream fileOutputStream = new FileOutputStream("temp.bin");
        ObjectOutputStream os = new ObjectOutputStream(fileOutputStream);
        SomeRecord rec = new SomeRecord("Test");
        rec.WriteSomeRecord(os);

        // Calling run instead of start
        ThreadTest tt = new ThreadTest();
        tt.run();
    }
}