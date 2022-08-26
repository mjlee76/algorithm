package 백준.문자열;

import java.util.*;

public class 단어공부 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toUpperCase();

        int[] arr = new int[26];

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int k = ch - 'A';
            arr[k] += 1;
        }
        
        int max = arr[0];
        int index = 65;
        int count = 0;
        for(int i=1; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
                count = 0;
                index += i;
            } 
            else if(arr[i]==max){
                count++;
            }
        }
        if(count == 0) System.out.print((char)index);
        else System.out.print("?");
    }
    
}
