import java.util.Scanner;
class S
{
    public static void main(String[] args)
    {
        int n,k,arr[],c=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(arr[i]%k==0)
            {
                c+=1;
            }
        }
        System.out.println(c);
    }
}