package 백준.배열;

import java.util.*;

public class 최댓값 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int num[] = new int[9];

        for(int i=0; i<9; i++)
            num[i] = sc.nextInt();

        int MAX = num[0];
        int count = 1;
        
        for(int j=1; j<9; j++){
            if(num[j] > MAX){
                MAX = num[j];
                count = j+1;
            }
            else continue;
        }

        System.out.println(MAX+"\n"+count);

    }
    
}
