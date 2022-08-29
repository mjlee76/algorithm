package 백준.기본수학2;

import java.util.*;

public class 소수찾기 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int num[] = new int[N];
        for(int i=0; i<N; i++){
            num[i] = sc.nextInt();
        }
        int count = 0;
        for(int i=0; i<num.length; i++){
            if(num[i]==2) count++;
            if(num[i]%2!=0 && num[i]%3!=0)
                count++;
        }
        System.out.println(count);
    }
    
}
