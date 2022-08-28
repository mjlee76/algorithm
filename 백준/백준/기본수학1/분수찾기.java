package 백준.기본수학1;

import java.util.*;

public class 분수찾기 {
    
    public static void main(String[] arg){
        
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        int cross_count = 1;
        int prev_count_sum = 0;

        while (true) {

			if (x <= prev_count_sum + cross_count) {	
				
				if (cross_count % 2 == 1) {				
					System.out.print((cross_count - (x - prev_count_sum - 1)) + "/" + (x - prev_count_sum));
					break;
				} 				
				else {
					System.out.print((x - prev_count_sum) + "/" + (cross_count - (x - prev_count_sum - 1)));
					break;
				}
			} 
            else {
				prev_count_sum += cross_count;
				cross_count++;
			}
        }
    }

}
