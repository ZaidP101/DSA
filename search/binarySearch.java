public class binarySearch{
    public static int bs(int[] arr, int target, int size){
        int start = 0;
        int end = size-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else {end = mid-1;}
        }
        return -1;
    }
    public static void main(String args[]){
        int[] array = {22,33,44,55,66,77,88,99};
        int size = array.length;
        int target = 88;
        int result = bs(array, target, size);
        if(result!=-1){
            System.out.println("result"+result);
        }
        else{
            System.out.println("not");
        }
    }
}