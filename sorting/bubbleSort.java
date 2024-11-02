public class bubbleSort{
    public static void BubbleSort(int[] arr){
        int size = arr.length;
        boolean swap;
        for(int i=0; i<size-1; i++){
            swap = false;
            for(int j=0; j<size-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if(swap!=true){
                break;
            }
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
        System.out.println("Oringinal array : ");
        printArray(array);
        BubbleSort(array);
        System.out.println("Sorted Array : ");
        printArray(array);
    }
}