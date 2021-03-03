import java.util.Scanner;
import java.util.Random;
public class Randomize {
    public static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void randomization(int arr[],int l,int h){
        Random random = new Random();
        int n = h - l + 1;
        int temp = l + random.nextInt(arr.length)%n;
        swap(arr,temp,h);
    }

    public static int partition(int arr[],int l,int h){
        int pivot = arr[h];
        int i=l-1;
        int j;
        for(j=l;j<h;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,j);
        return i+1;
    }

    public static void randomizedQuickSort(int arr[],int l,int h){
        if(l<h){
            randomization(arr,l,h);
            int pivot = partition(arr,l,h);
            randomizedQuickSort(arr, l, pivot-1);
            randomizedQuickSort(arr, pivot+1, h);
        }
    }

    private static void display(int arr[],int n){
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();
        randomizedQuickSort(arr,0,n-1);
        display(arr,n);
        sc.close();
    }
}
