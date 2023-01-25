import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] numToSplit = br.readLine().split(" ");

        int max = -1000000;
        int min = 1000000;
        for(int i=0; i< numToSplit.length; i++){
            int num = Integer.parseInt(numToSplit[i]);
            max = Math.max(num, max);
            min = Math.min(num, min);
        }
        System.out.println(min +  " " + max);
    }
}