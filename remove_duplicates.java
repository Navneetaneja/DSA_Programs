
// Other imports go here
// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
        // remove all 8's
        int arr[]=new int[]{8,8,9,8,8,5,6,7,8,4,3,8,2,8,1};
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==8)
            {
                for(int j=i;j<n-1;j++)
                {
                    arr[j]=arr[j+1];
                }
                n--;
                i=-1;
            }

        }
        for(int i=0;i<n;i++)
        System.out.println(arr[i]);


    }
    }