import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
        String s="b12_45bc_";
        char f=s.charAt(0);
        if((f>=65 && f<=90) || (f>=97 && f<=122) )
        {
            int flag=0;
            for(int i=1;i<s.length();i++)
            {
                char ch=s.charAt(i);
                if((ch>=65 && ch<=90) || (ch>=97 && ch<=122) || (ch>=48 && ch<=57) || (ch==95))
                flag=1;
                else
                {
                flag=0;
                break;
                }
            }
            if(flag==1)
            System.out.println("valid");
            else
            System.out.println("Invalid");
        }
        else
        System.out.println("Invalid");
        // Write your code here
    }
    }