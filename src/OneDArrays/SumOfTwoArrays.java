package OneDArrays;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        
        int maxSize = 5;
        int[] arr1 = ArraysIO.input();
        int[] arr2 = ArraysIO.input();
        int[] result = new int[maxSize];

        for(int i = 0;i<maxSize;i++){
            result[i] = arr1[i] + arr2[i];
        }

        System.out.print("Sum Of Corresponding Elements: ");

        ArraysIO.print(result);
    }
}
