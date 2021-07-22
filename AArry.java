import java.lang.*;
import java.util.*;

class Arry
{
    private int no;

    public Arry(int no)
    {
        this.no=no;
    }

    public String toString()
    {
        return " "+this.no;
    }

    public void even()
    {
        if(this.no%2==0)
        {
            System.out.print(" "+no);
        }
    }

    public void odd()
    {
        if(this.no%2!=0)
        {
            System.out.print(" "+no);
        }
    }
}
// arry 
public class AArry 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of element in arry 1:");
        int l= sc.nextInt();
        Arry arr1[] = new Arry[l];
        
        int m1=0,n1=0;

       System.out.print("Enter Array 1 Elements : ");
       for(int i=0; i<l; i++)
       {
            int m=sc.nextInt();
            arr1[i]=new Arry(m);
            m1=m;
       }
        System.out.println("enter the no of element in arry 2:");
        int k= sc.nextInt();
        Arry arr2[] = new Arry[k];


       System.out.print("Enter Array 2 Elements : ");
       for(int i=0; i<k; i++)
       {
            int n=sc.nextInt();
            arr2[i]=new Arry(n);
            n1=n;
       }
       Arry merge[] = new Arry[l+k];
       System.out.println("After Merging Array Element");      
       for(int i=0;i<l+k;i++)
       {
         if(i<m1)
         {
           merge[i]=arr1[i];
         }
         else 
         {
           merge[i]=arr2[i-m1];
         }
         System.out.println(merge[i]); 
       }
       System.out.println("Spilt Array :");
        System.out.println("Even Numb\n");
        for(int i=0;i<l+k;i++)
        {
            merge[i].even();
        }
        System.out.println("\nOdd numb:\n");
        for(int i=0;i<l+k;i++)
        {
            merge[i].odd();
        }
    }
}