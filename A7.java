public class Main
{   
   public static void main(String[] args) {
	    int num=5;
	    int ans=fact(num);
	    System.out.println("factorial of a given number is"+ " "+ans);
   }
	    static int fact(int n)
       {
		    if(n==1 ||n==0)
		       return 1;
		    else
		       return n*fact(n-1);
		}
	
}
