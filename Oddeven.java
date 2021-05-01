import java.lang.*;
import java.util.*;

class Oddeven{
    
    public static void main(String []args){
         int n1 ;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the  first number:");
        n1=sc.nextInt();
        // System.out.println("enter the  second number:");
        // n2=sc.nextInt();
        if(n1%2==0){
        System.out.println(" number is even:"+n1);}
        else
        {
        System.out.println("number is odd:"+n1);

        }




    }
}