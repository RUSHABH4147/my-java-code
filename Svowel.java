import java.lang.*;
import java.util.*;
class vowels {
 private String []a1;
 private String []a2;
 private String [] mer;

 public vowels(String[] a1, String[] a2, String[] mer) {
   this.a1=a1;
   this.a2=a2;
   // this.arr1=arr1;
   this.mer=mer;
 }
int Merge(){
   int m=this.a1.length;
   int n=this.a2.length;
   int i;
   System.out.println("After Merging");
   for(i=0;i<m+n;i++)
     {
       if(i<m)
       {
       mer[i]=this.a1[i];
       }
       else
       {
         mer[i]=this.a2[i-m];
       }
       System.out.println(mer[i]);
     }
     return 0;
 }
 int Spilt(){
   int i;
   //int j;
   int m=this.mer.length;
   char st;
   int count=0,con=0;
   System.out.println("The Vowels>");
   for(i=0;i<m;i++){
     // {
       st=mer[i].charAt(0);
       if(st == 'a' || st == 'e' || st == 'i' || st == 'o' || st == 'u') {
       
         count++;
         System.out.println(mer[i]);
       // }
     }
   }  
   System.out.println("The Vowels in String is"+count);
   System.out.println("The Consonant are:");
   for(i=0;i<m;i++){
       st=mer[i].charAt(0);
       if(st != 'a' && st != 'e' && st != 'i' && st != 'o' && st != 'u') {
       
         con++;
         // System.out.println(str);
         System.out.println(mer[i]);
       // }
     }
   }  
   System.out.println("The Consonant in the String is="+con);      
   
   return 0;
 }
}
public class Svowel {
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
     String []a1=new String[5];
     String []a2=new String[5];
     String []mer=new String[10];
     int i=0;
     int m=a1.length;
     int n=a2.length;
     System.out.println("Please Enter First String");
     for(i=0;i<m;i++)
     {
       a1[i]=sc.nextLine();
     }
     System.out.println("Please Enter Second String");
     for(i=0;i<n;i++)
     {
       a2[i]=sc.nextLine();
     }

     // {
        vowels pro=new vowels(a1,a2,mer);
     pro.Merge();
     pro.Spilt();
   }
 }
    

