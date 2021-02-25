import java.util.Scanner;
public class InsertionSort {
    private static void display(int arr[],int n){
        for(int i:arr)
        System.out.print(i+" ");
        System.out.println();
    }
    private static void insertionSort(int arr[],int n){
        for(int i=1;i<n;i++){
            int temp = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
            
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();
        insertionSort(arr,n);
        display(arr,n);
        sc.close();
    }
}
