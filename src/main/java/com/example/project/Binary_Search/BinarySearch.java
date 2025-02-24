package com.example.project.Binary_Search;

public class BinarySearch {
    // implements binary search on the elements list for target,
    // and returns the index at which the target is found, or -1 if
    public static int binarySearch(int[] elements, int target) {
        // int loopCounter = 0; // for testing
        int leftIdx = 0; 
        int rightIdx = elements.length-1; 

        while (leftIdx<=rightIdx) {  
        //     loopCounter++; // for testing
        //     System.out.print(loopCounter + " "); // for testing
        int middleIdx = ((rightIdx-leftIdx)/2)+leftIdx;  
        if (elements[middleIdx]==target) {return middleIdx;}
        if (elements[middleIdx] < target)
            leftIdx = middleIdx + 1;

        else
            rightIdx = middleIdx - 1;

        }
        return -1; // not found
    }
}
