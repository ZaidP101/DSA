public class quickSort{
    public static void QuickSort(int[] arr, int start, int end){
        if(end <= start) return;
        int pivot = partition(arr, start, end);
        QuickSort(arr, start, pivot-1);
        QuickSort(arr, pivot+1, end);
    }
    public static int partition(int[] arr, int start, int end){
        int pivot = arr[end];
        int i = start -1;
        for(int j=start; j<=end; j++){
            if(pivot>arr[j]){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[end];
        arr[end] = temp;
        return i;
    }
    
    
    
    public static void printArray(int[] arr){
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] array = {34,544,2121,43,1,3,77,2,9,6,5,};
        System.out.println("Original Array : ");
        printArray(array);
        QuickSort(array, 0, array.length-1);
        System.out.println("Sorted Array : ");
        printArray(array);
    }
}


