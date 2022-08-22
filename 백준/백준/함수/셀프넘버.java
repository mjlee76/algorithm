package 백준.함수;

public class 셀프넘버 {

    public static void main(String args[]){
        
        boolean[] num = new boolean[10001];
        for(int i=1; i<10001; i++){
            if(num[i] == false){
                selfnumber(i, num);
                System.out.println(i);
            }
        }

    }
    public static void selfnumber(int n, boolean[] num){
        while(n<=10000){
            int sum = n;
            while(n>=1){
                sum += n % 10;
                n /= 10;
            }
            if(sum>10000)
                break;
            num[sum]=true;
            n=sum;
        }
    }
}
