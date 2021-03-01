import java.util.Scanner;
public class QuickSort {

    private static void display(int arr[],int n){
        for(int i:arr)
        System.out.print(i+" ");
        System.out.println();
    }
    private static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int partition(int arr[],int low,int high){
        int pivot = arr[high];
        int i = low-1;
        int j;
        for(j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,high);
        return i+1;
    }
    private static void quickSort(int arr[],int l,int h){
        if(l<h){
            int pivot = partition(arr,l,h);
            quickSort(arr, l, pivot-1);
            quickSort(arr, pivot+1, h);
        }
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();
        quickSort(arr,0,n-1);
        display(arr,n);
        sc.close();
    }
}
