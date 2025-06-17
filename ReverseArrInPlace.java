public class ReverseArrInPlace {
    
   static void reverseArrayInPlace(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left<right) {
            
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 40, 50};
        reverseArrayInPlace(myArray);
        System.out.println("After reversing:");
        printArray(myArray);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.println(num + " ");
        }
       }
}
