public class insertionSort{
    public static void InsertionSort(int[]arr){
        int n = arr.length;
        for(int i=1; i<n; i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }
    public static void printArray(int[]arr){
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
    public static void main(String[]args){
        int[] array = {232,4555,6676766,54,2,6,77,99087,65};
        printArray(array);
        InsertionSort(array);
        printArray(array);
    }
}