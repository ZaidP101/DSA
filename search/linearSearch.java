import java.util.Scanner;
public class linearSearch{
    public static int LinearSearch(int[] arr, int targetElement){
        for(int i=0;  i<arr.length; i++){
            if(arr[i] == targetElement){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of Elements in the Array : ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the Elements in the Array : ");
        for(int i=0; i<size; i++){
            array[i] = input.nextInt();
        }
        System.out.println("Enter the Target Element : ");
        int targetElement = input.nextInt();

        int result = LinearSearch(array, targetElement);
        if(result!=1){
            System.out.println("Element found al index : "+result);
        }
        else{
            System.out.println("Element not found in the given array. ");
        }

        input.close();
        
    }
}
