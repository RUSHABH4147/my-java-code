import java.util.*;

class Item
{
    private String nm;
    private int up,qty,pr,dis,netpr;
    
    static int totbill;

    public int getDis(){
        return dis;
    }

    public Item(String nm,int up,int qty)
    {
        this.nm=nm;
        this.up=up;
        this.qty=qty;
    }

    void compute()
    {
        pr=this.up*this.qty;
        dis= (int) (pr * .05F);
        netpr=pr-dis;

        totbill=totbill+netpr;
    }

    void display()
    {
        System.out.println(this.nm+"\t\t"+this.up+"\t\t"+this.qty+"\t\t"+pr+"\t\t"+dis+"\t\t"+netpr);    
    }

    public static void displaybill()
    {  
        System.out.println("\t\t\t\t\tTotal bill computed : "+totbill+" /-Rs.");
    }
}

class Bill
{

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        Item it[]=new Item[5];
        int diss=0;
        System.out.println("How many items u baught ?:");
        int n=sc.nextInt();

        


        for(int i=0;i<n;i++)
        {
            System.out.println("enter item name :");
            String str=sc.next();
            System.out.println("Enter unit price :");
            int u=sc.nextInt();
            System.out.println("Enter Quantity :");
            int q=sc.nextInt();
            it[i]=new Item(str,u,q);
            it[i].compute();
            diss+=it[i].getDis();
        }  
        System.out.println("bill for :"+n+" items is :");
        System.out.println("***********************************************************************************");
        
        System.out.println("Srno:\tItem Name:\tUnit Price:\tQuantity:\tPrice:\t  Discount:\t  Netprice:");
        for(int i=0;i<n;i++)
        {
            System.out.print(i+1+"\t");
            it[i].display();
        }
        
        System.out.println("***********************************************************************************");
         System.out.println("\t\t\t\t\t discount is:"+diss);
         Item.displaybill();
    }
}
