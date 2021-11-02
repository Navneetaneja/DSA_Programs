/* To purchase MAX products  with max cashback */
import java.util.*;

class Product
{
    String name;
    int cost;
    int cashback;
    double profit_per_cost;
    Product(String name,int cost,int cashback)
    {
        this.name=name;
        this.cost=cost;
        this.cashback=cashback;
        this.profit_per_cost=Math.round((double)cashback/cost * 100.0)/100.0;
    }
}
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc=new Scanner(System.in);
		ArrayList<Product> arr=new ArrayList<>();
		int n=7;
		int totalamt=sc.nextInt();
		int weight[]=new int[]{2,3,5,7,1,4,1};
		int prof[]=new int[]{10,5,15,7,6,18,3};
		for(int i=0;i<n;i++)
		{
		    arr.add(new Product("P"+(i+1),weight[i],prof[i]));
		}
// 		for(int i=0;i<arr.size();i++)
// 		{
// 		    System.out.println(arr.get(i).name+" "+arr.get(i).cost+" "+arr.get(i).cashback+" "+arr.get(i).profit_per_cost);
// 		}
		
		Collections.sort(arr,new Comparator<Product>(){
		    @Override
		    public int compare(Product a,Product b)
		    {
		        if(a.profit_per_cost>b.profit_per_cost)
		        return -1;
		        else if(a.profit_per_cost<b.profit_per_cost)
		        return 1;
		        else if(a.profit_per_cost==b.profit_per_cost)
		        {
		            if(a.cost<b.cost)
		            return -1;
		            else if(a.cost>b.cost)
		            return 1;
		            else
		            return 0;
		        }
		        else
		        return 0;
		    }
		});
		
// 		for(int i=0;i<arr.size();i++)
// 		{
// 		    System.out.println(arr.get(i).name+" "+arr.get(i).cost+" "+arr.get(i).cashback+" "+arr.get(i).profit_per_cost);
// 		}
		
		double profit=0;
		for(int i=0;i<arr.size();i++)
		{
		    Product temp=arr.get(i);
		    if(temp.cost<=totalamt)
		    {
		        totalamt=totalamt-temp.cost;
		        profit+=temp.cashback;
		        System.out.println(temp.name+" "+profit);
		    }
		    else
		    {
		        profit=profit+temp.cashback * (double)totalamt/temp.cost;
		        totalamt=0;
		        System.out.println(temp.name+" "+profit);
		        break;
		    }
		}

	}
}
