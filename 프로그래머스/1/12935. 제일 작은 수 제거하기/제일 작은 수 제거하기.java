import java.util.Arrays;

//최소값을 찾고 
//답 배열에 최소값이 아니라면 추가 하여 리턴

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        
        if(arr.length == 1) {
            answer[0] = -1;
            
             return new int[]{ -1 };
        }
        
        int min = arr[0];
        
        for(int num : arr){
            if (min > num) min = num;
        }
        
        int index = 0;
        for(int num : arr){
            if(num != min){
                answer[index++] = num;
            }
        }

        return answer;
    }
}