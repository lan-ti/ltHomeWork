package cn;
public class Demo1 {

    public static void main(String[] args) {
        //打印99乘法表
        print1();
        System.out.println("----------—--------------------------");
        //打印等腰三角形
        print2();
        System.out.println("----------—--------------------------");
        //计算1到100的素数和
        int n=10000000;
        long ans=calc(n);
        System.out.println("1到"+n+"的素数和是："+ans);
    }
    //打印99乘法表
    public static void print1(){
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" * "+i+" = "+i*j+"\t");
            }
            System.out.println();
        }
    }
    //打印等腰三角形
    public static void print2() {
        int n=9;//三角形的高
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++) System.out.print(" ");
            for(int j=1;j<=i*2-1;j++) System.out.print("*");
            System.out.println();
        }
    }
    //计算1到n的质数和
    public static long calc(int n){
        /**
         * 线性筛法，每个数字只被标记一次
         * 时间复杂度O(n)
         */
        long ans=0;//保存答案
        int[] v=new int[n+1]; //v[i]记录i的最小质因子 ，v[i]==i则i是质数
        int[] prime=new int[n+1];  //保存素数
        int number=0;//质数个数
        for(int i=2;i<=n;i++){
            if(v[i]==0){
                v[i]=i;
                prime[++number]=i;
                ans+=prime[number];
            }
            for(int j=1;j<=number;j++){
                if(prime[j]>v[i]||prime[j]>n/i) break;
                v[i*prime[j]]=prime[j];
            }
        }
        return ans;
    }
}
