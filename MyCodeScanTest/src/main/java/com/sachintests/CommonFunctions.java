package com.sachintests;

import java.io.File;

public class CommonFunctions {

    // Array Index out of bound
    public static void performArrayIteration(int[] myArray) {
        for(int index = 0; index <= myArray.length; index++) {
            myArray[index] = index * 2;
        }
    }
    // In correct API usage results in files with empty names
    public static File performIncorrectAPIUsage(String filename){
        if(null != filename && filename.length() >= 0 ){
            return new File(filename);
        }
        return null;
    }
    public static boolean areEqual(int[] array1, int[] array2){
        return array1.equals(array2);
    }

}