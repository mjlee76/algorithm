package 백준.문자열;

import java.util.*;

public class 알파벳찾기 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int[] arr = new int[26];
        for(int i=0; i<arr.length; i++){
            arr[i] = -1;
        }

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(arr[ch - 'a'] == -1){
                arr[ch - 'a'] = i;
            }
        }

        for(int i=0; i<26; i++){
            System.out.print(arr[i]+" ");
        }




    }
    
}
