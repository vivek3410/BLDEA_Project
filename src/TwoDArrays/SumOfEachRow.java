package TwoDArrays;

public class SumOfEachRow {
    

    public static void main(String[] args) {
        int[][] arr = TwoDArrayIO.input();
        int colSize = arr[0].length;

        TwoDArrayIO.print(arr);


        for(int i = 0;i<arr.length;i++){
            int sum = 0;
            for(int j = 0;j<colSize;j++){
                sum = sum + arr[i][j];
            }
            System.out.println("Sum of row " + i + " is: " + sum);
        }

    }
}
