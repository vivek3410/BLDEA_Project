package OneDArrays;

public class LeftRoationByOne {
    
    public static void solution(int[] arr){

        int temp = arr[0];

        for(int i = 1;i<arr.length; i++){
            arr[i - 1] = arr[i];
        }

        arr[arr.length - 1] = temp;
    }


    public static void main(String[] args) {
        int[] arr = ArraysIO.input();

        solution(arr);

        ArraysIO.print(arr);
    }
}
