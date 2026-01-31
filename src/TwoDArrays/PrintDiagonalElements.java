package TwoDArrays;

public class PrintDiagonalElements {
    
    public static void main(String[] args) {
        int[][] arr = TwoDArrayIO.input();
        int colSize = arr[0].length;

        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<colSize;j++){
                if(i == j){
                    System.out.print(arr[i][j] + " ");
                }
            }
        }

        System.out.println();
    }
}
