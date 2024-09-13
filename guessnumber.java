import java.util.Scanner;
import java.util.Random;
class GuessNumber
{
public static void main(String arg[])
{
Scanner sc= new Scanner(System.in);
Random rm=new Random();
int count;
int number= rm.nextInt(100)+1;
for(count=1;count<=5;count++)
{
	System.out.println("Enter your Guess");
	int guess= sc.nextInt();
	if(number==guess)
	{
		System.out.println(" good job ! the number was" +number);
		break;
	}
	else if(guess > number)
	{
	System.out.println("your to higher than number");
	}
	else if(guess < number)
	{
	System.out.println("Your to lower than number");
	}
	else
	{
	System.out.println("Sorry the number is "+number);
	}
		
if(count==5)
{
System.out.println("Sorry Your moves are over! the number is " +number);
}
}

}
}