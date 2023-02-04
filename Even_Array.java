import java.util.Scanner;
class S
{
    public static void main(String[] args)
    {
        int n;
        int c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int [] arr=new int [n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                c+=1;
            }
        }
        if(c==n)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}