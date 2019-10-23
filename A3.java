import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
       Scanner sc=new Scanner(System.in);
       int minutes=sc.nextInt();
	   System.out.println("minutes in days"+minutes/(24*60));
	   System.out.println("minutes in years"+minutes/(365*24*60));
	}
}
