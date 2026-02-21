package TCSNQT;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AppearedEvenTimes {

    public static void solution(int[] arr){
        int size = arr.length;
        Map<Integer,Integer> map = new HashMap<>();

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        for(int i = 0;i<size;i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0) + 1);
        }

        // System.out.println(map.keySet());
        for(Integer entry : map.keySet()){
            // apperad even times
            if(map.get(entry) % 2 == 0){
                list1.add(entry);
            }

            // appeard more than one
            if(map.get(entry) > 1){
                list2.add(entry);
            }
        }

        System.out.println("Appeared Even times: " + list1);
        System.out.println("Appeared More than one: "+ list2);

    }
    

    public static void main(String[] args) {
        int[] arr = {1,1,2,3,2,3,3,4};

        solution(arr);
    }
}
