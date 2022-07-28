package 백준.조건문;

import java.util.*;

public class 알람시계 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        if(M >= 45){
            M = M - 45;
            System.out.println(H+" "+M);
        } 
        else {
            if(H>0){
                M = 60 - (45 - M);
                H = H - 1;
                System.out.println(H+" "+M);
            }
            else{
                M = 60 - (45 - M);
                H = 23;
                System.out.println(H+" "+M);
            }
        }
    }
}
