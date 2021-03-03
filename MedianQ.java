import java.util.Scanner;
import java.util.Random;
public class MedianQ{
    
    private static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private static void randomize(int arr[],int l,int h){
        int n = h - l + 1;
        Random random = new Random();
        int temp = l + random.nextInt(arr.length)%n;
        swap(arr,temp,h);
    }
    
    private static int partition(int arr[],int l,int h){
        int pivot = arr[h];
        int i=l-1;
        int j;
        for(j=l;j<h;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,h);
        return i+1;
    }

    private static void quickSort(int arr[],int l,int h,int k){
        if(l<h){
            randomize(arr,l,h);
            int pivot = partition(arr,l,h);
            if(pivot == k)
            System.out.println(arr[k]);
            else if(pivot < k )
            quickSort(arr,pivot+1,h,k);
            else
            quickSort(arr,l,pivot-1,k);
        }
    }
    
    private static void findMedian(int arr[],int n){
        int k = (int)Math.ceil(n/2);
        quickSort(arr,0,n-1,k);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();
        findMedian(arr,n);
        sc.close();
    }
}
