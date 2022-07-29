// package 백준.반복문;

// import java.util.*;

// public class 에이쁠비 {
//     public static void main(String args[]){

//         Scanner sc = new Scanner(System.in);

//         while(sc.hasNextInt()){

//             int A = sc.nextInt();
//             int B = sc.nextInt();

//         }
//         System.out.println(A+B);
//     }
// }

package 백준.반복문;

import java.io.*;
import java.util.*;

public class 에이쁠비 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        String str;

        while((str=br.readLine())!=null){

            st = new StringTokenizer(str," ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(a+b).append("\n");

        }
        System.out.println(sb);
    }
}
