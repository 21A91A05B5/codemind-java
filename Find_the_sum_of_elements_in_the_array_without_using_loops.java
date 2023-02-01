import java.util.Scanner;
class S
{
    public static void main(String[] args)
    {
        int s=0;
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int [] arr=new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            s+=arr[i];
        }
        System.out.println(s);
    }
}
