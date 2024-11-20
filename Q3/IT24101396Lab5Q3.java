import java.util.Scanner;
public class IT24101396Lab5Q3 {
	public static void main (String [] args)
{
	final double ROOM_CHARGE_PER_DAY = 48000.00;
	final double DISCOUNT_3_TO_4_DAYS = 0.1;
	final double DISCOUNT_5_OR_MORE_DAYS = 0.2;
	
int startD,endD,reservedD;
double amountbeforeDiscount, discountAmount, totalToBePaid;
double discountRate= 0;
Scanner input = new Scanner (System.in);

System.out.print("Enter start date (1-31): ");
startD = input.nextInt();
System.out.print("Enter end date (1-31): ");
endD = input.nextInt();
 
if(startD<1 || startD>31 || endD<1 || endD>31) {
System.out.println("Error: Days must be between 1 and 31 ");
return;
}
if(startD >= endD){
	System.out.println("Error: Strat date must be less than end date ");
	return;
}
reservedD = endD - startD;

if(reservedD>=3 && reservedD<=4) {	
	discountRate=DISCOUNT_3_TO_4_DAYS;
}
else{ 
	if(reservedD>=5) {
	discountRate = DISCOUNT_5_OR_MORE_DAYS;
}
}

amountbeforeDiscount=reservedD*ROOM_CHARGE_PER_DAY;
discountAmount= amountbeforeDiscount*discountRate;
totalToBePaid = amountbeforeDiscount - discountAmount;
 
System.out.println("Room charge Per Day:Rs. "+ ROOM_CHARGE_PER_DAY+"/=");
System.out.println("Number of days reserved: "+ reservedD);
System.out.println("Total amount to be paid: "+ totalToBePaid);

	 
}
}
