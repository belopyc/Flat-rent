import java.util.Scanner;

public class FlatRent{

    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);
 	System.out.println(" Flat rent ");
	System.out.println("Enter amount of days ");
        int days = in.nextInt();
	int payment = 0;

	if(days < 5) payment = days * 40;

	if((days > 4)&&(days < 7)) 
	{
		payment = days * 40;
		payment = payment - 20;
	}
	if(days >= 7) 
	{
		payment = days * 40;
		payment = payment - 50;
	}
	System.out.println(" Pyment is:" + payment );
	
	}
}