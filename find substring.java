import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class Main
{
    public static void main(String[] args)
    {
        String str="aaaabbcccccaaadd";
        String sub="aaa";
        int n=sub.length(),ct=0;
        for(int i=0;i<str.length()-n;i++)
        {
            String s=str.substring(i,i+n);
            if(sub.equals(s))
            ct++;
        }
        System.out.println(ct);
        
    }
}