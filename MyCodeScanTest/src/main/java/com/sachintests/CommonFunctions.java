package com.sachintests;

import java.io.File;
import java.util.Arrays;

public class CommonFunctions {

    // Array Index out of bound
    public static void performArrayIteration(int[] myArray) {
        for(int index = 0; index < myArray.length; index++) {
            myArray[index] = index * 2;
        }
    }
    // In correct API usage results in files with empty names
    public static File performIncorrectAPIUsage(String filename){
        if(null != filename && !filename.isEmpty() ){
            return new File(filename);
        }
        return null;
    }
    public static boolean areEqual(int[] array1, int[] array2){
        Object[] arr1 = {array1};
        Object[] arr2 = {array2};
        return Arrays.deepEquals(arr1, arr2);
    }

}