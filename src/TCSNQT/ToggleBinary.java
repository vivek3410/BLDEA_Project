package TCSNQT;

public class ToggleBinary {

    public static void solution(int n){
        String binary = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();

        char[] arr = binary.toCharArray();

        for(int i = 0;i<arr.length;i++){
            if(arr[i] == '1'){
                sb.append("0");
            }else{
                sb.append("1");
            }
        }

        int result = Integer.parseInt(sb.toString(),2);
        System.out.println(result);
    }
    

    public static void main(String[] args) {
        solution(5);
    }
}
