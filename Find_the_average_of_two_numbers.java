import java.util.Scanner;
class S
{
    public static void main(String[] args)
    {
        int a,b;
        double res;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        res=(a+b)/2.0;
        System.out.printf("%.4f",res);
    }
}