import java.lang.*;
import java.util.*;

class Charat
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        String []arr=new String[10];
        System.out.println("Enter the names :");
        int m=arr.length;
        for(int i=0;i<m;i++)
        {
            arr[i]=sc.nextLine();
        }
        // System.
        //    System.out.print(arr[i]+", ");
        // }
       
        System.out.println("String start with vowels :");
        int v=0;
        for(int i=0;i<m;i++)
        {
            char ch=arr[i].charAt(0);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch== 'o' || ch == 'u') 
            {
                v++;
                System.out.println(arr[i]);
            }
        }
        System.out.println("Total Vowel "+v);

        System.out.println("String start with consonants :");
        int c=0;
        for(int i=0;i<m;i++)
        {
            char chh=arr[i].charAt(0);
            if(chh != 'a' && chh != 'e' && chh != 'i' && chh != 'o' && chh != 'u') 
            {
              c++;
              System.out.println(arr[i]);
            }
        }
        System.out.println("Total Consonant : "+c);
    }
}