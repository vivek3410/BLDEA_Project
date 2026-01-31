package OneDArrays;

public class SecondSmallest {

    public static int bruteForce(int[] arr){
        int smallest = Minimum.better(arr);
        int sSmallest = Integer.MAX_VALUE;

        for(int i = 0;i<arr.length;i++){
            if(arr[i] < sSmallest && arr[i] != smallest){
                sSmallest = arr[i];
            }
        }
        return sSmallest;
    }

    public static int better(int[] arr){
        int smallest = Integer.MAX_VALUE;
        int sSmallest = Integer.MAX_VALUE;

        for(int i = 0;i<arr.length;i++){
            if(arr[i] < smallest){
                sSmallest = smallest;
                smallest = arr[i];
            }else if(arr[i] < sSmallest && arr[i] != smallest){
                sSmallest = arr[i];
            }
        }

        return sSmallest;
    }
     

    public static void main(String[] args) {
        int[] arr = ArraysIO.input();

        // int result = bruteForce(arr);
        int result = better(arr);
        

        System.out.println("Second Smallest: " + result);
    }
}
