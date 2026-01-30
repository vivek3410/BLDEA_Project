package Arrays;

public class Move0sAtEnd {
    
    public static void main(String[] args) {
        int[] arr = ArraysIO.input();

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

        ArraysIO.print(arr);
    }
}
