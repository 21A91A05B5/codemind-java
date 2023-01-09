import java.util.Scanner;
class S
{
    public static void main(String[] args)
    {
        int n,arr[];
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=n-1;i>n/2-1;i--)
        {
            System.out.printf("%d ",arr[i]);
        }
        for(int i=0;i<n/2;i++)
        {
            System.out.printf("%d ",arr[i]);
        }
    }
}