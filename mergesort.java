import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
    static void merge(int arr[],int lb,int mid,int ub)
    {
        int n1=mid-lb+1;
        int n2=ub-mid;
        int temp[]=new int[n1+n2];
        int i=lb,j=mid+1,k=0;
        while(i<=mid && j<=ub)
        {
            if(arr[i]<arr[j])
            {
                temp[k]=arr[i];
                i++;k++;
            }
            else
            {
                temp[k]=arr[j];
                k++;j++;
            }
        }
        while(i<=mid)
        {
            temp[k]=arr[i];
            i++;
            k++;
        }
        while(j<=ub)
        {
            temp[k]=arr[j];
            j++;
            k++;
        }
        k=0;
        for(i=lb;i<=ub;i++){
        arr[i]=temp[k];
        k++;
        }
    }
    static void mergesort(int arr[],int lb,int ub)
    {
        if(lb<ub)
        {
            int mid=(lb+ub)/2;
            mergesort(arr,lb,mid);
            mergesort(arr,mid+1,ub);
            merge(arr,lb,mid,ub);
        }
    }
    public static void main(String[] args)
    {
        int arr[]=new int[]{15,10,17,19,2,8,12,16,25,18};
        mergesort(arr,0,arr.length-1);
        // Write your code here
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    }