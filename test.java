////////////////////////////////////////////// Linear Search //////////////////////////////////////////////
// import java.util.Scanner;
// public class test{
//     public static int linearsearch(int[] arr, int target){
//         for(int i=0; i<arr.length; i++){
//             if(arr[i]==target){
//                 return i;
//             }      
//         }
//         return -1;
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("length?");
//         int size = sc.nextInt();
//         int[] array = new int[size];
//         System.out.println("elements : ");
//         for(int i=0;i<size;i++){
//             array[i] = sc.nextInt();
//         }
//         System.out.println("target?");
//         int target = sc.nextInt();
//         int result = linearsearch(array,target);
//         if(result!=-1){
//             System.out.println("result"+result);
//         }
//         else{System.out.println("not foud");}
//         sc.close();
//     }
// }


////////////////////////////////////////////// BinarySearch //////////////////////////////////////////////
// public class test{
//     public static int binaryS(int[] arr, int target){
//         int start = 0;
//         int end = arr.length-1;
//         while(end>=start){
//             int mid = start+(end-start)/2;
//             if(arr[mid]==target){
//                 return mid;
//             }
//             else if(target>arr[mid]){
//                 start = mid+1;
//             }
//             else {end = mid-1;}
//         }
//         return -1;
//     }
//     public static void main(String[] args){
//         int[] array = {22,44,66,88,99,101};
//         int target = 44;
//         int result = binaryS(array,target);
//         if(result!=-1){
//             System.out.println("result"+result);
//         }
//         else{
//             System.out.println("not");
//         }
//     }
// }


////////////////////////////////////////////// Bubble Sort //////////////////////////////////////////////
// public class test{
//     public static void bbs(int[] arr){
//         int n = arr.length;
//         boolean swap;
//         for(int i=0; i<n-1; i++){
//             swap = false;
//             for(int j=0; j<n-1; j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1]= temp;
//                     swap = true;
//                 }
//             }
//             if(swap!=true){
//                 break;
//             }
//         }
//     }
//     public static void printArray(int[] arr){
//         for(int num: arr){
//             System.out.print(num + " ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args){
//         int[] arr = {64, 24, 25, 12, 22, 11, 90};
// 		System.out.println("Oringinal array : ");
// 		printArray(arr);
// 		bbs(arr);
// 		System.out.println("Sorted Array : ");
// 		printArray(arr);
//     }

// }

////////////////////////////////////////////// Selection Sort //////////////////////////////////////////////
// public class test{
//     public static void selectionsort(int[] arr){
//         int n = arr.length;
//         for(int i=0; i<n; i++){
//             int minindex = i;
//             for(int j=i+1; j<n; j++){
//                 if(arr[minindex]>arr[j]){
//                     minindex = j;
//                 }
//             }
//             int temp = arr[minindex];
//             arr[minindex] = arr[i];
//             arr[i]= temp; 
//         }
//     }
//     public static void printArray(int[]arr){
//         for(int num: arr){
//             System.out.print(num+" ");
//         }
//         System.out.println();
        
//     }
//     public static void main(String[] args){
//         int[] array = {34,434,345,6,67,67,7};
//         printArray(array);
//         selectionsort(array);
//         printArray(array);
//     }
// }

////////////////////////////////////////////// Insertion Sort //////////////////////////////////////////////
// import java.util.Scanner;
// public class test{
//     public static void insertionSort(int[] arr){
//         int n = arr.length;
//         for(int i=1;i<n;i++){
//             int key = arr[i];
//             int j = i-1;
//             while(j>=0 && arr[j]>key){
//                 arr[j+1]=arr[j];
//                 j--;
//             }
//             arr[j+1] = key;
//         }
//     }
//     public static void printArray(int[]arr){
//         for(int num : arr){
//             System.out.print(num+" ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("no. of elements : ");
//         int size = sc.nextInt();
//         int[] array = new int[size];
//         System.out.println("elements : ");
//         for(int i=0;i<size;i++){
//             array[i] = sc.nextInt();
//         }
//         printArray(array);
//         insertionSort(array);
//         printArray(array);
//     }
// }

////////////////////////////////////////////// Insertion Sort //////////////////////////////////////////////
