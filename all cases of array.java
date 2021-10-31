import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
    static void insertsort(int arr[],int n,int e){
        if(n==arr.length)
        System.out.println("overflow");
        else 
        {
        int i; 
        for(i=0;i<n;i++)
        {
            if(e<arr[i])
            {
                break;
            }
        }
        int j;
        for(j=n-1;j>=i;j--)
        {
            arr[j+1]=arr[j];
        }
        arr[j+1]=e;
        n++;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    static void delete(int arr[],int n,int index){
        if(index>=arr.length || n==0)
        System.out.println("Invalid index / underflow");
        else 
        {
        if(index==n-1)
        n--;
        else{
        for(int i=index;i<n;i++)
        {
            arr[i]=arr[i+1];
        }
        n--;
        }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    static void addspecific(int arr[],int n,int e,int index){
        if(index>=arr.length || n==arr.length)
        System.out.println("Invalid index / overflow");
        else 
        {
        for(int i=n-1;i>=index;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[index]=e;
        n++;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    static void addlast(int arr[],int n,int e){
        if(n==arr.length)
        System.out.println("overflow");
        else 
        {
        arr[n]=e;
        n++;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    static void addfirst(int arr[],int n,int e){
        if(n==arr.length)
        System.out.println("overflow");
        else 
        {
        for(int i=n-1;i>=0;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[0]=e;
        n++;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args)
    {
        // Write your code here
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Add at first index");
        System.out.println("2. Add at last index");
        System.out.println("3. Add at specific index");
        System.out.println("4. Insert the element in sorted array");
        System.out.println("5. Delete from specific index");
        int n=sc.nextInt();
        int arr[]=new int[n+5];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            {
            int e=sc.nextInt();    
            addfirst(arr,n,e);
            }
            break;
            case 2:
            {
            int e=sc.nextInt();    
            addlast(arr,n,e);
            }
            break;
            case 3:
            {
            int e=sc.nextInt();
            int index=sc.nextInt();    
            addspecific(arr,n,e,index);
            }
            break;
            case 4:
            {
                int e=sc.nextInt();
                insertsort(arr,n,e);
            }
            break;
            case 5:
            {
                int index=sc.nextInt();
                delete(arr,n,index);
            }
            break;
        }
        
    }

}