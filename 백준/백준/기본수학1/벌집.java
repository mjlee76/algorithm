package 백준.기본수학1;

import java.util.*;

public class 벌집 {

    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int prev_count_sum = 1;
        int circle_count = 0;

        while(true){
            // if(N==prev_count_sum)
            //     System.out.print((prev_count_sum/6)+1);
            if(prev_count_sum < N && N <= prev_count_sum + circle_count){
                System.out.print((circle_count/6)+1);
                break;
            }
            else{
                prev_count_sum += circle_count;
                circle_count += 6;
            }
        }
    }
    
}
