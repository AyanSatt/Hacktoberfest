
 import java.util.Scanner;
class Sum_of_digits {
 
    
    static int getSum(int n)
    {
        int sum = 0;
 
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
 
        return sum;
    }
 
    public static void main(String[] args)
    {
        int n ;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	n=sc.nextInt();
 
        System.out.println(getSum(n));
    }
}