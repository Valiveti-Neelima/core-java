import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
       Scanner sc=new Scanner(System.in);
       System.out.println("The number must be 4 digit number");
       int number=sc.nextInt();
       int rem,sum=0,count=0;
       int n=number;
       while(n>0)
       {
           n/=10;
           count+=1;
       }
       if(count==4)
       {
           
        while(number>0)
               {   
                 rem=number%10;
                 sum+=rem;
                 number/=10;
               }
         System.out.println("The sum of all digits entered is"+" "+sum);
       }
       else 
       {
           System.out.println("please enter 4 digit number");
       }
       
	}
}

