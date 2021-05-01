import java.lang.*;
import java.util.*;

class Add
{
    private String str;

    public Add(String str)
    {
        this.str=str;
    }

    public String toString()
    {
        return " "+this.str;
    }

    // public void even()
    // {
       
    // }

    public void odd()
    {
        if((this.str).indexOf(str)%2!=0)
        {
            System.out.print(str+" ");
        }
    }

    // public char charAt(int i) {
    //     return 0;
    // }
}

public class SpiltingArray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Add arr1[] = new Add[3];
        Add arr2[] = new Add[4];
        Add merge[] = new Add[7];
        String m1="",n1="";

       System.out.println("Enter Array 1 Elements : ");
       for(int i=0; i<arr1.length; i++)
       {
            String m=sc.next();
            arr1[i]=new Add(m);
            m1=m;

       }

       System.out.println("Enter Array 2 Elements : ");
       for(int i=0; i<arr2.length; i++)
       {
            String n=sc.next();
            arr2[i]=new Add(n);
            n1=n;
       }
       System.out.println("After Merging Array Element");
       String str1=" ",str2=" ";
        int vc1=0,vc2=0;


       for(int i=0;i<=(m1.length()+n1.length());i++)
       {
         if(i<m1.length())
         {
           merge[i]=arr1[i];
         }
         else 
         {
           merge[i]=arr2[i-m1.length()];
         }
         System.out.println(i+" "+merge[i]); 
         
       }


       for(int i=0;i<=merge.length;i++)
       {
        char ch=(m1+n1).charAt(0);      
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
        {
            vc1=vc1+1;
            str1=str1+m1.length()+n1.length()+" ";
        }
        else
        {
            vc2=vc2+1;
            str2=str2+m1.length()+n1.length()+" ";
        }     
       }
       System.out.println("String start with vowel is : "+str1);
       System.out.println("Count of Vowel is : "+vc1);
       System.out.println("String start with Consonant is : "+str2);
       System.out.println("Count of Consonant is : "+vc2);    
     
    }
}
