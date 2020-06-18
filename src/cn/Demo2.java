package cn;

import java.util.Scanner;
public class Demo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=8;
        int[] array=new int[n]; //保存输入的数据
        int oddsum=0,evensum=0;//奇数个数，偶数个数
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
            if((array[i]&1)==1){   //奇数，位运算效率高，而且负数也是这个条件
                oddsum++;
            }else{
                evensum++;
            }
        }
        int[] oddarray=new int[oddsum];//奇数数组
        int[] evenarray=new int[evensum];//偶数数组
        int x=0,y=0;
        for(int i=0;i<n;i++){
            if((array[i]&1)==1){  //奇数
                oddarray[x++]=array[i];
            }else{
                evenarray[y++]=array[i];
            }
        }
        x=0;
        y=0;
        while(x<oddsum||y<evensum){
            if(x<oddsum){  //如果还有奇数，输出一个
                System.out.print(oddarray[x++]+" ");
            }
            if(y<evensum){  //如果还有偶数，输出一个
                System.out.print(evenarray[y++]+" ");
            }
        }

    }
}
