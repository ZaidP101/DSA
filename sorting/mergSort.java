import java.util.*;
public class mergSort{
    public static void MergSort(int[] arr, int low, int high){
        if(low>= high) return;
        int mid = (low + high)/2;
        MergSort(arr, low, mid);
        MergSort(arr, mid+1, high);
        Merg(arr, low, mid, high); 
    }
    public static void Merg(int[] arr, int low, int mid, int high){
        ArrayList<Integer> list = new ArrayList<>();
        int left =low;
        int right = mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                list.add(arr[left]);
                left++;
            }else{ 
                list.add(arr[right]);
               right++;
            }
        }
        while(left<=mid){
            list.add(arr[left]);
            left++;
        }
        while(right<=high){
            list.add(arr[right]);
            right++;
        }
        for(int i = low; i<=high; i++){
            arr[i] = list.get(i-low);
        }
    
    }
    public static void printArray(int[] arr){
        for(int num:arr){
            System.out.print(num +" ");      
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] array  = {54,7676,23,99,24,98,1,4,5,6};
        int n = array.length;
        System.out.println("Oringinal array : ");
        printArray(array);
        MergSort(array, 0, n-1);
        System.out.println("Sorted Array : ");
        printArray(array);
    }
}