import java.util.*;
class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        arrayA = reverseOrder(arrayA);
        arrayB = reverseOrder(arrayB);
        int a = arrayA[0];
        int b = arrayB[0];
        for(int i=1; i<arrayA.length; i++){
            a = gcd(a, arrayA[i]);
            b = gcd(b, arrayB[i]);
        }

        if(a == 1 && b == 1){
            answer = 0;
        }else if(a != 1 && b != 1){
            a = iterator(arrayB, a);
            b = iterator(arrayA, b);
            if(a == 0){
                answer = b;
            }else if(b == 0){
                answer = a;
            }else{
                answer = Math.max(a, b);
            }
        }else if(a == 1){
            answer = iterator(arrayA, b);
        }else if(b == 1){
            answer = iterator(arrayB, a);
        }
        return answer;
    }
    
    public int gcd(int f, int g){
        if(g == 0){
            return f;
        }
        return gcd(g, f%g);
    }
    
    public int[] reverseOrder(int[] arr){
        int[] tmp = new int[arr.length];
        int idx = 0;
        for(int i=arr.length-1; i>=0; i--){
            tmp[idx] = arr[i];
            idx++;
        }
        return tmp;
    }
    public int iterator(int[] arr, int n){
        for(int i=0; i< arr.length; i++){
            if(arr[i] % n == 0){
                return 0;
            }
        }
        return n;
    }
}