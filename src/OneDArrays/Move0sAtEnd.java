package OneDArrays;

public class Move0sAtEnd {

    public static void solution(int[] arr){
        int j = 0;
        // O(N)
        for(int i = 0;i<arr.length;i++){
            if(arr[i] != 0){
                arr[j++] = arr[i];
            }
        }

        while(j < arr.length){
            arr[j] = 0;
            j++;
        }
    }
    
    public static void main(String[] args) {
        int[] arr = ArraysIO.input();

        solution(arr);
        
        ArraysIO.print(arr);
    }
}
