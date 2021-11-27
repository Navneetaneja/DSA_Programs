/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
    static boolean isPrime(long n)
    {
        if(n==1)
        return false;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            return false;
        }
        return true;
    }
    static boolean check(long n)
    {
        if(isPrime(n))
        return true;
        for(int i=2;i<=Math.sqrt(n);i++)
        {
            if(isPrime(i))
            {
                if(n%i==0)
                return true;
            }
        }
        return false;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(check(Math.abs(a-b)))
		{
		    System.out.println("YES");
		}
		else
		System.out.println("NO");
	}
}
