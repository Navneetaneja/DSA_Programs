import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
        // Write your code here
        String s="Welcome To Kurukshetra";
        String arr[]=s.split(" ");
        for(int i=arr.length-1;i>=0;i--)
        {
            if(i==0)
            System.out.println(arr[i]);
            else
            System.out.print(arr[i]+" ");
        }
    }
    }