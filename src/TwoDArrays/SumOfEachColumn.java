package TwoDArrays;

public class SumOfEachColumn {
    
    public static void main(String[] args) {
        int[][] arr = TwoDArrayIO.input();
        int colSize = arr[0].length;
        TwoDArrayIO.print(arr);

        for(int j = 0;j<colSize;j++){
            int colSum = 0;
            for(int i = 0;i<arr.length;i++){
                colSum += arr[i][j];
            }
            System.out.println("Sum of column " + (j+1) + " is: " + colSum);
        }
    } 
}
