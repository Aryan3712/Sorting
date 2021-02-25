import java.util.Scanner;

public class SelectionSort {

    private static void display(int arr[],int n){
        for(int i:arr)
        System.out.print(i+" ");
    }
    private static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private static void selectionSort(int arr[],int n){
        for(int i=0;i<n-1;i++){
            int swaps=0;
            int min = arr[i];
            int pos = i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<min){
                    min = arr[j];
                    pos = j;
                }
            }
            if(min!=pos){
                swap(arr,pos,i);
                display(arr, n);
                swaps++;
            }
            System.out.println("i "+i+"swaps "+swaps);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();
        selectionSort(arr,n);
        display(arr,n);
        sc.close();
    }
}
