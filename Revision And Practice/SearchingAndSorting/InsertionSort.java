package SearchingAndSorting;

import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int size= s.nextInt();
        int[] arr= new int[size];
        for(int i=0;i<size;i++){
            arr[i]=s.nextInt();
        }
        insertionSort(arr,size);
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        s.close();
    }

    private static void insertionSort(int[] arr, int size) {
        if(size==1 || size==0){
            return;
        }

        //Iterate through the array and put the elements in its place 
        for(int i=1;i<size;i++){
            int k= i;
            while(k-1>=0 && arr[k]<arr[k-1]){
                int temp= arr[k];
                arr[k]=arr[k-1];
                arr[k-1]=temp;
                k--;
            }
        }
    }

    private static void insertionSortRecursive(int[] arr,int size){
        if(size<=1)
            return;

        insertionSortRecursive(arr,size-1);//[1,3,2,4,5]
        int i= size-1;
        int j = size-2;
        while(j>=0 && arr[i]<arr[j]){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] =temp;
            j--;
        }
    }
    
}
