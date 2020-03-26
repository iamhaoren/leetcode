package 剑指offer;

public class 斐波那契数列 {
    //递归
    public int Fibonacci(int n) {
        if(n<=2){
            if(n==0)
                return 0;
            return 1;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }

    //简单的动态规划
    public int Fibonacci2(int n) {
        if(n==0)
            return 0;
        int p1=1,p2=1;
        while(n>2){
            p2+=p1;
            p1=p2-p1;
            n--;
        }
        return p2;
    }
    //标准的动态规划
    public  int[] record = null;
    public int Fibonacci3(int n){
        if(n<=1){
            return n;
        }
        if(null == record){
            record = new int[n+1];
        }
        if(record[n]!=0)
            return record[n];
        else{
            int result=Fibonacci(n-2)+Fibonacci(n-1);
            record[n]=result;
            return result;
        }
    }
}
