public class MergeArr{
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {3,2,3};
        int[] merge = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            merge[i] = arr1[i];
        }
            for (int i = 0; i < arr2.length; i++) {
                merge[i + arr1.length] = arr2[i];
            }
            for(int i =0;i<arr1.length+arr2.length;i++)
            System.out.println(merge[i]);

        }
}