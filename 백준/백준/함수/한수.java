package 백준.함수;

import java.util.*;

public class 한수 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        boolean[] num = new boolean[n+1];

        for(int i=1; i<n+1; i++){
            if(i<100) num[i] = true;
            else if(i==1000) break;
            else ArithmeticSequence(i, num);
        }
        for(int j=1; j<n+1; j++){
            // System.out.println(j+": "+num[j]);
            if(num[j]==true) 
                count++;
        }

        System.out.println(count);
    }

    public static void ArithmeticSequence(int n,boolean[] num){
        
        int arg[] = new int[3];
        int index = n;
        int k = 0;
        while(n>=1){
            arg[k] = n % 10;
            n /= 10;
            k++;
        }
        if(arg[0]-arg[1] == arg[1]-arg[2]){
            num[index] = true;
        }

    }   
}
