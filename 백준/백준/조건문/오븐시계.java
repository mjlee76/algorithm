package 백준.조건문;

import java.util.*;

public class 오븐시계 {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
        int T = sc.nextInt();

        if(0<=H && H<=23 && 0<=M && M<=59 && 0<=T && 0<=1000){
            H += T / 60;
            if(H>=24){
                H = H - 24;
            }
            M += T % 60;
            if(M>=60){
                H++;
                M = M - 60;
            }
            System.out.println(H % 24+" "+M);
        }
    }
}
