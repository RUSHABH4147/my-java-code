import java.lang.*;
import java.util.*;



class sort{
    private int[] a1;
    
    public sort(int[] a1){
        this.a1=a1;

    }

    int arr(){
        int temp=0;
        int m=this.a1.length;
        for(int i=0;i<m;i++)
        {
        for(int j=0;j<m;j++)
        {if(a1[i]<a1[j]){
            temp=a1[i];
            a1[i]=a1[j];
            a1[j]=temp;
        }
        }
        }
        for(int i=0;i<m;i++)
        {
            System.out.println(a1[i]);

        } 
        return 0;
    }


}

class Sortingint{
public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
int []a1= new int[5]; 
System.out.println("Please Enter how many numb you want to sort:");
int k=sc.nextInt();

System.out.println("Please Enter random numb to sort");
for(int i=0;i<k;i++)
{
  a1[i]=sc.nextInt();
} 


System.out.println("|||||||||| SORTING LIST IS ||||||||||");
sort a=new sort(a1);
a.arr();

}
}
