import java.util.Scanner;
class S
{
    public static void main(String[] args)
    {
        int n,res;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        res=n*(n-1)/2;
        System.out.printf("%d",res);
    }
}