import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
        // Write your code here
        int arr[]=new int[]{8,9,8,2,8,5,9};
        for(int i=0;i<arr.length;i++)
        {
            int k=arr[i],ct=0,flag=0;
            for(int j=0;j<i;j++)
            {
                if(arr[j]==k)
                {
                    flag=1;
                    break;
                }
            }
            if(flag==1)
            continue;
            for(int l=0;l<arr.length;l++)
            {
                if(arr[l]==k)
                ct++;
            }
            System.out.println(arr[i]+" "+ct);
        }
    }
}