package OneDArrays;

import java.util.Arrays;

public class MergeTwoSortedArrays {

    public static int[] solution(int[] arr1, int[] arr2){

        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] result = new int[n1 + n2];
        int i = 0, j = 0, k = 0;

        while(i < n1 && j < n2){
            if(arr1[i] < arr2[j]){
                result[k] = arr1[i];
                i++;
            }else{
                result[k] = arr2[j];
                j++;
            }
            k++;
        }

        while(i < n1) {
            result[k] = arr1[i];
            i++;
            k++;
        }

        while(j < n2){
            result[k] = arr2[j];
            j++;
            k++;
        }

        return result;
    }
    

    public static void main(String[] args) {
        
        int[] arr1 = ArraysIO.input();
        int[] arr2 = ArraysIO.input();

        Arrays.sort(arr1);
        Arrays.sort(arr2);


        int[] result = solution(arr1, arr2);

        ArraysIO.print(result);
    }
}
