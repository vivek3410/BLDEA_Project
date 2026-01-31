package TwoDArrays;

public class SumOfTwoArrays {
    
    public static void main(String[] args) {
        int[][] arr1 = TwoDArrayIO.input();
        int[][] arr2 = TwoDArrayIO.input();
        
        int rowSize = arr1.length;
        int colSize = arr1[0].length;
        int[][] result = new int[rowSize][colSize];

        for(int i = 0;i<rowSize;i++){
            for(int j = 0;j<colSize;j++){
                result[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        TwoDArrayIO.print(result);
    }
}
