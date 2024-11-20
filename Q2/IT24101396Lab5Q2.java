import java.util.Scanner;
public class IT24101396Lab5Q2 {
	public static void main (String [] args)
{
int n;

Scanner input = new Scanner (System.in);

System.out.print("Enter the number of new customers introduced: ");
n = input.nextInt();

if(n<0)
{System.out.println("Input must be a number 0 or grater"); 
return; }
switch(n){
case 0:
	System.out.println("No prize"); 
	break;
case 1:
	System.out.println("prize is a : Pen"); 
	break;
case 2:
	System.out.println("prize is a : Umbrella"); 
	break; 
case 3:
	System.out.println("prize is a : Bag"); 
	break;
case 4:
	System.out.println("prize is a : Travelling chair"); 
	break;
default:
System.out.println("prize is a : Headphone"); }
	 
	
}
}
