package OneDArrays;

public class CheckSortedArray {

    public static boolean isSorted(int[] arr){

        for(int i = 1;i<arr.length;i++){
            if(arr[i] >= arr[i-1]){

            }else{
                return false;
            }
        }

        return true;
    }
    

    public static void main(String[] args) {

        int[] arr = ArraysIO.input();

        boolean result = isSorted(arr);

        if(result){
            System.out.println("Sorted");
        }else{
            System.out.println("Not Sorted");
        }
    }
}
