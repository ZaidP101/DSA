// Given an array arr[]. The task is to find the largest element and return it.
class Solution {
    public static int largest(int[] arr) {
        // code here
        int large = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>large){
                large = arr[i];
            }
        }return large;
    }
}


// Given an array of positive integers arr[], return the second largest element from the array. If the second largest element doesn't exist then return -1.
class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int large = arr[0];
        int small = -1;
        for(int i=1; i<arr.length; i++){
            if(arr[i]>large){
                small = large;
                large = arr[i];
            }else if(arr[i]>small && arr[i]!=large){
                small = arr[i];
            }
        }return small;
    }
}

// 
