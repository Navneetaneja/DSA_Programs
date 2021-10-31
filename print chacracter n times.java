import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
        String s="a12b10c9";
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);int k=i;
            for(int j=i+1;j<s.length();j++)
            {
                k=j;
                if(s.charAt(j)>=97 && s.charAt(j)<=122)
                {
                    break;
                }
            }
            String sub;
            if(k==s.length()-1)
            sub=s.substring(i+1,k+1);
            else
            sub=s.substring(i+1,k);
            int t=Integer.parseInt(sub);
            while(t-->0)
            {
                System.out.print(ch);
            }
            if(k==s.length()-1)
            i=k;
            else
            i=k-1;
        }
        // System.out.println("Invalid");
        // Write your code here
    }
    }