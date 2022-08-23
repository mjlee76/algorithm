package 백준.문자열;

import java.util.*;

public class 숫자의합 {    
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = sc.next();

        int sum=0;

        for(int i=0; i<n; i++){
            int num = a.charAt(i)-'0';
            sum += num;
        }
        System.out.println(sum);
    }
}
