import java.lang.*;
import java.util.*;





class sorting{
    private String[] a1;
    
    public sorting(String[] a1){
        this.a1=a1;

    }

    void arr() {
        int m=this.a1.length;
        for(int i=0;i<m;i++)
        {
        for(int j=i+1;j<m;j++)
        {if(a1[i].compareTo(a1[j])>0){
           String temp=a1[i];
            a1[i]=a1[j];
            a1[j]=temp;
        }
        }
        }
        for(int i=0;i<m;i++)
        {
            System.out.println( a1[i]);

        }
    }
        


}





public class Sortingchar {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String []a1= new String[5]; 
        System.out.println("Please Enter how many numb you want to sort:");
        int k=sc.nextInt();
        
        System.out.println("Please Enter random numb to sort");
        for(int i=0;i<k;i++)
        {
          a1[i]=sc.nextLine();
        } 
        
        
        System.out.println("|||||||||| SORTING LIST IS ||||||||||");
        sorting a=new sorting(a1);
        a.arr();
        // String temp="";
        
        
        
        
    }
        
        }
            

