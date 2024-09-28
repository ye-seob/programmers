import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String s = n + "";
        int[] arr = new int[s.length()];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            arr[i] = Character.getNumericValue(s.charAt(i));
        }
                Arrays.sort(arr);
         for (int i = arr.length - 1; i >= 0; i--) {  
            sb.append(arr[i]);
        }
        String str = sb.toString();
        
        return Long.parseLong(str);

    }
}