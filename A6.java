public class A6
{
	public static void main(String[] args) {
		
      int a[]={34,67,89,43,454};
      int len=a.length;
      int max=a[0];
      for(int i=1;i<len;i++)
      {
          if(a[i]>max)
          {
              max=a[i];
              
          }
      }
      System.out.println(max);
	}
}

