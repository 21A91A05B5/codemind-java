import java.util.Scanner;
class Durga
{
    public static void main(String[] args)
    {
        int a,b,c;
        double s,p,A;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        s=(a+b+c)/2.0;
        p=s*(s-a)*(s-b)*(s-c);
        A=Math.sqrt(p);
        System.out.printf("%.2f",A);
    }
}