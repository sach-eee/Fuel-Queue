// Java program for implementation of Insertion Sort

import java.util.Scanner; 
class InsertionSort {
    /*Function to sort array using insertion sort*/
    void sort(int ab[])
    {
        int n = ab.length;
        for (int i = 1; i < n; ++i) {
            int key = ab[i];
            int j = i - 1;
  
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && ab[j] > key) {
                ab[j + 1] = ab[j];
                j = j - 1;
            }
            ab[j + 1] = key;
        }
    }

      static void get_array(int ab[]){

        Scanner sc=new Scanner(System.in);  
        int  n;
        n=sc.nextInt();  

        int[] array = new int[10];  
        System.out.println("Enter the elements of the array: ");  
        for(int i=0; i<n; i++)  
        {  
        //reading array elements from the user   
        array[i]=sc.nextInt();  
        }  
        }
  
    /* A utility function to print array of size n*/
    static void printArray(int ab[])
    {
        int n = ab.length;
        for (int i = 0; i < n; ++i)
            System.out.print(ab[i] + " ");
  
        System.out.println();
    }
  

    int[] ab;
    // Driver method
    public static void main(String args[])
    {
        int arr[] = { 12, 11, 13, 5, 6 };

       
        get_array();
        
        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
  
        printArray(arr);
    }
} /* This code is contributed by Rajat Mishra. */