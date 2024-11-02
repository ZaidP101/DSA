public class slectionSort{
    public static void selectionsort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            int minindex = i;
            for(int j=i+1; j<n;j++){
                if(arr[minindex]>arr[j]){
                    minindex= j;
                }
            }
            int temp = arr[minindex];
            arr[minindex] = arr[i];
            arr[i]= temp;
        }
    }
    public static void printArray(int[] arr){
		for (int num : arr){
			System.out.print(num + " ");
		}
		System.out.println();
	}
	public static void main(String[] args){
		int[] arr = {64, 25, 12, 22, 11};
		System.out.println("Original array : ");
		printArray(arr);
		selectionsort(arr);
		System.out.println("Sorted array is : ");
		printArray(arr);
	}

}