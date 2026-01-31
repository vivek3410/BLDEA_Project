package TwoDArrays;

public class LowerDiagonalElements {
    

    public static void main(String[] args) {
        int[][] arr = TwoDArrayIO.input();

        int row = arr.length;
        int col = arr[0].length;

        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                if(i > j){
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
