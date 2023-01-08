import java.util.Scanner;
class S
{
    public static void main(String[] args)
    {
        double C,F;
        Scanner sc=new Scanner(System.in);
        C=sc.nextDouble();
        F=(32+(C*9/5));
        System.out.printf("%.2f",F);
    }
}