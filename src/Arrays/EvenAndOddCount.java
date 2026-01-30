package Arrays;

public class EvenAndOddCount {
    

    public static void main(String[] args) {
        int arr[] = ArraysIO.input();

        int evenCount = 0;
        int oddCount = 0;

        for(int i = 0;i<arr.length;i++){
            if(arr[i] % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }

        System.out.println("Even Count: " + evenCount + " odd count " + oddCount);
    }
}
