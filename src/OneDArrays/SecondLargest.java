package OneDArrays;

public class SecondLargest {

    // TC: O(n) + O(n) = O(2n)
    public static int bruteForce(int[] arr){
        int largest = Maximum.better(arr);
        int sLargest = Integer.MIN_VALUE;

        for(int i = 0;i<arr.length;i++){
            if(arr[i] < largest && arr[i] > sLargest){
                sLargest = arr[i];
            }
        }

        return sLargest;
    }


    // TC: O(n) SC: O(1)
    public static int better(int[] arr){
        int largest = Integer.MIN_VALUE;
        int sLargest = Integer.MIN_VALUE;

        for(int i = 0;i<arr.length;i++){
            if(arr[i] > largest){
                sLargest = largest;
                largest = arr[i];
            }else if(arr[i] > sLargest && arr[i] != largest ){
                sLargest = arr[i];
            }
        }

        return sLargest;
    }
    

    public static void main(String[] args) {
        int[] arr = ArraysIO.input();

        // int result = bruteForce(arr);
        int result = better(arr);

        System.out.println("Second Largest " + result);
    }
}

