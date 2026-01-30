package Arrays;

public class LeftRoationByK {

    // TC: O(k) + O(n-k) + O(k) = O(n+k); SC: O(k)
    public static void bruteForce(int[] arr, int k){
        int n = arr.length;
        k = k % n;

        int[] temp = new int[k];

        // step 1: Storing the k values
        for(int i = 0;i<k;i++){
            temp[i] = arr[i];
        }

        // Step 2: Moving Elements to left
        for(int i = k;i<n;i++){
            arr[i-k] = arr[i];
        }

        int j = 0;
        // step 3: Putting back
        for(int i = n - k;i<n;i++){
            arr[i] = temp[j];
            j++;
        }
    }
    
    public static void reverse(int[] arr,int start,int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void optimalSolution(int[] arr,int k){
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
        reverse(arr, 0, n-1);
    }


    public static void main(String[] args) {
        
        int[] arr = ArraysIO.input();

        // bruteForce(arr, 12);
        optimalSolution(arr, 12);

        ArraysIO.print(arr);
    }
}
