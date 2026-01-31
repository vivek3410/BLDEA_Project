package TwoDArrays;

public class SumOfElements {
    public static void main(String[] args) {
        int[][] arr = TwoDArrayIO.input();
        int colSize = arr[0].length;

        int sum = 0;

        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<colSize;j++){
                sum = sum + arr[i][j];
            }
        }

        System.out.println("Sum: " + sum);
    }
}
