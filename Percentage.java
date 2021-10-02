import java.util.Scanner;
class Primerange
{
   public static void main(String args[])
   {		
	int temp;
        int range;
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter any number:");


	int num=scan.nextInt();
        scan.close();
        int temp;
        int range;
	for(int i=1;i<=range;i++)
	{
	for(int j=2;j<=num/2;j++)
	{
           	temp=num%i;
	  
	}
		if(temp==0)
		{
			System.out.println(i);
  		 }
	}
 }

}
