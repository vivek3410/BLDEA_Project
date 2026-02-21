package TCSNQT;

public class ChoclateGame {

    public static void solution(int[] arr){

        int count = 0;

        for(int i = 0;i<arr.length;i++){
            if(arr[i] != 0){
                arr[count++] = arr[i];
            }
        }

        for(int i = count;i<arr.length;i++){
            arr[i] = 0;
        }

        for(int elt:arr){
            System.out.print(elt + " ");
        }
    }
    

    public static void main(String[] args) {
        int[] arr = {4,2,0,0,3,5,1,0};

        solution(arr);
    }
}
