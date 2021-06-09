import java.util.Scanner;
class Count_Of_Numbers
{
public static void main(String[] args)
{
 Scanner s = new Scanner(System.in);
  System.out.println("enter a number:");
  int n = s.nextInt();
   int temp = 0;
   while(n!=0)
{
   n = n/10;
   temp++;
}
System.out.println("no of deigits = "+temp);
}
}