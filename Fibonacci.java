import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        int n,a=0,b=1,c;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}
