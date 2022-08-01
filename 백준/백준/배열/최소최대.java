package 백준.배열;

import java.util.*;

public class 최소최대 {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] num = new int[count];

        for(int i=0; i<count; i++){
            num[i] = sc.nextInt();
        }
        
        int max = num[0];
        int min = num[0];

        for(int j=0; j<num.length; j++){
            if(min > num[j])
                min = num[j];
            if(max < num[j])
                max = num[j];
        }
        System.out.println(min+" "+max);
    }
}
