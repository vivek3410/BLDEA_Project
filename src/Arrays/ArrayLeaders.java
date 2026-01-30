package Arrays;

public class ArrayLeaders {

    public static void solution(int[] arr){

        int max = Integer.MIN_VALUE;
        for(int i = arr.length - 1; i >= 0;i--){
            if(arr[i] >= max){
                System.out.print(arr[i] + " ");
                max = arr[i];
            }
        }

        System.out.println();
    }
    

    public static void main(String[] args) {
        int[] arr = ArraysIO.input();

        solution(arr);
    }
}
