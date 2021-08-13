/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fga.jp.section304;
import java.util.*;
import java.lang.*;

/**
 *
 * @author Ay
 */
public class Lesson304 {
    public static void main(String[ ] args) {
        
        Lesson304 ob = new Lesson304();
        
        //SELECTION SORT
                
        int arr1[] = {64,25,12,22,11};

//        ob.selectionsort(arr1);
//        System.out.println("Sorted array");
//        ob.printArray(arr1);
        
        //BUBLE SORT
        
//        int arr2[] = {64, 34, 25, 12, 22, 11, 90};
//        //34 64 25 12 22 11 90
//        //34 25 64 12 22 11 90
//        ob.bubbleSort(arr2);
//        System.out.println("Sorted array");
//        ob.printArray(arr2);
        
        //MERGE SORT
        
//        int arr3[] = { 12, 11, 13, 5, 6, 7 };
// 
//        System.out.println("Given Array");
//        ob.printArray(arr3);
// 
//        ob.mergesort(arr3, 0, arr3.length - 1);
// 
//        System.out.println("\nSorted array");
//        ob.printArray(arr3);
        
        //SEQUENTIAL SEARCH
        
//        int arr4[] = { 9, 7, 10, 6, 10 };
//        int n = arr4.length;
//        
//        // 9 7 10
//        // Element to search
//        int k = 10;
//        SequentialSearch(arr4, n, k);
        
        //BINARY SEARCH
        
        int arr5[] = { 2, 3, 4, 10, 40 };
        int n = arr5.length;
        int x = 10;
        int result = ob.binarySearch(arr5, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
    
    void selectionsort(int arr[])
    {
        int n = arr.length;
 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    
    void bubbleSort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
    
    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    void merge(int arr[], int l, int m, int r)
    {
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;
 
        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
 
        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
 
        /* Merge the temp arrays */
 
        // Initial indexes of first and second subarrays
        int i = 0, j = 0;
 
        // Initial index of merged subarry array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
 
    // Main function that sorts arr[l..r] using
    // merge()
    void mergesort(int arr[], int l, int r)
    {
        if (l < r) {
            // Find the middle point
            int m =l+ (r-l)/2;
 
            // Sort first and second halves
            mergesort(arr, l, m);
            mergesort(arr, m + 1, r);
 
            // Merge the sorted halves
            merge(arr, l, m, r);
        }
    }
    
    // Prints the array
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    static void SequentialSearch(int arr[], int n,
                                        int k)
    {
        int elements[] = new int[20];
        int indices[] = new int[20];
        int temp, i;
        int j = 0, ind = 0, start = 0, end = 0, set = 0;
        for (i = 0; i < n; i += 3) {
 
            // Storing element
            elements[ind] = arr[i];
 
            // Storing the index
            indices[ind] = i;
            ind++;
        }
        if (k < elements[0]) {
            System.out.println("Not found");
            return;
        }
        else {
            for (i = 1; i <= ind; i++)
                if (k <= elements[i]) {
                    start = indices[i - 1];
                    set = 1;
                    end = indices[i];
                    break;
                }
        }
        if (set == 0) {
            start = indices[i - 1];
            end = n;
        }
        for (i = start; i <= end; i++) {
            if (k == arr[i]) {
                j = 1;
                break;
            }
        }
        if (j == 1)
            System.out.println("Found at index " + i);
        else
            System.out.println("Not found");
    }
    
    int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;
  
            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;
  
            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
  
            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }
  
        // We reach here when element is not present
        // in array
        return -1;
    }
}
