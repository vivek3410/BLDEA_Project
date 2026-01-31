package OneDArrays;

public class SumOfElements {

    public static int sum(int[] arr){
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            sum = sum + arr[i];
        }

        return sum;
    }
    

    public static void main(String[] args) {
        int[] arr = ArraysIO.input();
        int result = sum(arr);

        System.out.println("Sum of Elements " + result);
    }
}
