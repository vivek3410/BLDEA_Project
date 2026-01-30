package Arrays;


public class CheckPalindromeArray {

    public static boolean isPlaindrome(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            if(arr[start] != arr[end]){
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    
    public static void main(String[] args) {
        
        int[] arr = ArraysIO.input();

        if(isPlaindrome(arr)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Plaindrome");
        }
    }
}
