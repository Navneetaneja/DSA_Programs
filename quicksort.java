import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
    static void quicksort(int arr[],int lb,int ub)
    {
        int left=lb,right=ub,loc=left;
        if(lb>=ub)
        return;
        while(left<right)
        {
            while(arr[loc]<arr[right])
            {
                right--;
            }
            int t=arr[loc];
            arr[loc]=arr[right];
            arr[right]=t;
            loc=right;
            while(arr[loc]>arr[left])
            {
                left++;
            }
            t=arr[loc];
            arr[loc]=arr[left];
            arr[left]=t;
            loc=left;
        }
        quicksort(arr,lb,loc-1);
        quicksort(arr,loc+1,ub);
    }
    public static void main(String[] args)
    {
        int arr[]=new int[]{15,10,17,19,2,8,12,16,25,18};
        quicksort(arr,0,arr.length-1);
        // Write your code here
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    }