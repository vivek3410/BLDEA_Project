package TCSNQT;

public class Serverty {

    public static void solution(int[] arr){

        int zeros = 0;
        int ones = 0;
        int twos = 0;
        int threes = 0;

        for(int i : arr){
            if(i == 0){
                zeros++;
            }else if(i == 1){
                ones++;
            }else if(i == 2){
                twos++;
            }else if(i == 3){
                threes++;
            }
        }

        int i = 0;

        while(i < arr.length){
            while(zeros > 0){
                arr[i] = 0;
                zeros--;
                i++;
            }

            while(ones > 0){
                arr[i] = 1;
                ones--;
                i++;
            }

            while(twos > 0){
                arr[i] = 2;
                twos--;
                i++;
            }

            while(threes > 0){
                arr[i] = 3;
                threes--;
                i++;
            }
        }

        for(i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }


        System.out.println();

    }
    

    public static void main(String[] args) {
        int[] arr = {1,3,2,0,0,2};

        solution(arr);
    }
}
