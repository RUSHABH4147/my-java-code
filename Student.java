import java.lang.*;
import java.util.*;

class Sorting{
    private String nm;
    private int per;
    
    public Sorting(String nm ,int per){
        this.nm=nm;
        this.per=per;
    }

    public String getNM() {
        return nm;
    }

    public int getPer(){
        return per;
    }

    public String toString(){
        return "name: "+this.nm+"| percentage: "+this.per ;
    }
        
}

public class Student {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Please Enter how many names you want to sort:");
        int k=sc.nextInt();
        Sorting[] a = new Sorting[k];
        
        System.out.println("Please Enter random name to sort");
        for(int i=0;i<k;i++)
        {
            System.out.println("Please Enter name to ");
            String nm=sc.next();
            System.out.println("Please Enter percentage:");
            int per=sc.nextInt();
            a[i]=new Sorting(nm, per);
        } 
        
        
        System.out.println("|||||||||| SORTING LIST in order of name  ||||||||||");
           
        // int m=this.a1.length;
            Sorting temp;
            for(int i=0;i<a.length;i++)
            {
            for(int j=i+1;j<a.length;j++)
            {if(a[i].getNM().compareTo(a[j].getNM())>0){
                     temp= a[i];
                      a[i]=a[j];
                      a[j]=temp;
            }
            }
            }
            for(int i=0;i<a.length;i++)
            {
                System.out.println( a[i]);
    
            }
        System.out.println("|||||||||| SORTING LIST in order of percentage ||||||||||");
        
            Sorting tem;
            for(int i=0;i<a.length;i++)
            {
            for(int j=0;j<a.length;j++)
            {if(a[i].getPer()<a[j].getPer()){
                tem=a[i];
                a[i]=a[j];
                a[j]=tem;
            }
            }
            }
            for(int i=0;i<a.length;i++)
            {
                System.out.println(a[i]);
    
            } 
        }

        }
        // String temp="";
        
        
        
        
    
        
        
            

