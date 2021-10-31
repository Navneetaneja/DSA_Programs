import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[]{4,7,3,1,8,2,6};
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        System.out.println(arr[arr.length-n]);
    }
    }