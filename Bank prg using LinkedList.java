import java.util.Scanner;
class Node 
{
    String name;
    int accno;
    int amount;
    Node next;
}
class Main
{
    static Scanner sc=new Scanner(System.in);
    static int count=100;
    static Node start=null;
    static void createAccount()
    {
        if(start==null)
        count=100;
        System.out.println("Enter Your Name");
        String name=sc.next();
        count++;
        Node createAcc=new Node();
        createAcc.name=name;
        createAcc.accno=count;
        createAcc.amount=0;
        if(start==null)
        {
        start=createAcc;
        }
        else{
            Node ptr=start;
            while(ptr.next!=null)
            {
                ptr=ptr.next;
            }
            ptr.next=createAcc;
            
        }
        createAcc.next=null;
    }
    static void display()
    {
        Node ptr=start;
        if(ptr==null)
        System.out.println("No accounts");
        while(ptr!=null)
        {
            System.out.println("Name : "+ptr.name+"\t AccountNO : "+ptr.accno+"\t Amount : "+ptr.amount);
            ptr=ptr.next;
        }
    }
    static void search()
    {
        System.out.println("Enter Account No to Search (if don't know press '0')");
        int ch=sc.nextInt();
        if(ch!=0)
        {
            Node ptr=start;
            while(ptr!=null)
            {
                if(ptr.accno==ch)
                {
                    System.out.println("Name : "+ptr.name+"\t AccountNO : "+ptr.accno+"\t Amount : "+ptr.amount);
                    break;
                }
                ptr=ptr.next;
            }
            if(ptr==null)
            System.out.println("Not found");
        }
        else{
            System.out.println("Enter your name");
            String s=sc.next();
            Node ptr=start;
            int flag=0;
            while(ptr!=null)
            {
                if((ptr.name).equals(s))
                {
                    flag=1;
                    System.out.println("Name : "+ptr.name+"\t AccountNO : "+ptr.accno+"\t Amount : "+ptr.amount);
                }
                ptr=ptr.next;
            }
            if(flag==0)
            System.out.println("Not found");
        }
        
    }
    static void deposit()
    {
        System.out.println("Enter your account no (if don't know go to search account first by pressing '0')");
        int ch=sc.nextInt();
        if(ch==0)
        {
            search();
        }
        else{
            System.out.println("Enter Amount");
            int amt=sc.nextInt();
            Node ptr=start;
            while(ptr!=null)
            {
                if(ptr.accno==ch)
                {
                    ptr.amount+=amt;
                    System.out.println("Name : "+ptr.name+"\t AccountNO : "+ptr.accno+"\t Amount : "+ptr.amount);
                    break;
                }
                ptr=ptr.next;
            }
            if(ptr==null)
            System.out.println("account not found");
        }
        
    }
    static void withdraw()
    {
        System.out.println("Enter your account no (if don't know go to search account first by pressing '0')");
        int ch=sc.nextInt();
        if(ch==0)
        {
            search();
        }
        else{
            System.out.println("Enter Amount to withdraw");
            int amt=sc.nextInt();
            Node ptr=start;
            while(ptr!=null)
            {
                if(ptr.accno==ch)
                {
                    if(ptr.amount>=amt)
                    {
                        ptr.amount-=amt;
                        System.out.println("Name : "+ptr.name+"\t AccountNO : "+ptr.accno+"\t Amount : "+ptr.amount);
                        break;
                    }
                    else{
                        System.out.println("Insufficient Balance");
                        break;
                    }
                }
                ptr=ptr.next;
            }
            if(ptr==null)
            System.out.println("account not found");
        }
    }
    static void close()
    {
        System.out.println("Enter account no");
        int acc=sc.nextInt();
        Node ptr=start;
        Node prev=null;
        while(ptr!=null)
        {
            if(ptr.accno==acc)
            {
                System.out.println("Name : "+ptr.name+"\t AccountNO : "+ptr.accno+"\t Amount : "+ptr.amount);
                if(prev==null)
                {
                    start=start.next;
                    ptr.next=null;
                    System.out.println("account deleted !!");
                    break;
                }
                else{
                    prev.next=ptr.next;
                    System.out.println("account deleted !!");
                    break;
                }

            }
            prev=ptr;
            ptr=ptr.next;
        }
        if(ptr==null)
        System.out.println("account not found");
    }
    public static void main(String[] args)
    {
        // Write your code here
        System.out.println("1. Create New Account \t 2. Display All Accounts \t 3. Search Account \t 4.Deposit Amount");
        System.out.println("5. Withdraw Amount \t 6. Close Account \t 0. Exit");
        int choice=sc.nextInt();
        do{
        switch(choice)
        {
            case 1:
                createAccount();
                break;
            case 2:
                display();
                break;
            case 3:
                search();
                break;
            case 4:
                deposit();
                break;
            case 5:
                withdraw();
                break;
            case 6:
                close();
                break;
            case 0:
                return;
                
        }
        System.out.println("1. Create New Account \t 2. Display All Accounts \t 3. Search Account \t 4.Deposit Amount");
        System.out.println("5. Withdraw Amount \t 6. Close Account \t 0. Exit");
        choice=sc.nextInt();
        }while(choice!=0);

    }
}