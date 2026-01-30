import java.util.*;
class solution
{
  public static void main(String args[])
  {
      int printvalue=1;
      Scanner s=new Scanner(System.in);
      System.out.println("enter Number: ");
      int n=s.nextInt();
      for(int i=1;i<=n;i++)
      {
          printvalue=i%2==0?0:1;
          for(int j=1;j<=i;j++)
          {
              System.out.print(printvalue+ " ");
              printvalue=(printvalue==0?1:0);
          }
          System.out.println();
      }
  
    }
}
