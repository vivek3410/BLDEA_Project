package TwoDArrays;

public class Maximum {
    
    public static void main(String[] args) {
        int[][] arr = TwoDArrayIO.input();
        int colSize = arr[0].length;

        int max = arr[0][0];

        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<colSize;j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }

        System.out.println("max: " + max);
    }
}
