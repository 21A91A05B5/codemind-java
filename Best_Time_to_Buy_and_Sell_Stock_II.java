import java.util.Scanner;
class S
{
    public static void main(String[] args)
    {
        int n;
        int s=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int [] arr=new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<n;i++)
        {
            if(arr[i]-arr[i-1]>0)
            {
                s+=arr[i]-arr[i-1];
            }
        }
        System.out.println(s);
    }
}